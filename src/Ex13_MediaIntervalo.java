import java.util.Scanner;

public class Ex13_MediaIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número inteiro (menor): ");
        int primeiro = scanner.nextInt();
        System.out.print("Informe o segundo número inteiro (maior): ");
        int segundo = scanner.nextInt();

        int soma = 0;
        int quantidade = 0;
        for (int i = primeiro; i <= segundo; i++) {
            soma += i;
            quantidade++;
        }

        double media = (double) soma / quantidade;
        System.out.println("Média aritmética dos números entre " + primeiro + " e " + segundo + ": " + media);
        scanner.close();
    }
}
