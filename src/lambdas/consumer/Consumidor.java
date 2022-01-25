package lambdas.consumer;

import lambdas.predicate.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
/*
    consumer é uma function q n retorna nada
 */
public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.getNome());

        Produto produto1 = new Produto("Caneta", 12.34, 0.09);
        Produto produto2 = new Produto("Notebook", 2987.99, 0.25);
        Produto produto3 = new Produto("Caderno", 19.90, 0.03);
        Produto produto4 = new Produto("Borracha", 7.80, 0.18);
        Produto produto5 = new Produto("Lapis", 4.39, 0.19);
        List<Produto> produtos = Arrays.asList(produto1, produto2, produto3, produto4, produto5);
        produtos.forEach(imprimir );
        produtos.forEach(p -> System.out.println(p.getPreco()));
        produtos.forEach(System.out::println);
    }

}
