package M9.Ficha1;

import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        
        System.out.println("Chamo-me " + nome + " e tenho " + idade + " anos");
    }
}