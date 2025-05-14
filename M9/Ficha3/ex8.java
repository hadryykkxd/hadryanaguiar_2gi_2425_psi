import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantas pessoas deseja inserir? ");
        int n = scanner.nextInt();
        
        int menores = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            if (idade < 18) {
                menores++;
            }
        }
        
        System.out.println("Num total de " + n + " pessoas, " + menores + " são menores de idade");
        
        scanner.close();
    }
}