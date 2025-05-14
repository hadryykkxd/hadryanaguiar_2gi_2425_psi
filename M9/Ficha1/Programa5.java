package M9.Ficha1;

import java.util.Scanner;

public class Programa5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();
        
        double soma = num1 + num2;
        System.out.println("A soma é: " + soma);
    }
}
