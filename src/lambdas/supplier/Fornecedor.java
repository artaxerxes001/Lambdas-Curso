package lambdas.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/*
       Supplier fornecedor ou supridor, serve para fornecer ou devolver algo, ñ recebe nenhum parametro e retorna alguma coisa
 */
public class Fornecedor {
    public static void main(String[] args) {
        Supplier<List<String>> umLista= () -> Arrays.asList("Ana","Bia","Lia","Gui");

        System.out.println(umLista.get());
    }
}
