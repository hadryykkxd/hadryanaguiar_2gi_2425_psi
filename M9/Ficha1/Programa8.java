package M9.Ficha1;

import java.util.Scanner;

public class Programa8 {
    public static void main(String[] args) {
        final float PI = 3.14159f;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o raio da circunferência: ");
        float raio = input.nextFloat();
        
        float perimetro = 2 * PI * raio;
        System.out.println("O perímetro da circunferência é: " + perimetro);
    }
}
