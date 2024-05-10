# IPhone

Aplicação que simula o funcionamento de um IPhone em Java.

O projeto atende um desafio de projeto da seção __Programação Orientada a Objetos em Java__ do __bootcamp Santander 2024 - Backend com Java__.

Os requisitos do projeto podem ser verificados [aqui](https://github.com/digitalinnovationone/trilha-java-basico/blob/main/desafios/poo/README.md).

## Stack

Java 22.0.1.

## Execução

Primeiramente, escolha uma localização para a pasta do projeto em seu computador e clone o repositório:

```git clone git@github.com:aldeoliveira/dio-java-iphone.git```

Utilize o método _main_ em _src/Cliente.java_ para testar o objeto IPhone. Só é necessário que ele seja instanciado por:

```IPhone meuIPhone = new IPhone()```

Depois, execute o código com:

```java src/Cliente.java```

## Funcionamento

A aplicação fornece um objeto, o IPhone, que une as funções de três outros objetos: um aparelho eletrônico, um tocador de música e um navegador de internet.

### Funcionamento como aparelho telefônico

#### .ligar(numero)

Recebe um número de telefone do tipo _String_. Imprime no terminal uma mensagem indicando que está ligando para o número fornecido.

```
IPhone meuIPhone = new IPhone;

String numeroContato = "999998888";
meuIphone.ligar(numeroContato);
```

#### .atender()

Imprime no terminal que está atendendo a chamada.

#### .iniciarCorreioVoz()

Imprime no terminal que iniciou o correio de voz.

### Funcionamento como tocador de música

#### .selecionarMusica(musica)

Recebe o nome de uma música, no tipo _String_. Informa no terminal que a música foi selecionada.

```
IPhone meuIPhone = new IPhone;

String nomeMusica = "Us and Them";
meuIphone.selecionarMusica(nomeMusica);
```

#### .tocar()

Informa no terminal que iniciou o tocador.

#### .pausar()

Informa no terminal que pausou o tocador.

### Funcionamento como navegador de internet

#### .exibirPagina(url)

Recebe a url de uma página na internet, com o tipo _String_. Imprime no terminal que acessou a página.

```
IPhone meuIPhone = new IPhone;

String urlDio = "dio.me";
meuIphone.ligar(urlDio);
```

#### .adicionarNovaAba()

Informa no terminal que adicionou uma nova aba à janela do navegador.

#### .atualizarPagina()

Informa no terminal que atualizou a página.

## Diagrama UML

O diagrama no padrão UML da estrutura implementada está disponível no arquivo _docs/iphone.drawio_.

---

__*Bom proveito!*__
