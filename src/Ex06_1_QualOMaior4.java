import java.util.Scanner;

public class Ex06_1_QualOMaior4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maior = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Informe o " + i + "º valor: ");
            double valor = scanner.nextDouble();
            if (valor > maior) {
                maior = valor;
            }
        }

        System.out.println("O maior valor é: " + maior);
        scanner.close();
    }
}
