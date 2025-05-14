package M9.Ficha2;
import java.util.Scanner;

public class ComparaVinte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        
        if(numero > 20) {
            System.out.println("Maior que 20");
        } else if(numero == 20) {
            System.out.println("Igual a 20");
        } else {
            System.out.println("Menor que 20");
        }
    }
}