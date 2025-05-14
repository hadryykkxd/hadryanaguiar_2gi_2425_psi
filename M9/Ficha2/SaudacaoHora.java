package M9.Ficha2;
import java.util.Scanner;
import java.time.LocalTime;

public class SaudacaoHora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a hora atual (0-23): ");
        int hora = input.nextInt();
        
        if(hora >= 6 && hora < 12) {
            System.out.println("Bom dia");
        } else if(hora >= 12 && hora < 20) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }
}