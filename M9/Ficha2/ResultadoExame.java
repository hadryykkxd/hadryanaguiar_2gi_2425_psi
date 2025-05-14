package M9.Ficha2;
import java.util.Scanner;

public class ResultadoExame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a classificação do exame: ");
        int nota = input.nextInt();
        
        if(nota >= 10) {
            System.out.println("Parabéns");
        } else {
            System.out.println("Marque um novo exame");
        }
    }
}