package M9.Ficha2;
import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = input.nextInt();
        
        if((ano % 400 == 0) || (ano % 100 != 0 && ano % 4 == 0)) {
            System.out.println("O ano " + ano + " é bissexto");
        } else {
            System.out.println("O ano " + ano + " não é bissexto");
        }
    }
}