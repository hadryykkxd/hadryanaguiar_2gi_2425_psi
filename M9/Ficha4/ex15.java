public class ex15 {
    public static int fatorial(int numero) {
        if (numero == 0 || numero == 1) return 1;
        int fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        System.out.println("Fatorial de 5: " + fatorial(5));
    }
}