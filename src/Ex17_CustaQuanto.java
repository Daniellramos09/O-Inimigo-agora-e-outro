import java.util.Scanner;

public class Ex17_CustaQuanto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o custo de fábrica do carro (R$): ");
        double custoFabrica = scanner.nextDouble();

        double distribuidor = custoFabrica * 0.28;
        double impostos = custoFabrica * 0.45;
        double custoFinal = custoFabrica + distribuidor + impostos;

        System.out.printf("Custo final ao consumidor: R$ %.2f%n", custoFinal);
        scanner.close();
    }
}
