import java.util.Scanner;

public class Ex10_Parabens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Informe a nota da " + i + "ª avaliação: ");
            soma += scanner.nextDouble();
        }

        double media = soma / 4.0;
        System.out.println("Média do semestre: " + media);

        if (media >= 6.0) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        }
        scanner.close();
    }
}
