import java.util.Arrays;
import java.util.Scanner;

public class Ex07_Soma2Maiores3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextDouble();
        }

        Arrays.sort(valores);
        double soma = valores[1] + valores[2];
        System.out.println("A soma dos 2 maiores valores é: " + soma);
        scanner.close();
    }
}
