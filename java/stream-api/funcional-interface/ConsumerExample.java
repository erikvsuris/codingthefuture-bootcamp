import java.util.Arrays;
import java.util.List;

public class ConsumerExample {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        /*
        Consumer<Integer> imprimirNumerosPares = numero -> {
            if(numero%2 == 0) {
                System.out.println(numero);
            }
        };

        numeros.stream().forEach(imprimirNumerosPares);
        */

        numeros.forEach(n -> {
            if (n%2 == 0) System.out.println(n);
        });
    }

}