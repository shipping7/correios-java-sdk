package br.com.correios.api.estimativa;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.correios.Cep;
import br.com.correios.api.postagem.dimensao.DimensoesDoObjeto.TipoDoObjetoSendoEnviado;
import br.com.correios.credentials.CorreiosCredenciais;
import br.com.correios.estimativa.CResultadoToEstimativasConverter;
import br.com.correios.estimativa.DimensoesPacoteEstimado;
import br.com.correios.estimativa.EstimativaComPrazo;
import br.com.correios.estimativa.EstimativaComPrecoEPrazo;
import br.com.correios.webservice.estimativa.CalcPrecoPrazoWS;
import br.com.correios.webservice.estimativa.CalcPrecoPrazoWSSoap;

@RunWith(MockitoJUnitRunner.class)
public class SoapCorreiosServicoEstimativaAPITest {

	@Mock
	private CResultadoToEstimativasConverter<EstimativaComPrecoEPrazo> precoPrazoConverter;
	@Mock
	private CResultadoToEstimativasConverter<EstimativaComPrazo> prazoConverter;
	@Mock
	private DimensoesPacoteEstimado dimensoes;
	@Mock
	private CalcPrecoPrazoWS calcPrecoPrazoWS;
	@Mock
	private CalcPrecoPrazoWSSoap calcPrecoPrazoWSSoap;
	@Mock
	private EstimativaComPrecoEPrazo estimativaComPrecoEPrazo;
	@Mock
	private EstimativaComPrazo estimativaComPrazo;

	private SoapCorreiosServicoEstimativaAPI soapCorreiosServicoEstimativaAPI;
	private Set<String> codigosServico;

	@Before
	public void setUp() {
		CorreiosCredenciais correiosCredenciais = new CorreiosCredenciais("usuario", "senha");
		soapCorreiosServicoEstimativaAPI = new SoapCorreiosServicoEstimativaAPI(calcPrecoPrazoWS, correiosCredenciais, precoPrazoConverter, prazoConverter);
		codigosServico = Collections.singleton("04162");

		when(calcPrecoPrazoWS.getCalcPrecoPrazoWSSoap()).thenReturn(calcPrecoPrazoWSSoap);
		when(dimensoes.getTipoDoObjetoSendoEnviado()).thenReturn(TipoDoObjetoSendoEnviado.PACOTE_OU_CAIXA);
		when(dimensoes.getPeso()).thenReturn(BigDecimal.TEN);
		when(precoPrazoConverter.convert(any())).thenReturn(Collections.singletonList(estimativaComPrecoEPrazo));
		when(prazoConverter.convert(any())).thenReturn(Collections.singletonList(estimativaComPrazo));
	}

	@Test
	public void deveriaCalcularPrecoEPrazoEConverterParaModelo() {
		soapCorreiosServicoEstimativaAPI.calculaPrecoEPrazo(codigosServico, new Cep("11045530"), new Cep("11015231"), dimensoes, BigDecimal.TEN, false, false);

		verify(calcPrecoPrazoWSSoap, only()).calcPrecoPrazo(anyString(), anyString(), anyString(), anyString(), anyString(), anyString(), anyInt(), any(), any(), any(), any(), anyString(), any(), anyString());
		verify(precoPrazoConverter).convert(any());
		verify(prazoConverter, never()).convert(any());
	}

	@Test
	public void deveriaCalcularPrazoEConverterParaModelo() {
		soapCorreiosServicoEstimativaAPI.calculaPrazo(codigosServico, new Cep("11045530"), new Cep("11015231"));

		verify(calcPrecoPrazoWSSoap, only()).calcPrazo(anyString(), anyString(), anyString());
		verify(prazoConverter).convert(any());
		verify(precoPrazoConverter, never()).convert(any());
	}

}
