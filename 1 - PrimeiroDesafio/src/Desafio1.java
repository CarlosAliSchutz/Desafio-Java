import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desafio1 {

    public static void main(String[] args) {
        int[] entrada = { 10, 4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98 };


        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int numero : entrada) {
            if (numero < 0) {
                System.out.println(numero + " é negativo");
                return;
            }

            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        imprimirLista(pares);
        imprimirLista(impares);
    }

    private static void imprimirLista(List<Integer> lista) {
        for (int numero : lista) {
            System.out.println(numero);
        }
    }
}
