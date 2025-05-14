public class ex8 {
    public static double volumeCilindro(double altura, double raio) {
        return 3.14159 * raio * raio * altura;
    }

    public static void main(String[] args) {
        System.out.println("O volume de um cilindro com altura 10 e raio 5 é: " + volumeCilindro(10, 5));
    }
}