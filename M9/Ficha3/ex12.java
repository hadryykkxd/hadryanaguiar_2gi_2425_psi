import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalNotas = 0;
        int notasPositivas = 0;
        double nota;
        
        do {
            System.out.print("Digite uma nota (0-20) ou -1 para terminar: ");
            nota = scanner.nextDouble();
            
            if (nota >= 0 && nota <= 20) {
                totalNotas++;
                if (nota >= 10) {
                    notasPositivas++;
                }
            }
        } while (nota != -1);
        
        System.out.println("Você inseriu " + totalNotas + " notas, das quais " + notasPositivas + " são positivas");
        
        scanner.close();
    }
}