public class ex12 {
    public static void desenhaLinha(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        desenhaLinha(10);
    }
}