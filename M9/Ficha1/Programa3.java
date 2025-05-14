package M9.Ficha1;

import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro nome: ");
        String nome1 = input.nextLine();
        
        System.out.print("Digite o segundo nome: ");
        String nome2 = input.nextLine();
        
        System.out.println("Este programa foi criado por " + nome1 + " e por " + nome2);
    }
}
