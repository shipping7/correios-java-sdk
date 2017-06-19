[![Stories in Ready](https://badge.waffle.io/alexandregama/correios-java-sdk.png?label=ready&title=Ready)](https://waffle.io/alexandregama/correios-java-sdk)
<img align="right"  src="https://raw.githubusercontent.com/shipping7/correios-java-sdk/images/correios-java-sdk-logo.png?raw=true" width="120" height="120"/>
# Correios Java SDK

Quer um resumo simples e prático? Visite a [página oficial](http://shipping7.github.io/correios-java-sdk/) do SDK :)

Se mantenha atualizado sobre as novas versões, features novas e possíveis bugs (raros : P) através do nosso Twitter [@correios_sdk](https://twitter.com/correios_sdk)

### Correios Rastreio Java SDK.

Este SDK foi criado para facilitar a sua vida quando precisar fazer integração com os seguintes serviços dos Correios:

- [Rastreios de Objetos](http://www2.correios.com.br/sistemas/rastreamento/) 
- [Geração de Etiquetas](https://www.correios.com.br/para-sua-empresa/comercio-eletronico/sistemas-geradores-de-etiquetas-de-enderecamento)
- [PLPs - Pré Lista de Postagem](https://elo7.zendesk.com/hc/pt-br/articles/201894124-O-que-%C3%A9-a-PLP-pr%C3%A9-lista-de-postagem-)

O SDK é totalmente **Free** e **Open Source**! Como você deve ter notado, usamos o GitHub, então sinta-se à vontade para fazer alterações necessárias e [abrir um Pull Request](https://help.github.com/articles/using-pull-requests/) pra gente :)

O SDK não tem alguma funcionalidade que você deseja? Não se preocupe, basta criar uma [issue](https://github.com/alexandregama/correios-java-sdk/issues) explicando o que você gostaria e implementaremos pra você :)

# Rastreio de Objetos

Veja como é simples usar o SDK para Rastrear um objeto nos correios em 2 passos:

1 - Com as suas credenciais em mãos, instancie o seguinte objeto:

```java
CorreiosCredenciais credenciais = new CorreiosCredenciais("seu-usuario", "sua-senha");
```

2 - Em seguida basta invocar o método para retornar os Eventos do objeto desejado:

```java
CorreiosRastreioApi correiosApi = new CorreiosRastreioClientApi(credenciais);

DetalhesRastreio pacoteRastreado =  correiosApi
	.buscaPacoteRastreadoUsandoOCodigo("codigo_do_seu_objeto")
	.emPortugues()
	.comTodosOsEventos()
	.getDetalhesRastreio();
```

O código do seu objeto deve ser algo parecido com **DU500853238BR**.

O código completo fica como o a seguir:

```java
@Test
public void deveriaRetornarOsEventosAPartirDeUmTrackingCode() throws Exception {
	CorreiosCredenciais credenciais = new CorreiosCredenciais("seu-usuario", "sua-senha");
	
	CorreiosRastreioApi correiosApi = new CorreiosRastreioClientApi(credenciais);
	
	DetalhesRastreio pacoteRastreado =  correiosApi
		.buscaPacoteRastreadoUsandoOCodigo("codigo_do_seu_objeto")
		.emPortugues()
		.comTodosOsEventos()
		.getDetalhesRastreio();
		
	System.out.println(pacoteTraqueado);
}
```

Simples assim!

Note que usamos uma [Fluent Interface](https://en.wikipedia.org/wiki/Fluent_interface) que já indica pra você quais métodos devem ser invocados e nem deixa você errar!

### Buscando Uma Lista de Objetos

Também é possível buscar mais de um Objeto através de uma **lista de Códigos**, como é mostrado a seguir:

```java
@Test
public void deveriaRetornarOsEventosAPartirDeUmaListaDeTrackingCodes() throws Exception {
	CorreiosCredenciais credenciais = new CorreiosCredenciais("username", "password");
		
	CorreiosRastreioApi correiosApi = new CorreiosRastreioClientApi(credenciais);
		
	List<String> trackingCodes = new ArrayList<>();
	trackingCodes.add("DU500853237BR");
	trackingCodes.add("DU496842125BR");
		
	DetalhesRastreio detalhesComLista = correiosApi
		.buscaPacotesRastreadosPelaListaDeTrackings(trackingCodes)
		.emPortugues()
		.comTodosOsEventos()
		.getDetalhesRastreio();
		
	System.out.println(detalhesComLista);
}
```

Note que agora temos o objeto DetalhesRastreio, que por sua vez contém uma lista com todas as informações que você precisa! Awesome!

### Informações de Retorno

Os Correios enviam diversas informações relacionadas ao objeto que está sendo pesquisado. 

O objeto **DetalhesRastreio** é responsável por guardar essas informações. Dê uma olhadinha na documentação na Wiki ;)

# Etiquetas dos Correios

O **SIGEP** Web, que é o sistema dos Correios, gera etiquetas de endereçamento padronizadas, com códigos de barra para o **número de rastreamento** e para o **CEP**, facilitando a leitura ótica destas informações nas máquinas de triagem dos Correios, que realizam o roteamento automatizado das encomendas. 

Você também pode inserir a logomarca de sua loja virtual nas etiquetas.

### Como funciona?

Este método retorna numeração de registro(s) dos Correios para futura postagem de objeto(s). O número de registro é o identificador do objeto no fluxo postal da ECT, sendo utilizado como chave para rastreamento, conhecido também como **Tracking Code** ou **Código de Postagem**.

Com o atendimento da solicitação, o número de registro fica reservada para o **CNPJ** informado. Quando da preparação do objeto para postagem, cada número poderá ser usado para geração do rótulo de postagem.

O método contempla o pedido de um ou mais números, por exemplo:

- Situação 1: 
Após a finalização de um processo (Ex: Compra de um produto na loja online), obter um número do registro da encomenda a ser postada.

- Situação 2: 
Aguardar a finalização de uma lista com **N** objetos a ser postada, solicitando em seguida, uma faixa de numeração.

- Situação 3: 
Solicitar uma quantidade maior de etiquetas e **gerenciá-la localmente** de acordo com os serviços utilizados, com rotina de controle do estoque das etiquetas, consumindo a numeração deste estoque. 

Recomendamos solicitar uma faixa de etiquetas conforme previsão de postagem do dia por serviço (PAC, SEDEX, etc). Dessa forma quando se esgotar o estoque de etiquetas para o serviço, efetuar nova solicitação. 

Esse processo evita a dependência de solicitação on-line de etiquetas, permitindo um controle local no sistema cliente.

Para cada tipo de serviço deverá ser solicitada uma faixa de numeração.

Este método pode ser utilizado sob demanda, quantas vezes o cliente necessitar.

### Solicitando Etiquetas usando o SDK

**Passo 1 - Criando a Credencial**

Precisamos criar as credenciais para a API da seguinte forma:

```java
CorreiosCredenciais credenciais = new CorreiosCredenciais("seu-usuario", "sua-senha");
```

**Passo 2 - Criando o Contrato da Empresa**

Além das credenciais, você precisa ter o **número do seu contrato**, número do **cartão de postagem** e o seu cnpj:

```java
ContratoEmpresa contrato = new ContratoEmpresa(cnpj, numeroDoContrato, numeroDoCartaoDePostagem);
```

**Passo 3 - Solicitando a Etiqueta via SDK**

Agora com as Credenciais e o Contrato em mãos, basta usar a classe **CorreiosApi**, solicitando:

- A quantidade desejada de etiquetas
- O serviço de entrega desejado

```java
CorreiosApi api = new CorreiosApi();
List<Etiqueta> etiquetas = api
	.etiquetas(credenciais)
	.solicita(2)
	.usandoServicoDeEntrega(SEDEX_COM_CONTRATO)
	.comContrato(contrato);
```

O código completo de teste poderia ser o seguinte:

```java
public class CorreiosEtiquetaApiTest {

	private CorreiosCredenciais credenciais;
	private String cnpj = "123456789";
	private String numeroDoContrato = "321564987";
	private String numeroDoCartaoDePostagem = "654789123";

	@Before
	public void startUp() {
		credenciais = new CorreiosCredenciais("seu-usuario", "sua-senha");
	}

	@Test
	public void deveriaSolicitarEtiquetasAosCorreios() throws Exception {
		CorreiosApi api = new CorreiosApi();

		ContratoEmpresa contrato = new ContratoEmpresa(cnpj, numeroDoContrato, numeroDoCartaoDePostagem);

		List<Etiqueta> etiquetas = api
			.etiquetas(credenciais)
			.solicita(2)
			.usandoServicoDeEntrega(SEDEX_COM_CONTRATO)
			.comContrato(contrato);

		assertThat(etiquetas.size()).isGreaterThan(1);
	}

}
```

# Baixando a dependência

_Maven_
```xml
<dependency>
  <groupId>br.com.correios</groupId>
  <artifactId>correios-java-sdk</artifactId>
  <version>{última-versão-desejada}</version>
  <type>pom</type>
</dependency>
```

_Gradle_
```groovy
compile 'br.com.correios:correios-java-sdk:{{última-versão-desejada}}'
```

# Autores

Alexandre Gama ([@alexandregama](https://github.com/alexandregama))

Adriano Saturno ([@saturno](https://github.com/saturno))

Eric Dallo ([@ericdallo](https://github.com/ericdallo))

Gabriel Gomes ([@gabriellimagomes](https://github.com/gabriellimagomes))

Denis Schimidt ([@denis-schimidt](https://github.com/denis-schimidt))

Douglas Campos ([@douglascampos](https://github.com/douglascampos))

# Suporte ou Contato

Está tendo algum problema no uso do SDK? Basta abrir uma [issue](https://github.com/alexandregama/correios-java-sdk/issues) indicando os passos do seu problema e responderemos o mais breve possível :)
