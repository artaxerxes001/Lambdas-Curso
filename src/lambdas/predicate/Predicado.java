package lambdas.predicate;

import java.util.function.Predicate;
/*
        predicate recebe um argumento, e retorna se é um valor verdadeiro ou falso
 */
public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750 ; //  a lambda esta calculando o preço com desconto e o valor fixo no caso 750 se é um produto caro retornara true

        Produto produto = new Produto("Notebook", 3893.89,0.15);
        System.out.println(isCaro.test(produto));
    }

}
