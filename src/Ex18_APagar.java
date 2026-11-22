import java.util.Scanner;

public class Ex18_APagar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Informe o valor total das vendas (R$): ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.print("Informe o salário fixo mensal (R$ - inicial padrão 5000,00): ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Informe a comissão fixa por carro vendido (R$): ");
        double comissaoPorCarro = scanner.nextDouble();

        double totalComissaoCarros = carrosVendidos * comissaoPorCarro;
        double percentualVendas = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + totalComissaoCarros + percentualVendas;

        System.out.println("\n========= DETALHAMENTO DO PAGAMENTO =========");
        System.out.printf("Salário fixo mensal:             R$ %.2f%n", salarioFixo);
        System.out.printf("Carros vendidos:                 %d%n", carrosVendidos);
        System.out.printf("Comissão fixa por carro:         R$ %.2f%n", comissaoPorCarro);
        System.out.printf("Total comissão por carros:       R$ %.2f%n", totalComissaoCarros);
        System.out.printf("Valor total das vendas:          R$ %.2f%n", valorTotalVendas);
        System.out.printf("Percentual sobre vendas (5%%):    R$ %.2f%n", percentualVendas);
        System.out.println("---------------------------------------------");
        System.out.printf("Salário final do vendedor:       R$ %.2f%n", salarioFinal);
        System.out.println("=============================================");
        scanner.close();
    }
}
