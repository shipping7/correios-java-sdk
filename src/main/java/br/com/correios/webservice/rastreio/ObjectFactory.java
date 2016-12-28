
package br.com.correios.webservice.rastreio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.correios.webservice.resource package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnidadesSROResponse_QNAME = new QName("http://resource.webservice.correios.com.br/", "UnidadesSROResponse");
    private final static QName _BuscaEventosListaResponse_QNAME = new QName("http://resource.webservice.correios.com.br/", "buscaEventosListaResponse");
    private final static QName _BuscaEventosLista_QNAME = new QName("http://resource.webservice.correios.com.br/", "buscaEventosLista");
    private final static QName _Endereco_QNAME = new QName("http://resource.webservice.correios.com.br/", "endereco");
    private final static QName _BuscaEventos_QNAME = new QName("http://resource.webservice.correios.com.br/", "buscaEventos");
    private final static QName _ListaEntregaExternaResponse_QNAME = new QName("http://resource.webservice.correios.com.br/", "ListaEntregaExternaResponse");
    private final static QName _Destino_QNAME = new QName("http://resource.webservice.correios.com.br/", "destino");
    private final static QName _Objeto_QNAME = new QName("http://resource.webservice.correios.com.br/", "objeto");
    private final static QName _RastroJsonResponse_QNAME = new QName("http://resource.webservice.correios.com.br/", "RastroJsonResponse");
    private final static QName _Evento_QNAME = new QName("http://resource.webservice.correios.com.br/", "evento");
    private final static QName _RastroJson_QNAME = new QName("http://resource.webservice.correios.com.br/", "RastroJson");
    private final static QName _Rastro_QNAME = new QName("http://resource.webservice.correios.com.br/", "rastro");
    private final static QName _BuscaEventosResponse_QNAME = new QName("http://resource.webservice.correios.com.br/", "buscaEventosResponse");
    private final static QName _UnidadesSRO_QNAME = new QName("http://resource.webservice.correios.com.br/", "UnidadesSRO");
    private final static QName _ListaEntregaExterna_QNAME = new QName("http://resource.webservice.correios.com.br/", "ListaEntregaExterna");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.correios.webservice.resource
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventosDosCorreios }
     * 
     */
    public EventosDosCorreios createSroxml() {
        return new EventosDosCorreios();
    }

    /**
     * Create an instance of {@link ListaEntregaExterna }
     * 
     */
    public ListaEntregaExterna createListaEntregaExterna() {
        return new ListaEntregaExterna();
    }

    /**
     * Create an instance of {@link BuscaEventosResponse }
     * 
     */
    public BuscaEventosResponse createBuscaEventosResponse() {
        return new BuscaEventosResponse();
    }

    /**
     * Create an instance of {@link UnidadesSRO }
     * 
     */
    public UnidadesSRO createUnidadesSRO() {
        return new UnidadesSRO();
    }

    /**
     * Create an instance of {@link RastroJson }
     * 
     */
    public RastroJson createRastroJson() {
        return new RastroJson();
    }

    /**
     * Create an instance of {@link Eventos }
     * 
     */
    public Eventos createEventos() {
        return new Eventos();
    }

    /**
     * Create an instance of {@link ListaEntregaExternaResponse }
     * 
     */
    public ListaEntregaExternaResponse createListaEntregaExternaResponse() {
        return new ListaEntregaExternaResponse();
    }

    /**
     * Create an instance of {@link Destinos }
     * 
     */
    public Destinos createDestinos() {
        return new Destinos();
    }

    /**
     * Create an instance of {@link RastroJsonResponse }
     * 
     */
    public RastroJsonResponse createRastroJsonResponse() {
        return new RastroJsonResponse();
    }

    /**
     * Create an instance of {@link Objeto }
     * 
     */
    public Objeto createObjeto() {
        return new Objeto();
    }

    /**
     * Create an instance of {@link UnidadesSROResponse }
     * 
     */
    public UnidadesSROResponse createUnidadesSROResponse() {
        return new UnidadesSROResponse();
    }

    /**
     * Create an instance of {@link BuscaEventosLista }
     * 
     */
    public BuscaEventosLista createBuscaEventosLista() {
        return new BuscaEventosLista();
    }

    /**
     * Create an instance of {@link BuscaEventos }
     * 
     */
    public BuscaEventos createBuscaEventos() {
        return new BuscaEventos();
    }

    /**
     * Create an instance of {@link EnderecoMobile }
     * 
     */
    public EnderecoMobile createEnderecoMobile() {
        return new EnderecoMobile();
    }

    /**
     * Create an instance of {@link BuscaEventosListaResponse }
     * 
     */
    public BuscaEventosListaResponse createBuscaEventosListaResponse() {
        return new BuscaEventosListaResponse();
    }

    /**
     * Create an instance of {@link ObjetoPostal }
     * 
     */
    public ObjetoPostal createObjetoPostal() {
        return new ObjetoPostal();
    }

    /**
     * Create an instance of {@link RegistroUnidades }
     * 
     */
    public RegistroUnidades createRegistroUnidades() {
        return new RegistroUnidades();
    }

    /**
     * Create an instance of {@link ListaEntregaExterna2 }
     * 
     */
    public ListaEntregaExterna2 createListaEntregaExterna2() {
        return new ListaEntregaExterna2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidadesSROResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "UnidadesSROResponse")
    public JAXBElement<UnidadesSROResponse> createUnidadesSROResponse(UnidadesSROResponse value) {
        return new JAXBElement<UnidadesSROResponse>(_UnidadesSROResponse_QNAME, UnidadesSROResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaEventosListaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "buscaEventosListaResponse")
    public JAXBElement<BuscaEventosListaResponse> createBuscaEventosListaResponse(BuscaEventosListaResponse value) {
        return new JAXBElement<BuscaEventosListaResponse>(_BuscaEventosListaResponse_QNAME, BuscaEventosListaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaEventosLista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "buscaEventosLista")
    public JAXBElement<BuscaEventosLista> createBuscaEventosLista(BuscaEventosLista value) {
        return new JAXBElement<BuscaEventosLista>(_BuscaEventosLista_QNAME, BuscaEventosLista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoMobile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "endereco")
    public JAXBElement<EnderecoMobile> createEndereco(EnderecoMobile value) {
        return new JAXBElement<EnderecoMobile>(_Endereco_QNAME, EnderecoMobile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaEventos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "buscaEventos")
    public JAXBElement<BuscaEventos> createBuscaEventos(BuscaEventos value) {
        return new JAXBElement<BuscaEventos>(_BuscaEventos_QNAME, BuscaEventos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaEntregaExternaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "ListaEntregaExternaResponse")
    public JAXBElement<ListaEntregaExternaResponse> createListaEntregaExternaResponse(ListaEntregaExternaResponse value) {
        return new JAXBElement<ListaEntregaExternaResponse>(_ListaEntregaExternaResponse_QNAME, ListaEntregaExternaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Destinos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "destino")
    public JAXBElement<Destinos> createDestino(Destinos value) {
        return new JAXBElement<Destinos>(_Destino_QNAME, Destinos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Objeto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "objeto")
    public JAXBElement<Objeto> createObjeto(Objeto value) {
        return new JAXBElement<Objeto>(_Objeto_QNAME, Objeto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RastroJsonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "RastroJsonResponse")
    public JAXBElement<RastroJsonResponse> createRastroJsonResponse(RastroJsonResponse value) {
        return new JAXBElement<RastroJsonResponse>(_RastroJsonResponse_QNAME, RastroJsonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eventos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "evento")
    public JAXBElement<Eventos> createEvento(Eventos value) {
        return new JAXBElement<Eventos>(_Evento_QNAME, Eventos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RastroJson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "RastroJson")
    public JAXBElement<RastroJson> createRastroJson(RastroJson value) {
        return new JAXBElement<RastroJson>(_RastroJson_QNAME, RastroJson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventosDosCorreios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "rastro")
    public JAXBElement<EventosDosCorreios> createRastro(EventosDosCorreios value) {
        return new JAXBElement<EventosDosCorreios>(_Rastro_QNAME, EventosDosCorreios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaEventosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "buscaEventosResponse")
    public JAXBElement<BuscaEventosResponse> createBuscaEventosResponse(BuscaEventosResponse value) {
        return new JAXBElement<BuscaEventosResponse>(_BuscaEventosResponse_QNAME, BuscaEventosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidadesSRO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "UnidadesSRO")
    public JAXBElement<UnidadesSRO> createUnidadesSRO(UnidadesSRO value) {
        return new JAXBElement<UnidadesSRO>(_UnidadesSRO_QNAME, UnidadesSRO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaEntregaExterna }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "ListaEntregaExterna")
    public JAXBElement<ListaEntregaExterna> createListaEntregaExterna(ListaEntregaExterna value) {
        return new JAXBElement<ListaEntregaExterna>(_ListaEntregaExterna_QNAME, ListaEntregaExterna.class, null, value);
    }

}
