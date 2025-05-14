public class AlmocoTeste {
    public static void main(String[] args) {
        Almoco almocoSegunda = new Almoco("Creme de cenoura", "Bacalhau com natas", "Salada de fruta", 6.29);
        Almoco almocoTerca = new Almoco("Caldo verde", "Lasanha", "Arroz doce", 4.53);

        System.out.println(almocoSegunda);
        System.out.println(almocoTerca);

        double precoTotal = almocoSegunda.getPreco() + almocoTerca.getPreco();
        System.out.println("Preço total dos almoços: " + precoTotal);
    }
}