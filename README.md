# Design Patterns: Factory Method

Este repositório contém um exemplo de implementação do padrão de projeto Factory Method em Java.

## O que é o padrão Factory Method?

O padrão Factory Method é um dos padrões de criação definidos no livro "Design Patterns: Elements of Reusable Object-Oriented Software" https://github.com/BuiTanLan/code-with-engineering-playbook/blob/main/docs/design/design-patterns/README.md.

Ele fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados. 

## Como usar este exemplo

Este exemplo contém uma classe abstrata `Creator` que define um método `factoryMethod()` para criar objetos. As subclasses de `Creator` implementam esse método para criar objetos de diferentes tipos. 

Para executar este exemplo, basta executar o arquivo `main.java`. Ele criará objetos de diferentes tipos usando o método `factoryMethod()`.

## Referências

<a href="https://www.amazon.com.br/s?k=design+patterns+elements+of+reusable+object-oriented+software&adgrpid=1140194216435987&hvadid=71262224875612&hvbmt=be&hvdev=m&hvlocphy=688&hvnetw=o&hvqmt=e&hvtargid=kwd-71262654311736%3Aloc-20&hydadcr=5776_11235471&tag=msndesktopsta-20&ref=pd_sl_6hr3cduj3e_e">Aqui está o link para o livro “Design Patterns: Elements of Reusable Object-Oriented Software” na Amazon.com.br</a>
O livro foi escrito por Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides e é considerado um clássico moderno na área de programação orientada a objetos.

## Todo estudo foi assistido e baseado nesse repositorio: <a href="https://github.com/rinaldodev/design-patterns/tree/main/src/main/java/dev/rinaldo/designpatterns/creational">ReinaldoDev</a>
- Aula assistida: <a href="https://www.youtube.com/watch?v=-e9bFrcxG9E&t=384s">Torne FLEXÍVEL a CRIAÇÃO de objetos com FACTORY METHODS!</a>
