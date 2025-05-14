import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int num;
        
        do {
            System.out.print("Digite um número (0 para terminar): ");
            num = scanner.nextInt();
            
            if (num >= 50 && num <= 200) {
                count++;
            }
        } while (num != 0);
        
        System.out.println("Foram digitados " + count + " números entre 50 e 200");
        
        scanner.close();
    }
}