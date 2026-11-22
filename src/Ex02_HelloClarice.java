import java.util.Scanner;

public class Ex02_HelloClarice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o seu nome: ");
        String nomeDoUsuario = scanner.nextLine();
        System.out.println("Olá, " + nomeDoUsuario);
        scanner.close();
    }
}
