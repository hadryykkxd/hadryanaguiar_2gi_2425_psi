import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int idade;
        
        do {
            System.out.print("Digite sua idade (0-100): ");
            idade = scanner.nextInt();
            
            if (idade < 0 || idade > 100) {
                System.out.println("Idade inválida. Tente novamente.");
            }
        } while (idade < 0 || idade > 100);
        
        System.out.println("Idade aceite");
        
        scanner.close();
    }
}