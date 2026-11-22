import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex25_InvertendoTudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elementos = new String[12];

        System.out.println("Informe 12 elementos (números ou letras):");
        for (int i = 0; i < 12; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            elementos[i] = scanner.next().replace(",", "").trim();
        }

        String[] invertido = elementos.clone();
        for (int i = 0; i < invertido.length / 2; i++) {
            String temp = invertido[i];
            invertido[i] = invertido[invertido.length - 1 - i];
            invertido[invertido.length - 1 - i] = temp;
        }

        System.out.println("Saída 1: " + String.join(", ", invertido));

        List<String> numeros = new ArrayList<>();
        List<String> outros = new ArrayList<>();
        for (String item : invertido) {
            if (isNumero(item)) {
                numeros.add(item);
            } else {
                outros.add(item);
            }
        }

        String saidaNumeros = String.join(", ", numeros);
        String saidaOutros = String.join(", ", outros);
        if (!numeros.isEmpty() && !outros.isEmpty()) {
            System.out.println("Saída 2: " + saidaNumeros + " - " + saidaOutros);
        } else {
            System.out.println("Saída 2: " + String.join(", ", invertido));
        }

        scanner.close();
    }

    private static boolean isNumero(String valor) {
        try {
            Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
