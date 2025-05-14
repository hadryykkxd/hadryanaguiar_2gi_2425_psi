package M9.Ficha1;

import java.util.Scanner;

public class Programa10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a nota do aluno 1: ");
        float nota1 = input.nextFloat();
        
        System.out.print("Digite a nota do aluno 2: ");
        float nota2 = input.nextFloat();
        
        System.out.print("Digite a nota do aluno 3: ");
        float nota3 = input.nextFloat();
        
        System.out.print("Digite a nota do aluno 4: ");
        float nota4 = input.nextFloat();
        
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média da turma é: " + media);
    }
}
