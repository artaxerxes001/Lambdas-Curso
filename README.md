# Expressão Lambdas

### O que é ?

São blocos de codigo pequenos que recebem um parametro e retornam um valor.

---

### Para que servem ?

Servem para implementar metodo de inteface funcional, de forma simples e eficiente, criando funções poderosas e enxutas.

---

### Sintaxe

Para a forma simples de uma Expressão Lambda com um parametro e uma expressão:

parametro -> expressão
Para usar mais de um parametro, colocam se entre parenteses:

(parametro1, parametro2)-> expressão
Para usar expressões complexas devemos colocar dentro de um bloco, com retorno.

(parametro1, parametro2) -> {codigo}
---

### Como usar ?

Podemos usar as expressões Lambdas de diversas formas:

* Armazenar valor de uma Expressão Lambda em uma variavel. Exemplo uso da inteface UnaryOperator para fazer soma de dois
  numeros

```java
import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
      
        UnaryOperator<Integer> maisDois = n -> n + 2;
     
        System.out.println(maisDois);
    }
}
```
### Vantagem
Lambdas trazem ao java caracteristicas funcionais, desse modo podemos agregar, conseitos do paradigma funcional dentro do java que é uma linguagem OO (orientada a Objeto). Com a evoluão java troce varias melhorias e hoje, podemos  usar API, metodos ou funções, em que o programador não precisa necessariamente se preocupar com a implementação do codigo em API, metodos ou funções e sim ser capaz de focar apenas na regra de negocio.
