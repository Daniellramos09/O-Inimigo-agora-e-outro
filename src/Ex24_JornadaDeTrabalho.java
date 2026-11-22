import java.util.Scanner;

public class Ex24_JornadaDeTrabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int HORAS_MENSAIS_PADRAO = 40 * 4;

        System.out.print("Informe o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Informe o salário por hora (R$): ");
        double salarioHora = scanner.nextDouble();

        double salarioTotal;
        if (horasTrabalhadas > HORAS_MENSAIS_PADRAO) {
            double horasExtras = horasTrabalhadas - HORAS_MENSAIS_PADRAO;
            double valorHoraExtra = salarioHora * 1.5;
            salarioTotal = (HORAS_MENSAIS_PADRAO * salarioHora) + (horasExtras * valorHoraExtra);
        } else {
            salarioTotal = horasTrabalhadas * salarioHora;
        }

        System.out.printf("Salário total do funcionário: R$ %.2f%n", salarioTotal);
        scanner.close();
    }
}
