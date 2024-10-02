# Anotações

***

## Programação Orientada a Objetos
- ### [Terça-feira, 24/09/2024 15:25]
> **classes** servem para padronizar os **objetos**.

- ### [Quinta-feira, 26/09/2024 14:26]
> Os **modificadores de acesso** em Java são palavras-chave que controlam a visibilidade de atributos, métodos e classes, permitindo **proteger o acesso** a eles de outras classes.
>  Os principais modificadores de acesso em Java são:
>- **Public** - O **mais permissivo**, permitindo que qualquer classe acesse os membros públicos. <br> <br>
>- **Private** - O **mais restritivo**, permitindo apenas à classe que define o membro acessar os membros privados.  <br> <br>
>- **Protected** - **Intermediário entre public e private**, permitindo que classes descendentes da classe que define o membro acessem os membros protected. <br> <br>
>- **Default** - **Acesso padrão** (privado do pacote), permitindo que **apenas classes do mesmo pacote** acessem o método. **Não há uma palavra-chave para acesso padrão, sendo necessário apenas omitir o modificador de acesso**. <br> <br>
> O uso correto dos modificadores de acesso pode ajudar a: <br> <br>
>- **Encapsular**, protegendo os membros de uma classe e evitando alterações inadequadas nos dados.
>- **Flexibilizar**, permitindo mudanças internas na classe sem afetar as classes que a utilizam.
>- **Manter**, facilitando a manutenção ao limitar a interação entre as classes.

- ### [Segunda-Feira, 30/09/2024]
> **"@Override"** possibilita **sobreescrever** algum método herdado:
> ``` java
> @Override 
> public int getDuracaoEmMinutos() { 
>     return super.getDuracaoEmMinutos(); 
> }
> ```

> - O **polimorfismo** é a capacidade de objetos de diferentes classes responderem de forma diferente à mesma mensagem.
> Isso permite que um objeto se comporte de maneiras diversas, dependendo do contexto.
> O polimorfismo é um conceito fundamental na POO e pode ser útil para criar modelos de dados flexíveis e reutilizáveis.

***