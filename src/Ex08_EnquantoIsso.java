import java.util.Scanner;

public class Ex08_EnquantoIsso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        double primeiro = scanner.nextDouble();

        System.out.print("Informe o segundo valor (maior que zero): ");
        double segundo = scanner.nextDouble();

        while (segundo <= 0) {
            System.out.print("Valor inválido! Informe um novo segundo valor (maior que zero): ");
            segundo = scanner.nextDouble();
        }

        double resultado = primeiro / segundo;
        System.out.println("Resultado da divisão: " + resultado);
        scanner.close();
    }
}
