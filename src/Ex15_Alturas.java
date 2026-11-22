public class Ex15_Alturas {
    public static void main(String[] args) {
        int anacletoCm = 150;
        int felisbertoCm = 110;
        int anos = 0;

        while (felisbertoCm <= anacletoCm) {
            anacletoCm += 2;
            felisbertoCm += 3;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que Felisberto seja maior que Anacleto.");
        System.out.printf("Altura final - Anacleto: %.2fm | Felisberto: %.2fm%n",
                anacletoCm / 100.0, felisbertoCm / 100.0);
    }
}
