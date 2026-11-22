import java.util.Scanner;

public class Ex16_VotoSecreto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número total de eleitores do município: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Informe o percentual de votos brancos (%): ");
        double percBrancos = scanner.nextDouble();

        System.out.print("Informe o percentual de votos válidos (%): ");
        double percValidos = scanner.nextDouble();

        System.out.print("Informe o percentual de votos nulos (%): ");
        double percNulos = scanner.nextDouble();

        double qtdBrancos = totalEleitores * (percBrancos / 100.0);
        double qtdValidos = totalEleitores * (percValidos / 100.0);
        double qtdNulos = totalEleitores * (percNulos / 100.0);

        System.out.printf("Votos brancos: %.0f (%.2f%%)%n", qtdBrancos, percBrancos);
        System.out.printf("Votos válidos: %.0f (%.2f%%)%n", qtdValidos, percValidos);
        System.out.printf("Votos nulos:   %.0f (%.2f%%)%n", qtdNulos, percNulos);
        scanner.close();
    }
}
