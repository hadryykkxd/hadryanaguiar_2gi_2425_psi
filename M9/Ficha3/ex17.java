import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int menos18 = 0;
        int mais65 = 0;
        int idade;
        
        do {
            System.out.print("Digite uma idade (-1 para terminar): ");
            idade = scanner.nextInt();
            
            if (idade >= 0) {
                if (idade < 18) {
                    menos18++;
                } else if (idade > 65) {
                    mais65++;
                }
            }
        } while (idade != -1);
        
        System.out.println("Total de pessoas com menos de 18 anos: " + menos18);
        System.out.println("Total de pessoas com mais de 65 anos: " + mais65);
        
        scanner.close();
    }
}