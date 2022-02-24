package lambdas.desafio;

import lambdas.predicate.Produto;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
           /*
    1. A partir do produto calcular o preço real (com desconto)
    2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (isento)
    3. Frete: >= 3000 (100) / < 3000 (50)
    4. : deixar duas casas decimais
    5. Formatar: R$ 1234,56
     */

        Function<Produto, Double> precoFinal = produto -> produto.getPreco() * (1 - produto.getDesconto());

        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arrendondar = preco -> Double.parseDouble(String.format("%.2f", preco).replace(",","."));

        Function<Double, String> formatar = preco -> ("R$ " + preco).replace(".",",");

        Produto produto = new Produto("iPad", 3235.89, 0.13);
        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arrendondar)
                .andThen(formatar)
                .apply(produto);
        System.out.println(preco);
    }


}
