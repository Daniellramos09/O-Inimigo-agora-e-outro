import java.util.Arrays;
import java.util.Scanner;

public class Ex07_1_Soma2Maiores5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextDouble();
        }

        Arrays.sort(valores);
        double soma = valores[3] + valores[4];
        System.out.println("A soma dos 2 maiores valores é: " + soma);
        scanner.close();
    }
}
