import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número mínimo: ");
        int min = scanner.nextInt();
        
        System.out.print("Digite o número máximo: ");
        int max = scanner.nextInt();
        
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}