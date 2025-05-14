package M9.Ficha2;
import java.util.Scanner;

public class OrdenaNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();
        
        if(num1 < num2) {
            System.out.println(num1 + ", " + num2);
        } else {
            System.out.println(num2 + ", " + num1);
        }
    }
}