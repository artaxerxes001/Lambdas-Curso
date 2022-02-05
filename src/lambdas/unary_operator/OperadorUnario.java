package lambdas.unary_operator;

import java.util.function.UnaryOperator;

/*
    Unary Operator o tipo de parametro de entrada é o mesmo tipo de retorno, ideal para composição de funções
 */
public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        var resultado = maisDois    //  1º execução
                .andThen(vezesDois)     //  2º execução
                .andThen(aoQuadrado)    //  3º execução
                .apply(0);

        System.out.println(resultado);

        // usando o compose(), ele faz a operação do ultimo para  o primeoro
        resultado = aoQuadrado  //  3º execução
                .compose(vezesDois) //  2º execução
                .compose(maisDois)  //  1º execução
                .apply(0);
        System.out.println(resultado);
    }
}
