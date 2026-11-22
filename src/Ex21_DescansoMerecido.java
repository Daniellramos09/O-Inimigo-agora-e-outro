import java.time.Year;
import java.util.Scanner;

public class Ex21_DescansoMerecido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual = Year.now().getValue();

        System.out.print("Informe o número do empregado (código): ");
        int codigo = scanner.nextInt();

        System.out.print("Informe o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Informe o ano de ingresso na empresa: ");
        int anoIngresso = scanner.nextInt();

        int idade = anoAtual - anoNascimento;
        int tempoTrabalho = anoAtual - anoIngresso;

        System.out.println("Empregado código: " + codigo);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }
        scanner.close();
    }
}
