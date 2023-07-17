import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do array (n): ");
        int n = scanner.nextInt();

        System.out.print("Informe o valor alvo (k): ");
        int k = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Informe os elementos do array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = contarParesComDiferencaK(arr, k);
        System.out.println("Número de pares com diferença igual a " + k + ": " + count);

        scanner.close();
    }

    public static int contarParesComDiferencaK(int[] arr, int k) {
        Map<Integer, Integer> ocorrencias = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int valorAlvo1 = num + k;
            int valorAlvo2 = num - k;

            if (ocorrencias.containsKey(valorAlvo1)) {
                count += ocorrencias.get(valorAlvo1);
            }

            if (ocorrencias.containsKey(valorAlvo2)) {
                count += ocorrencias.get(valorAlvo2);
            }

            ocorrencias.put(num, ocorrencias.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}
