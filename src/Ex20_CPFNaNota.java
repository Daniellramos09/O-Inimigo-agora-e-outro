import java.util.Scanner;

public class Ex20_CPFNaNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Informe a quantidade adquirida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Informe o preço unitário (R$): ");
        double precoUnitario = scanner.nextDouble();

        double valorVenda = quantidade * precoUnitario;
        double percentualDesconto;

        if (quantidade <= 5) {
            percentualDesconto = 2.0;
        } else if (quantidade <= 10) {
            percentualDesconto = 3.0;
        } else {
            percentualDesconto = 5.0;
        }

        double valorDesconto = valorVenda * (percentualDesconto / 100.0);
        double valorImposto = valorVenda * 0.20;
        double totalAPagar = valorVenda - valorDesconto;

        System.out.println("\n================ NOTA FISCAL ================");
        System.out.println("Produto:             " + nomeProduto);
        System.out.println("Quantidade:          " + quantidade);
        System.out.printf("Preço unitário:      R$ %.2f%n", precoUnitario);
        System.out.println("---------------------------------------------");
        System.out.printf("Valor da venda:      R$ %.2f%n", valorVenda);
        System.out.printf("Desconto (%.0f%%):       R$ %.2f%n", percentualDesconto, valorDesconto);
        System.out.printf("Imposto (20%%):       R$ %.2f%n", valorImposto);
        System.out.println("---------------------------------------------");
        System.out.printf("TOTAL A PAGAR:       R$ %.2f%n", totalAPagar);
        System.out.println("=============================================");
        scanner.close();
    }
}
