package M9.Ficha1;

import java.util.Scanner;

public class Programa9 {
    public static void main(String[] args) {
        final float PI = 3.14159f;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o raio da circunferência: ");
        float raio = input.nextFloat();
        
        float area = PI * raio * raio;
        System.out.println("A área da circunferência é: " + area);
    }
}