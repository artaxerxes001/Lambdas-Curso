package lambdas.Function;

import java.util.function.Function;

/*
    function interface que aceita um unico argumento e produz um resultado <Tipo de argumento, Tipo de retorno>

    Composição de função usar uma função dentro de outra
 */
public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

        Function<String, String> oResultadoE= valor -> "O resultado é: "+ valor;

        Function<String, String> empolgado = valor -> valor + "!!!";
/*
    so é possivel fazer composição de funções se o valor de retorno de uma for o tipo de de entrada da outra <Interger, String> --> <String, String>
 */
        var resultadoFinal = parOuImpar
                .andThen(oResultadoE) // essa sera a segunda função a ser executada
                .andThen(empolgado) // essa sera a ultima função a ser executada recebendo o valor String como parametro
                .apply(23); // o applay foi passado para a primeira função que no caso é o parOuImpar
        System.out.println(resultadoFinal);
    }
}
