import java.util.Scanner;

public class Ex14_PassouNoTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aprovados = 0;
        String resposta;

        do {
            double soma = 0;
            for (int i = 1; i <= 6; i++) {
                System.out.print("Informe a " + i + "ª nota do aluno: ");
                soma += scanner.nextDouble();
            }

            double media = soma / 6.0;
            System.out.printf("Média final: %.2f%n", media);

            if (media >= 6.5) {
                System.out.println("Aluno aprovado!");
                aprovados++;
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.print("Calcular a média de outro aluno Sim/Não? (S/N): ");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("S"));

        System.out.println("Quantidade de alunos aprovados: " + aprovados);
        scanner.close();
    }
}
