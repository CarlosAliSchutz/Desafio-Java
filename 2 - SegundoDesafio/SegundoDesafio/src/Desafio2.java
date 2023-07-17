import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        BigDecimal valor = scanner.nextBigDecimal();

        if (valor.compareTo(BigDecimal.ZERO) == 0) {
            System.out.println("Não é necessário troco.");
        } else {
            int[] valoresNotas = { 100, 50, 20, 10, 5, 2 };
            BigDecimal[] valoresMoedas = {
                    BigDecimal.ONE, BigDecimal.valueOf(0.5), BigDecimal.valueOf(0.25),
                    BigDecimal.valueOf(0.1), BigDecimal.valueOf(0.05), BigDecimal.valueOf(0.01)
            };

            System.out.println("NOTAS:");
            for (int nota : valoresNotas) {
                int quantidadeNotas = valor.divide(BigDecimal.valueOf(nota)).intValue();
                valor = valor.remainder(BigDecimal.valueOf(nota));
                System.out.printf("%d nota(s) de R$ %d.00%n", quantidadeNotas, nota);
            }

            System.out.println("MOEDAS:");
            for (BigDecimal moeda : valoresMoedas) {
                int quantidadeMoedas = valor.divide(moeda).intValue();
                valor = valor.remainder(moeda);
                System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoedas, moeda);
            }
        }
        scanner.close();
    }
}