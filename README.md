[![Stories in Ready](https://badge.waffle.io/alexandregama/correios-java-sdk.png?label=ready&title=Ready)](https://waffle.io/alexandregama/correios-java-sdk)
# Correios Tracking Java SDK

Quer um resumo simples e prático? Visite a [página oficial](http://alexandregama.github.io/correios-java-sdk/) do SDK :)

## Correios Rastreio Java SDK.

Este SDK foi criada para facilitar a sua vida quando precisar fazer integração com o serviço de [Rastreios de Objetos](http://www2.correios.com.br/sistemas/rastreamento/) dos Correios através do [WSDL](https://webservice.correios.com.br/service/rastro/Rastro.wsdl) \o/

O SDK é totalmente Free e Open Source! Como você deve ter notado, usamos o GitHub, então sinta-se à vontade para fazer alterações necessárias e [abrir um Pull Request](https://help.github.com/articles/using-pull-requests/) pra gente :)

O SDK não tem alguma funcionalidade que você deseja? Não se preocupe, basta criar uma [issue](https://github.com/alexandregama/correios-java-sdk/issues) explicando o que você gostaria e implementaremos pra você :)

## Usando o SDK

Veja como é simples usar o SDK para Rastrear um objeto nos correios em 2 passos:

1 - Com as suas credenciais em mãos, instancie o seguinte objeto:

```java
CorreiosCredentials credentials = new CorreiosCredentials("username", "password");
```

2 - Em seguida basta invocar o método para retornar os Eventos do objeto desejado:

```java
CorreiosRastreioClientApi correiosApi = new CorreiosRastreioClientApi(credentials);

PacoteTracker pacoteTracker = correiosApi.buscaPacoteTrackerUsando("codigo_do_seu_objeto").emPortugues().comTodosOsEventos().build();
```

O código do seu objeto deve ser algo parecido com **DU500853238BR**.

O código completo fica como o a seguir:

```java
	@Test
	public void deveriaRetornarOsEventosAPartirDeUmTrackingCode() throws Exception {
		CorreiosCredentials credentials = new CorreiosCredentials("seu-usuario", "sua-senha");
		
		CorreiosRastreioClientApi correiosApi = new CorreiosRastreioClientApi(credentials);

		PacoteTracker pacoteTracker = correiosApi.buscaPacoteTrackerUsandoOCodigo("DU500853237BR").emPortugues().comTodosOsEventos().getPacoteTracker();
		
		System.out.println(pacoteTracker);
	}
```

Note que usamos uma [Fluent Interface](https://en.wikipedia.org/wiki/Fluent_interface) que já indica pra você quais métodos devem ser invocados e nem deixa você errar! E o resto fazemos internamente pra você! Que demais né? \o/

## Buscando mais de um Objeto

Também é possível buscar mais de um Objeto através de uma lista de Códigos, como é mostrado a seguir:

```java
@Test
	public void deveriaRetornarOsEventosAPartirDeUmaListaDeTrackingCodes() throws Exception {
		CorreiosCredentials credentials = new CorreiosCredentials("username", "password");
		
		CorreiosRastreioClientApi correiosApi = new CorreiosRastreioClientApi(credentials);
		
		List<String> trackingCodes = new ArrayList<>();
		trackingCodes.add("DU500853237BR");
		trackingCodes.add("DU496842125BR");
		
		List<PacoteTracker> listaDeEventos = correiosApi.buscaPacoteTrackerPelaListaDeTrackings(trackingCodes).emPortugues().comTodosOsEventos().getListaDePacotesTracker();
		
		System.out.println(listaDeEventos);
	}
```

Note que agora temos uma lista de PacoteTracker, que por sua vez é o objeto que contém todas as informações que você precisa! Awesome! \o/

## Informações de Retorno

Os Correios enviam diversas informações relacionadas ao objeto que está sendo pesquisado. 

O objeto PacoteTracker é responsável por guardar essas informações, dê uma olhadinha na documentação na Wiki ;)

# Correios Rastreio

[Link](https://www.correios.com.br/para-voce/correios-de-a-a-z/pdf/rastreamento-de-objetos/Manual_SROXML_28fev14.pdf) para o manual completo de integração com o WebService de Rastreio dos Correios

### Exemplos de Requisições via SOAP

Requisição para pesquisar a situação de um determinado **Tracking Code**

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:res="http://resource.webservice.correios.com.br/">
   <soapenv:Header/>
   <soapenv:Body>
      <res:buscaEventosLista>
         <!--Optional:-->
         <usuario>12345</usuario>
         <!--Optional:-->
         <senha>12345</senha>
         <!--Optional:-->
         <tipo>L</tipo>
         <!--Optional:-->
         <resultado>T</resultado>
         <!--Optional:-->
         <lingua>101</lingua>
         <!--Zero or more repetitions:-->
         <objetos>PN560740569BR</objetos>
      </res:buscaEventosLista>
   </soapenv:Body>
</soapenv:Envelope>
```

# Correios PLP

[WSDL](https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl) usado para acesso ao sistema Sigep dos Correios

### Exemplo de consulta de SRO pelo WebService dos Correios

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:cli="http://cliente.bean.master.sigep.bsb.correios.com.br/">
   <soapenv:Header/>
   <soapenv:Body>
      <cli:consultaSRO>
         <!--Zero or more repetitions:-->
         <listaObjetos>PN560740569BR</listaObjetos>
         <!--Optional:-->
         <tipoConsulta>L</tipoConsulta>
         <!--Optional:-->
         <tipoResultado>T</tipoResultado>
         <!--Optional:-->
         <usuarioSro>123456</usuarioSro>
         <!--Optional:-->
         <senhaSro>123456</senhaSro>
      </cli:consultaSRO>
   </soapenv:Body>
</soapenv:Envelope>
```

### Solicitando XML da PLP via WebService

Método utilizado: **solicitaXmlPLP**

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:cli="http://cliente.bean.master.sigep.bsb.correios.com.br/">
   <soapenv:Header/>
   <soapenv:Body>
      <cli:solicitaXmlPlp>
         <!--Optional:-->
         <idPlpMaster>Id da sua PLP</idPlpMaster>
         <!--Optional:-->
         <usuario>Seu usuario</usuario>
         <!--Optional:-->
         <senha>Sua senha</senha>
      </cli:solicitaXmlPlp>
   </soapenv:Body>
</soapenv:Envelope>
```

## Solicitando Etiquetas via WebService

Este método retorna numeração de registro(s) dos Correios para futura postagem de objeto(s). O número de registro é o identificador do objeto no fluxo postal da ECT, sendo utilizado como chave para rastreamento, conhecido também como **Tracking Code**.

Com o atendimento da solicitação, o número de registro fica reservada para o CNPJ informado. Quando da preparação do objeto para postagem, cada número poderá ser usado para geração do rótulo de postagem.

O método contempla o pedido de um ou mais números, por exemplo:

- Situação 1: 
Após a finalização de um processo (Ex: Compra de um produto na loja online), obter um número do registro da encomenda a ser postada.

- Situação 2: 
Aguardar a finalização de uma lista com **N** objetos a ser postada, solicitando em seguida, uma faixa de numeração.

- Situação 3: 

Solicitar uma quantidade maior de etiquetas e gerenciá-la localmente de acordo com os serviços utilizados, com rotina de controle do estoque das etiquetas, consumindo a numeração deste estoque. 

Recomendamos solicitar uma faixa de etiquetas conforme previsão de postagem do dia por serviço (PAC, SEDEX, etc). Dessa forma quando se esgotar o estoque de etiquetas para o serviço, efetuar nova solicitação. 

Esse processo evita a dependência de solicitação on-line de etiquetas, permitindo um controle local no sistema cliente.

Para cada tipo de serviço deverá ser solicitada uma faixa de numeração.

Este método pode ser utilizado sob demanda, quantas vezes o cliente necessitar.

#### Solicitando Etiquetas via WebService

Método utilizado: **solicitaEtiquetas**

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:cli="http://cliente.bean.master.sigep.bsb.correios.com.br/">
   <soapenv:Header/>
   <soapenv:Body>
      <cli:solicitaEtiquetas>
         <!--Optional:-->
         <tipoDestinatario>tipo-desejada</tipoDestinatario>
         <!--Optional:-->
         <identificador>seu-identificador</identificador>
         <!--Optional:-->
         <idServico>seu-id-do-servico</idServico>
         <!--Optional:-->
         <qtdEtiquetas>1</qtdEtiquetas>
         <!--Optional:-->
         <usuario>seu-usuario</usuario>
         <!--Optional:-->
         <senha>sua-senha</senha>
      </cli:solicitaEtiquetas>
   </soapenv:Body>
</soapenv:Envelope>
``

## Autores

Alexandre Gama ([@alexandregama](https://github.com/alexandregama))
Adriano Saturno ([@saturno](https://github.com/saturno))
Eric Dallo ([@ericdallo](https://github.com/ericdallo))
Gabriel Gomes ([@ericdallo](https://github.com/ericdallo))
Douglas Campos ([@ericdallo](https://github.com/douglascampos))

## Suporte ou Contato

Está tendo algum problema no uso do SDK? Basta abrir uma [issue](https://github.com/alexandregama/correios-java-sdk/issues) indicando os passos do seu problema e responderemos o mais breve possível
