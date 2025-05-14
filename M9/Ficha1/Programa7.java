package M9.Ficha1;

import java.util.Scanner;

public class Programa7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a base do retângulo: ");
        float base = input.nextFloat();
        
        System.out.print("Digite a altura do retângulo: ");
        float altura = input.nextFloat();
        
        float area = base * altura;
        System.out.println("A área do retângulo é: " + area);
    }
}
