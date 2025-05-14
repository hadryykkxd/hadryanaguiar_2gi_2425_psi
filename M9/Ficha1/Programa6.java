package M9.Ficha1;
import java.util.Scanner;

public class Programa6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o número A: ");
        double a = input.nextDouble();
        
        System.out.print("Digite o número B: ");
        double b = input.nextDouble();
        
        double resultado = a - b;
        System.out.println("A - B = " + resultado);
    }
}