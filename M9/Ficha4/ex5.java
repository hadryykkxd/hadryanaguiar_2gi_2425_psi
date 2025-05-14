public class ex5 {
    public static int verificaPositivoNegativo(int numero) {
        if (numero > 0) return 1;
        else if (numero < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println("Verificação de -3: " + verificaPositivoNegativo(-3));
    }
}