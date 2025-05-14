public class ex6 {
    public static boolean quadradoPerfeito(int numero) {
        int raiz = (int) Math.sqrt(numero);
        return raiz * raiz == numero;
    }

    public static void main(String[] args) {
        System.out.println("9 é um quadrado perfeito? " + quadradoPerfeito(9));
    }
}