import java.util.Scanner;

public class CirculoTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        Circulo circulo = new Circulo(raio);

        System.out.println("Raio: " + circulo.saberRaio());
        System.out.println("Perímetro: " + circulo.calculaPerimetro());
        System.out.println("Área: " + circulo.calculaArea());
        
        scanner.close();
    }
}