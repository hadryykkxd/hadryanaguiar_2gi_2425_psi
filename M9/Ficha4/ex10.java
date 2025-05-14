public class ex10 {
    public static int somaAlgarismos(int numero) {
        if (numero <= 0) {
            System.out.println("Número inválido");
            return -1;
        }
        int soma = 0;
        while (numero > 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }

    public static void main(String[] args) {
        System.out.println("A soma dos algarismos de 251 é: " + somaAlgarismos(251));
    }
}