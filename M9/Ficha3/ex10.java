import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int num;
        
        do {
            System.out.print("Digite um número (0 para terminar): ");
            num = scanner.nextInt();
            soma += num;
        } while (num != 0);
        
        System.out.println("A soma dos números é: " + soma);
        
        scanner.close();
    }
}