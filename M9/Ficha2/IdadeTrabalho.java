package M9.Ficha2;
import java.util.Scanner;

public class IdadeTrabalho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        
        if(idade >= 18 && idade <= 65) {
            System.out.println("Tem idade para trabalhar");
        } else {
            System.out.println("Está a estudar ou reformado");
        }
    }
}