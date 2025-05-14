import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para calcular o fatorial: ");
        int num = scanner.nextInt();
        
        long fatorial = 1;
        
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        
        System.out.println(num + "! = " + fatorial);
        
        scanner.close();
    }
}