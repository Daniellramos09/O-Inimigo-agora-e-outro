public class Ex22_ContaComigo {
    public static void main(String[] args) {
        int contador = 1;
        for (int grupo = 1; grupo <= 20; grupo++) {
            StringBuilder linha = new StringBuilder();
            linha.append("(").append(grupo).append(", ");
            for (int i = 0; i < 10; i++) {
                linha.append(contador);
                if (i < 9) {
                    linha.append(grupo == 1 ? " " : ", ");
                }
                contador++;
            }
            linha.append(")");
            System.out.println(linha);
        }
    }
}
