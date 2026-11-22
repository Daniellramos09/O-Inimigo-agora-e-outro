import java.util.Scanner;

public class Ex03_ABitOfInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o seu nome: ");
        String nomeDoUsuario = scanner.nextLine();
        System.out.print("Informe a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Olá, " + nomeDoUsuario + ", sua idade é " + idade);
        scanner.close();
    }
}
