public class Ex23_NaoContaComigo {
    public static void main(String[] args) {
        for (int grupo = 1; grupo <= 20; grupo++) {
            StringBuilder linha = new StringBuilder();
            linha.append("(").append(grupo).append(", ");
            for (int i = 1; i <= 10; i++) {
                linha.append(i);
                if (i < 10) {
                    linha.append(" ");
                }
            }
            linha.append(")");
            System.out.println(linha);
        }
    }
}
