public class ex13 {
    public static int potencia(int x, int z) {
        int resultado = 1;
        for (int i = 0; i < z; i++) {
            resultado *= x;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("2^3 = " + potencia(2, 3));
    }
}