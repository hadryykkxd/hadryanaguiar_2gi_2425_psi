package M9.Ficha2;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();
        
        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = input.next().charAt(0);
        
        double resultado = 0;
        switch(operacao) {
            case '+': resultado = num1 + num2; break;
            case '-': resultado = num1 - num2; break;
            case '*': resultado = num1 * num2; break;
            case '/': resultado = num1 / num2; break;
            default: System.out.println("Operação inválida");
        }
        
        System.out.println("Resultado: " + resultado);
    }
}