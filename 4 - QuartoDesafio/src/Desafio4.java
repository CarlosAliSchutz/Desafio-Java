import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de casos de teste: ");
        int n = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a frase embaralhada: ");
            String linha = scanner.nextLine();
            String fraseOriginal = reconstruirFrase(linha);
            System.out.println("Frase decifrada: " + fraseOriginal);
        }

        scanner.close();
    }

    public static String reconstruirFrase(String linha) {
        int tamanho = linha.length();
        int meio = tamanho / 2;

        StringBuilder fraseOriginal = new StringBuilder();

        for (int i = meio - 1; i >= 0; i--) {
            fraseOriginal.append(linha.charAt(i));
        }

        for (int i = tamanho - 1; i >= meio; i--) {
            fraseOriginal.append(linha.charAt(i));
        }

        return fraseOriginal.toString();
    }
}
