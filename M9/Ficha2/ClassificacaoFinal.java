package M9.Ficha2;
import java.util.Scanner;

public class ClassificacaoFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nota do 1º teste: ");
        float teste1 = input.nextFloat();
        
        System.out.print("Nota do 2º teste: ");
        float teste2 = input.nextFloat();
        
        System.out.print("Nota do 3º teste: ");
        float teste3 = input.nextFloat();
        
        float finalNota = teste1*0.2f + teste2*0.5f + teste3*0.3f;
        
        System.out.println("\nNotas obtidas:");
        System.out.println("1º teste: " + teste1);
        System.out.println("2º teste: " + teste2);
        System.out.println("3º teste: " + teste3);
        System.out.println("Nota final: " + finalNota);
        
        if(finalNota >= 10) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}