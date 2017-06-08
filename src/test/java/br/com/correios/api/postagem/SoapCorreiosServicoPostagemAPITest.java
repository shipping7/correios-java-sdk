package br.com.correios.api.postagem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.google.common.base.Optional;

import br.com.correios.api.converter.Converter;
import br.com.correios.api.exception.CorreiosServicoSoapException;
import br.com.correios.api.postagem.cliente.ClienteEmpresa;
import br.com.correios.api.postagem.cliente.ContratoEmpresa;
import br.com.correios.api.postagem.exception.CorreiosPostagemAutenticacaoException;
import br.com.correios.api.postagem.plp.DocumentoPlp;
import br.com.correios.api.postagem.webservice.CorreiosClienteApi;
import br.com.correios.api.postagem.xml.Correioslog;
import br.com.correios.api.postagem.xml.XmlPlpParser;
import br.com.correios.credentials.CorreiosCredenciais;
import br.com.correios.webservice.postagem.AutenticacaoException;
import br.com.correios.webservice.postagem.ClienteERP;
import br.com.correios.webservice.postagem.Exception_Exception;
import br.com.correios.webservice.postagem.SigepClienteException;

@RunWith(MockitoJUnitRunner.class)
public class SoapCorreiosServicoPostagemAPITest {

	@Mock
	private CorreiosCredenciais credenciais;
	@Mock(answer=Answers.RETURNS_DEEP_STUBS)
	private CorreiosClienteApi clienteAPI;
	@Mock
	private Converter<ClienteERP, ClienteEmpresa> clienteEmpresaConverter;
	@Mock
	private XmlPlpParser xmlPlpParser;
	@Mock
	private Converter<Correioslog, Optional<DocumentoPlp>> documentoPlpConverter;
	@Mock
	private ContratoEmpresa contratoEmpresa;
	@Mock
	private ClienteERP clienteERP;
	@Mock
	private ClienteEmpresa clienteEmpresa;
	@Mock
	private Correioslog correiosLog;
	@Mock
	private DocumentoPlp documentoPlp;

	private SoapCorreiosServicoPostagemAPI servicoPostagemAPI;

	@Before
	public void setUp() throws Exception {
		servicoPostagemAPI = new SoapCorreiosServicoPostagemAPI(credenciais, clienteAPI, clienteEmpresaConverter, xmlPlpParser, documentoPlpConverter);
		when(clienteAPI.getCorreiosWebService().buscaCliente(anyString(), anyString(), anyString(), anyString())).thenReturn(clienteERP);
		when(clienteEmpresaConverter.convert(clienteERP)).thenReturn(clienteEmpresa);
		when(clienteAPI.getCorreiosWebService().solicitaXmlPlp(anyLong(), anyString(), anyString())).thenReturn("xml");
		when(xmlPlpParser.convert(anyString())).thenReturn(Optional.of(correiosLog));
		when(documentoPlpConverter.convert(correiosLog)).thenReturn(Optional.of(documentoPlp));
		when(clienteAPI.getCorreiosWebService().cancelarObjeto(anyLong(), anyString(), anyString(), anyString())).thenReturn(true);
	}

	@Test
	public void deveriaBuscarCliente() throws Exception {
		Optional<ClienteEmpresa> cliente = servicoPostagemAPI.buscaCliente(contratoEmpresa);

		assertEquals(clienteEmpresa, cliente.get());
		verify(clienteEmpresaConverter).convert(any());
	}

	@Test
	public void deveriaTrazerRetornoVazioQuandoServicoNaoDevolverCliente() throws Exception {
		when(clienteAPI.getCorreiosWebService().buscaCliente(anyString(), anyString(), anyString(), anyString())).thenReturn(null);

		Optional<ClienteEmpresa> cliente = servicoPostagemAPI.buscaCliente(contratoEmpresa);

		assertFalse(cliente.isPresent());
		verify(clienteEmpresaConverter, never()).convert(any());
	}

	@SuppressWarnings("unchecked")
	@Test(expected=CorreiosPostagemAutenticacaoException.class)
	public void deveriaLancarExcecaoDeAutenticacaoAoBuscarClienteQuandoServicoLancarExcecaoDeAutenticaoDoCorreios() throws Exception {
		when(clienteAPI.getCorreiosWebService().buscaCliente(anyString(), anyString(), anyString(), anyString())).thenThrow(AutenticacaoException.class);

		servicoPostagemAPI.buscaCliente(contratoEmpresa);
	}

	@SuppressWarnings("unchecked")
	@Test(expected=CorreiosServicoSoapException.class)
	public void deveriaLancarExcecaoDeServicoSoapAoBuscarClienteQuandoServicoLancarExcecaoDoServicoSigep() throws Exception {
		when(clienteAPI.getCorreiosWebService().buscaCliente(anyString(), anyString(), anyString(), anyString())).thenThrow(SigepClienteException.class);

		servicoPostagemAPI.buscaCliente(contratoEmpresa);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void deveriaNaosei() {
		when(clienteEmpresaConverter.convert(any())).thenThrow(RuntimeException.class);

		servicoPostagemAPI.buscaCliente(contratoEmpresa);

		Assert.fail(); // O que fazer?
	}






	@Test
	public void deveriaBuscarXmlPlpEConverterParaDocumentoPlp() throws Exception {
		Optional<DocumentoPlp> documentoPlpBuscado = servicoPostagemAPI.buscaDocumentoPlp(123L);

		assertEquals(documentoPlp, documentoPlpBuscado.get());
		verify(documentoPlpConverter).convert(any());
		verify(xmlPlpParser).convert(any());
	}

	@Test
	public void deveriaRetornarVazioQuandoServicoNaoDevolverXmlPlp() throws Exception {
		when(clienteAPI.getCorreiosWebService().solicitaXmlPlp(anyLong(), anyString(), anyString())).thenReturn(null);

		Optional<DocumentoPlp> documentoPlpBuscado = servicoPostagemAPI.buscaDocumentoPlp(123L);

		assertFalse(documentoPlpBuscado.isPresent());
		verify(documentoPlpConverter, never()).convert(any());
		verify(xmlPlpParser, never()).convert(any());
	}

	@Test
	public void deveriaRetornarVazioQuandoNaoForPossivelConverterXml() throws Exception {
		when(xmlPlpParser.convert(anyString())).thenReturn(Optional.absent());

		Optional<DocumentoPlp> documentoPlpBuscado = servicoPostagemAPI.buscaDocumentoPlp(123L);

		assertFalse(documentoPlpBuscado.isPresent());
	}

	@Test
	public void deveriaRetornarVazioQuandoNaoForPossivelConverterCorreiosLogEmDocumentoPlp() throws Exception {
		when(documentoPlpConverter.convert(correiosLog)).thenReturn(Optional.absent());

		Optional<DocumentoPlp> documentoPlpBuscado = servicoPostagemAPI.buscaDocumentoPlp(123L);

		assertFalse(documentoPlpBuscado.isPresent());
	}

	@SuppressWarnings("unchecked")
	@Test(expected=CorreiosPostagemAutenticacaoException.class)
	public void deveriaLancarExcecaoDeAutenticacaoAoBuscarXmlPlpQuandoServicoLancarExcecaoDeAutenticaoDoCorreios() throws Exception {
		when(clienteAPI.getCorreiosWebService().solicitaXmlPlp(anyLong(), anyString(), anyString())).thenThrow(AutenticacaoException.class);

		servicoPostagemAPI.buscaDocumentoPlp(123L);
	}

	@SuppressWarnings("unchecked")
	@Test(expected=CorreiosServicoSoapException.class)
	public void deveriaLancarExcecaoDeServicoSoapAoBuscarXmlPlpQuandoServicoLancarExcecaoDoServicoSigep() throws Exception {
		when(clienteAPI.getCorreiosWebService().solicitaXmlPlp(anyLong(), anyString(), anyString())).thenThrow(SigepClienteException.class);

		servicoPostagemAPI.buscaDocumentoPlp(123L);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void deveriaNaosei2() {
		when(documentoPlpConverter.convert(any())).thenThrow(RuntimeException.class);

		servicoPostagemAPI.buscaDocumentoPlp(123L);

		Assert.fail(); // O que fazer?
	}









	@Test
	public void deveriaCancelarObjetoDaPlp() {
		boolean cancelado = servicoPostagemAPI.cancelaObjetoDaPlp(123L, "DW123456BR");
		assertTrue(cancelado);
	}

	@Test
	public void deveriaNaoCancelarObjetoDaPlpQuandoServicoNaoCancelar() throws Exception {
		when(clienteAPI.getCorreiosWebService().cancelarObjeto(anyLong(), anyString(), anyString(), anyString())).thenReturn(false);

		boolean cancelado = servicoPostagemAPI.cancelaObjetoDaPlp(123L, "DW123456BR");

		assertFalse(cancelado);
	}

	@SuppressWarnings("unchecked")
	@Test(expected=CorreiosPostagemAutenticacaoException.class)
	public void deveriaLancarExcecaoDeAutenticacaoAoCancelarObjetoQuandoServicoLancarExcecaoDeAutenticaoDoCorreios() throws Exception {
		when(clienteAPI.getCorreiosWebService().cancelarObjeto(anyLong(), anyString(), anyString(), anyString())).thenThrow(AutenticacaoException.class);

		servicoPostagemAPI.cancelaObjetoDaPlp(123L, "DW123456BR");
	}

	@SuppressWarnings("unchecked")
	@Test(expected=CorreiosServicoSoapException.class)
	public void deveriaLancarExcecaoDeServicoSoapAoCancelarObjetoQuandoServicoLancarExcecaoDoServicoSigep() throws Exception {
		when(clienteAPI.getCorreiosWebService().cancelarObjeto(anyLong(), anyString(), anyString(), anyString())).thenThrow(SigepClienteException.class);

		servicoPostagemAPI.cancelaObjetoDaPlp(123L, "DW123456BR");
	}

	@SuppressWarnings("unchecked")
	@Test(expected=CorreiosServicoSoapException.class)
	public void deveriaLancarExcecaoDeServicoSoapAoCancelarObjetoQuandoServicoLancarExcecaoGenerica() throws Exception {
		when(clienteAPI.getCorreiosWebService().cancelarObjeto(anyLong(), anyString(), anyString(), anyString())).thenThrow(Exception_Exception.class);

		servicoPostagemAPI.cancelaObjetoDaPlp(123L, "DW123456BR");
	}

}
