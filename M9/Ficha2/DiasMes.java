package M9.Ficha2;

import java.util.Scanner;

public class DiasMes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número do mês (1-12): ");
        int mes = input.nextInt();
        
        int dias;
        switch(mes) {
            case 2: dias = 29; break; // 2024 é bissexto
            case 4: case 6: case 9: case 11: dias = 30; break;
            default: dias = 31;
        }
        
        System.out.println("O mês " + mes + " tem " + dias + " dias em 2024");
    }
}