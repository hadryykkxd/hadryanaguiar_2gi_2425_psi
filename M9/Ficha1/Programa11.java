package M9.Ficha1;

import java.util.Scanner;

public class Programa11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o preço base do produto: ");
        float precoBase = input.nextFloat();
        
        System.out.print("Digite a percentagem de IVA (em decimal, ex: 0.23 para 23%): ");
        float iva = input.nextFloat();
        
        float precoVenda = precoBase + (precoBase * iva);
        System.out.println("O preço de venda é: " + precoVenda);
    }
}
