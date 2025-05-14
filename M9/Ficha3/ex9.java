import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos números deseja inserir? ");
        int n = scanner.nextInt();
        
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = scanner.nextInt();
            soma += num;
            maior = Math.max(maior, num);
            menor = Math.min(menor, num);
        }
        
        System.out.println("Soma: " + soma);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        
        scanner.close();
    }
}