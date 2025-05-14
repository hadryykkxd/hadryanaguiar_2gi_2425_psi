import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double temp;
        double maxTemp = Double.MIN_VALUE;
        double minTemp = Double.MAX_VALUE;
        
        do {
            System.out.print("Digite uma temperatura (1000 para terminar): ");
            temp = scanner.nextDouble();
            
            if (temp != 1000) {
                maxTemp = Math.max(maxTemp, temp);
                minTemp = Math.min(minTemp, temp);
            }
        } while (temp != 1000);
        
        double amplitude = maxTemp - minTemp;
        System.out.println("A amplitude térmica é: " + amplitude);
        
        scanner.close();
    }
}