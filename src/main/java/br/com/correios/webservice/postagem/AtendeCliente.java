
package br.com.correios.webservice.postagem;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 *
 */
@WebService(name = "AtendeCliente", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AtendeCliente {


    /**
     *
     * @param senha
     * @param xml
     * @param cartaoPostagem
     * @param usuario
     * @param faixaEtiquetas
     * @param idPlpCliente
     * @return
     *     returns java.lang.Long
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "fechaPlp", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.FechaPlp")
    @ResponseWrapper(localName = "fechaPlpResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.FechaPlpResponse")
    public Long fechaPlp(
        @WebParam(name = "xml", targetNamespace = "")
        String xml,
        @WebParam(name = "idPlpCliente", targetNamespace = "")
        Long idPlpCliente,
        @WebParam(name = "cartaoPostagem", targetNamespace = "")
        String cartaoPostagem,
        @WebParam(name = "faixaEtiquetas", targetNamespace = "")
        String faixaEtiquetas,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param idCartaoPostagem
     * @param senha
     * @param usuario
     * @param idContrato
     * @return
     *     returns br.com.correios.webservice.postagem.ClienteERP
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscaCliente", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.BuscaCliente")
    @ResponseWrapper(localName = "buscaClienteResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.BuscaClienteResponse")
    public ClienteERP buscaCliente(
        @WebParam(name = "idContrato", targetNamespace = "")
        String idContrato,
        @WebParam(name = "idCartaoPostagem", targetNamespace = "")
        String idCartaoPostagem,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param senha
     * @param usuario
     * @param numeroEtiqueta
     * @param idPlp
     * @return
     *     returns boolean
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validaEtiquetaPLP", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.ValidaEtiquetaPLP")
    @ResponseWrapper(localName = "validaEtiquetaPLPResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.ValidaEtiquetaPLPResponse")
    public boolean validaEtiquetaPLP(
        @WebParam(name = "numeroEtiqueta", targetNamespace = "")
        String numeroEtiqueta,
        @WebParam(name = "idPlp", targetNamespace = "")
        Long idPlp,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param senha
     * @param codAdministrativo
     * @param cepOrigem
     * @param usuario
     * @param numeroServico
     * @param cepDestino
     * @return
     *     returns boolean
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verificaDisponibilidadeServico", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.VerificaDisponibilidadeServico")
    @ResponseWrapper(localName = "verificaDisponibilidadeServicoResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.VerificaDisponibilidadeServicoResponse")
    public boolean verificaDisponibilidadeServico(
        @WebParam(name = "codAdministrativo", targetNamespace = "")
        Integer codAdministrativo,
        @WebParam(name = "numeroServico", targetNamespace = "")
        String numeroServico,
        @WebParam(name = "cepOrigem", targetNamespace = "")
        String cepOrigem,
        @WebParam(name = "cepDestino", targetNamespace = "")
        String cepDestino,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param arg1
     * @param arg0
     * @return
     *     returns br.com.correios.webservice.postagem.StatusPlp
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStatusPLP", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.GetStatusPLP")
    @ResponseWrapper(localName = "getStatusPLPResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.GetStatusPLPResponse")
    public StatusPlp getStatusPLP(
        @WebParam(name = "arg0", targetNamespace = "")
        List<ObjetoPostal> arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws SigepClienteException
    ;

    /**
     *
     * @param senha
     * @param tipoBloqueio
     * @param usuario
     * @param numeroEtiqueta
     * @param acao
     * @param idPlp
     * @return
     *     returns java.lang.String
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bloquearObjeto", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.BloquearObjeto")
    @ResponseWrapper(localName = "bloquearObjetoResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.BloquearObjetoResponse")
    public String bloquearObjeto(
        @WebParam(name = "numeroEtiqueta", targetNamespace = "")
        String numeroEtiqueta,
        @WebParam(name = "idPlp", targetNamespace = "")
        Long idPlp,
        @WebParam(name = "tipoBloqueio", targetNamespace = "")
        TipoBloqueio tipoBloqueio,
        @WebParam(name = "acao", targetNamespace = "")
        Acao acao,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param senha
     * @param idServico
     * @param qtdEtiquetas
     * @param usuario
     * @param tipoDestinatario
     * @param identificador
     * @return
     *     returns java.lang.String
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "solicitaEtiquetas", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.SolicitaEtiquetas")
    @ResponseWrapper(localName = "solicitaEtiquetasResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.SolicitaEtiquetasResponse")
    public String solicitaEtiquetas(
        @WebParam(name = "tipoDestinatario", targetNamespace = "")
        String tipoDestinatario,
        @WebParam(name = "identificador", targetNamespace = "")
        String identificador,
        @WebParam(name = "idServico", targetNamespace = "")
        Long idServico,
        @WebParam(name = "qtdEtiquetas", targetNamespace = "")
        Integer qtdEtiquetas,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param senha
     * @param usuario
     * @return
     *     returns java.lang.String
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscaPagamentoEntrega", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.BuscaPagamentoEntrega")
    @ResponseWrapper(localName = "buscaPagamentoEntregaResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.BuscaPagamentoEntregaResponse")
    public String buscaPagamentoEntrega(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param senha
     * @param etiquetas
     * @param usuario
     * @return
     *     returns java.util.List<java.lang.Integer>
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "geraDigitoVerificadorEtiquetas", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.GeraDigitoVerificadorEtiquetas")
    @ResponseWrapper(localName = "geraDigitoVerificadorEtiquetasResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.GeraDigitoVerificadorEtiquetasResponse")
    public List<Integer> geraDigitoVerificadorEtiquetas(
        @WebParam(name = "etiquetas", targetNamespace = "")
        List<String> etiquetas,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param senha
     * @param usuario
     * @param numeroEtiqueta
     * @param idPlp
     * @return
     *     returns java.lang.Boolean
     * @throws AutenticacaoException
     * @throws SigepClienteException
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cancelarObjeto", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.CancelarObjeto")
    @ResponseWrapper(localName = "cancelarObjetoResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.CancelarObjetoResponse")
    public Boolean cancelarObjeto(
        @WebParam(name = "idPlp", targetNamespace = "")
        Long idPlp,
        @WebParam(name = "numeroEtiqueta", targetNamespace = "")
        String numeroEtiqueta,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, Exception_Exception, SigepClienteException
    ;

    /**
     *
     * @param listaEtiquetas
     * @param senha
     * @param xml
     * @param cartaoPostagem
     * @param usuario
     * @param idPlpCliente
     * @return
     *     returns java.lang.Long
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "fechaPlpVariosServicos", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.FechaPlpVariosServicos")
    @ResponseWrapper(localName = "fechaPlpVariosServicosResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.FechaPlpVariosServicosResponse")
    public Long fechaPlpVariosServicos(
        @WebParam(name = "xml", targetNamespace = "")
        String xml,
        @WebParam(name = "idPlpCliente", targetNamespace = "")
        Long idPlpCliente,
        @WebParam(name = "cartaoPostagem", targetNamespace = "")
        String cartaoPostagem,
        @WebParam(name = "listaEtiquetas", targetNamespace = "")
        List<String> listaEtiquetas,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param senha
     * @param codAdministrativo
     * @param codigoServico
     * @param cepDestinatario
     * @param usuario
     * @param coleta
     * @return
     *     returns java.lang.Boolean
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validarPostagemReversa", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.ValidarPostagemReversa")
    @ResponseWrapper(localName = "validarPostagemReversaResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.ValidarPostagemReversaResponse")
    public Boolean validarPostagemReversa(
        @WebParam(name = "codAdministrativo", targetNamespace = "")
        Integer codAdministrativo,
        @WebParam(name = "codigoServico", targetNamespace = "")
        Integer codigoServico,
        @WebParam(name = "cepDestinatario", targetNamespace = "")
        String cepDestinatario,
        @WebParam(name = "coleta", targetNamespace = "")
        ColetaReversaTO coleta,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param cliente
     * @param unidadePostagem
     * @param senha
     * @param cartao
     * @param numero
     * @param servicosAdicionais
     * @param diretoria
     * @param usuario
     * @param servico
     * @return
     *     returns boolean
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validaPlp", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.ValidaPlp")
    @ResponseWrapper(localName = "validaPlpResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.ValidaPlpResponse")
    public boolean validaPlp(
        @WebParam(name = "cliente", targetNamespace = "")
        long cliente,
        @WebParam(name = "numero", targetNamespace = "")
        String numero,
        @WebParam(name = "diretoria", targetNamespace = "")
        long diretoria,
        @WebParam(name = "cartao", targetNamespace = "")
        String cartao,
        @WebParam(name = "unidadePostagem", targetNamespace = "")
        String unidadePostagem,
        @WebParam(name = "servico", targetNamespace = "")
        Long servico,
        @WebParam(name = "servicosAdicionais", targetNamespace = "")
        List<String> servicosAdicionais,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param senha
     * @param tipo
     * @param idPostagem
     * @param codAdministrativo
     * @param usuario
     * @return
     *     returns br.com.correios.webservice.postagem.RetornoCancelamentoTO
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cancelarPedidoScol", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.CancelarPedidoScol")
    @ResponseWrapper(localName = "cancelarPedidoScolResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.CancelarPedidoScolResponse")
    public RetornoCancelamentoTO cancelarPedidoScol(
        @WebParam(name = "codAdministrativo", targetNamespace = "")
        Integer codAdministrativo,
        @WebParam(name = "idPostagem", targetNamespace = "")
        String idPostagem,
        @WebParam(name = "tipo", targetNamespace = "")
        String tipo,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @return
     *     returns java.util.List<br.com.correios.webservice.postagem.EmbalagemLRSMaster>
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obterEmbalagemLRS", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.ObterEmbalagemLRS")
    @ResponseWrapper(localName = "obterEmbalagemLRSResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.ObterEmbalagemLRSResponse")
    public List<EmbalagemLRSMaster> obterEmbalagemLRS()
        throws SigepClienteException
    ;

    /**
     *
     * @param senha
     * @param codAdministrativo
     * @param codigoServico
     * @param cepDestinatario
     * @param usuario
     * @param coleta
     * @return
     *     returns java.lang.Boolean
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validarPostagemSimultanea", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.ValidarPostagemSimultanea")
    @ResponseWrapper(localName = "validarPostagemSimultaneaResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.ValidarPostagemSimultaneaResponse")
    public Boolean validarPostagemSimultanea(
        @WebParam(name = "codAdministrativo", targetNamespace = "")
        Integer codAdministrativo,
        @WebParam(name = "codigoServico", targetNamespace = "")
        Integer codigoServico,
        @WebParam(name = "cepDestinatario", targetNamespace = "")
        String cepDestinatario,
        @WebParam(name = "coleta", targetNamespace = "")
        ColetaSimultaneaTO coleta,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param idCartaoPostagem
     * @param senha
     * @param usuario
     * @param idContrato
     * @return
     *     returns java.util.List<br.com.correios.webservice.postagem.ServicoERP>
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscaServicos", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.BuscaServicos")
    @ResponseWrapper(localName = "buscaServicosResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.BuscaServicosResponse")
    public List<ServicoERP> buscaServicos(
        @WebParam(name = "idContrato", targetNamespace = "")
        String idContrato,
        @WebParam(name = "idCartaoPostagem", targetNamespace = "")
        String idCartaoPostagem,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param senha
     * @param codAdministrativo
     * @param xml
     * @param usuario
     * @return
     *     returns java.lang.String
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "solicitarPostagemScol", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.SolicitarPostagemScol")
    @ResponseWrapper(localName = "solicitarPostagemScolResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.SolicitarPostagemScolResponse")
    public String solicitarPostagemScol(
        @WebParam(name = "codAdministrativo", targetNamespace = "")
        Integer codAdministrativo,
        @WebParam(name = "xml", targetNamespace = "")
        String xml,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param senha
     * @param numeroCartaoPostagem
     * @param usuario
     * @return
     *     returns br.com.correios.webservice.postagem.StatusCartao
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStatusCartaoPostagem", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.GetStatusCartaoPostagem")
    @ResponseWrapper(localName = "getStatusCartaoPostagemResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.GetStatusCartaoPostagemResponse")
    public StatusCartao getStatusCartaoPostagem(
        @WebParam(name = "numeroCartaoPostagem", targetNamespace = "")
        String numeroCartaoPostagem,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param idPlpMaster
     * @param senha
     * @param numEtiqueta
     * @param usuario
     * @return
     *     returns java.lang.String
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "solicitaPLP", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.SolicitaPLP")
    @ResponseWrapper(localName = "solicitaPLPResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.SolicitaPLPResponse")
    public String solicitaPLP(
        @WebParam(name = "idPlpMaster", targetNamespace = "")
        Long idPlpMaster,
        @WebParam(name = "numEtiqueta", targetNamespace = "")
        String numEtiqueta,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param idPlpMaster
     * @param senha
     * @param usuario
     * @return
     *     returns java.lang.String
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "solicitaXmlPlp", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.SolicitaXmlPlp")
    @ResponseWrapper(localName = "solicitaXmlPlpResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.SolicitaXmlPlpResponse")
    public String solicitaXmlPlp(
        @WebParam(name = "idPlpMaster", targetNamespace = "")
        Long idPlpMaster,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param senha
     * @param numero
     * @param diretoria
     * @param usuario
     * @return
     *     returns br.com.correios.webservice.postagem.ContratoERP
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscaContrato", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.BuscaContrato")
    @ResponseWrapper(localName = "buscaContratoResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.BuscaContratoResponse")
    public ContratoERP buscaContrato(
        @WebParam(name = "numero", targetNamespace = "")
        String numero,
        @WebParam(name = "diretoria", targetNamespace = "")
        long diretoria,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param senhaSro
     * @param tipoConsulta
     * @param listaObjetos
     * @param usuarioSro
     * @param tipoResultado
     * @return
     *     returns java.lang.String
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaSRO", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.ConsultaSRO")
    @ResponseWrapper(localName = "consultaSROResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.ConsultaSROResponse")
    public String consultaSRO(
        @WebParam(name = "listaObjetos", targetNamespace = "")
        List<String> listaObjetos,
        @WebParam(name = "tipoConsulta", targetNamespace = "")
        String tipoConsulta,
        @WebParam(name = "tipoResultado", targetNamespace = "")
        String tipoResultado,
        @WebParam(name = "usuarioSro", targetNamespace = "")
        String usuarioSro,
        @WebParam(name = "senhaSro", targetNamespace = "")
        String senhaSro)
        throws SigepClienteException
    ;

    /**
     *
     * @param senha
     * @param cnpjCliente
     * @param usuario
     * @return
     *     returns javax.xml.datatype.XMLGregorianCalendar
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obterClienteAtualizacao", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.ObterClienteAtualizacao")
    @ResponseWrapper(localName = "obterClienteAtualizacaoResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.ObterClienteAtualizacaoResponse")
    public XMLGregorianCalendar obterClienteAtualizacao(
        @WebParam(name = "cnpjCliente", targetNamespace = "")
        String cnpjCliente,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param senha
     * @param codAdministrativo
     * @param usuario
     * @return
     *     returns java.lang.Boolean
     * @throws AutenticacaoException
     * @throws SigepClienteException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "integrarUsuarioScol", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.IntegrarUsuarioScol")
    @ResponseWrapper(localName = "integrarUsuarioScolResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.IntegrarUsuarioScolResponse")
    public Boolean integrarUsuarioScol(
        @WebParam(name = "codAdministrativo", targetNamespace = "")
        Integer codAdministrativo,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "senha", targetNamespace = "")
        String senha)
        throws AutenticacaoException, SigepClienteException
    ;

    /**
     *
     * @param cep
     * @return
     *     returns br.com.correios.webservice.postagem.EnderecoERP
     * @throws SigepClienteException
     * @throws SQLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaCEP", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.ConsultaCEP")
    @ResponseWrapper(localName = "consultaCEPResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.webservice.postagem.ConsultaCEPResponse")
    public EnderecoERP consultaCEP(
        @WebParam(name = "cep", targetNamespace = "")
        String cep)
        throws SQLException_Exception, SigepClienteException
    ;

}
