public class ex14 {
    public static void listaNumeros(int minimo, int maximo) {
        for (int i = minimo; i <= maximo; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Números entre 1 e 5: ");
        listaNumeros(1, 5);
    }
}