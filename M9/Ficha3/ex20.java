import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para verificar se é primo: ");
        int num = scanner.nextInt();
        
        boolean isPrimo = true;
        
        if (num <= 1) {
            isPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
        }
        
        if (isPrimo) {
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo");
        }
        
        scanner.close();
    }
}