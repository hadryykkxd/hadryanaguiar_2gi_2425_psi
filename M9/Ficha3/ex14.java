import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double soma = 0;
        int count = 0;
        double nota;
        
        do {
            System.out.print("Digite uma nota (0-20) ou -1 para terminar: ");
            nota = scanner.nextDouble();
            
            if (nota >= 0 && nota <= 20) {
                soma += nota;
                count++;
            } else if (nota != -1) {
                System.out.println("Nota inválida");
            }
        } while (nota != -1);
        
        if (count > 0) {
            double media = soma / count;
            System.out.println("A média das notas válidas é: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida");
        }
        
        scanner.close();
    }
}