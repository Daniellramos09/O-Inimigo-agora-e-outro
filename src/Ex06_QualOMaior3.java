import java.util.Scanner;

public class Ex06_QualOMaior3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o 1º valor: ");
        double a = scanner.nextDouble();
        System.out.print("Informe o 2º valor: ");
        double b = scanner.nextDouble();
        System.out.print("Informe o 3º valor: ");
        double c = scanner.nextDouble();

        double maior = Math.max(a, Math.max(b, c));
        System.out.println("O maior valor é: " + maior);
        scanner.close();
    }
}
