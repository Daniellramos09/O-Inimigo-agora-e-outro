import java.util.Scanner;

public class Ex04_Losango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a diagonal maior do losango: ");
        double diagonalMaior = scanner.nextDouble();
        System.out.print("Informe a diagonal menor do losango: ");
        double diagonalMenor = scanner.nextDouble();
        double area = (diagonalMaior * diagonalMenor) / 2.0;
        System.out.println("Área do losango: " + area);
        scanner.close();
    }
}
