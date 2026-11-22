import java.util.Scanner;

public class Ex19_Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o lado A: ");
        double a = scanner.nextDouble();
        System.out.print("Informe o lado B: ");
        double b = scanner.nextDouble();
        System.out.print("Informe o lado C: ");
        double c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os valores informados formam um triângulo.");
        } else {
            System.out.println("Os valores informados NÃO formam um triângulo.");
        }
        scanner.close();
    }
}
