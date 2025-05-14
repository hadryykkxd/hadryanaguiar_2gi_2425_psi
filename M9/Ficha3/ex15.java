import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double soma = 0;
        int count = 0;
        double num;
        
        do {
            System.out.print("Digite um número positivo (negativo para terminar): ");
            num = scanner.nextDouble();
            
            if (num >= 0) {
                soma += num;
                count++;
            }
        } while (num >= 0);
        
        if (count > 0) {
            double media = soma / count;
            System.out.println("A média dos números positivos é: " + media);
        } else {
            System.out.println("Nenhum número positivo foi inserido");
        }
        
        scanner.close();
    }
}