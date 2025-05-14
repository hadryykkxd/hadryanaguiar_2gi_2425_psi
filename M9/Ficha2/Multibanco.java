package M9.Ficha2;
import java.util.Scanner;

public class Multibanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menu Multibanco:");
        System.out.println("1. Levantamento");
        System.out.println("2. Depósito");
        System.out.println("3. Pagamento de serviços");
        System.out.println("4. Fim");
        
        System.out.print("Escolha uma opção: ");
        int opcao = input.nextInt();
        
        switch(opcao) {
            case 1: System.out.println("Procedimento de levantamento"); break;
            case 2: System.out.println("Procedimento de depósito"); break;
            case 3: System.out.println("Procedimento de pagamento de serviços"); break;
            case 4: System.out.println("A terminar operação..."); break;
            default: System.out.println("Opção inválida");
        }
    }
}