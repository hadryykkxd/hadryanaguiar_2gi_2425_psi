import java.util.Scanner;

public class FilmeTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Filme filme = new Filme();

        System.out.print("Digite o nome do filme: ");
        filme.definirNome(scanner.nextLine());

        System.out.print("Digite o nome do realizador: ");
        filme.definirRealizador(scanner.nextLine());

        System.out.print("Digite o ano do filme: ");
        filme.definirAno(scanner.nextInt());

        System.out.println("Nome do filme: " + filme.saberNome());
        
        filme.escreveFilme();
        
        scanner.close();
    }
}