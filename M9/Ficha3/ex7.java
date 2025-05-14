import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantas notas deseja inserir? ");
        int n = scanner.nextInt();
        
        double soma = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a nota " + i + ": ");
            soma += scanner.nextDouble();
        }
        
        double media = soma / n;
        System.out.println("A média das notas é: " + media);
        
        scanner.close();
    }
}