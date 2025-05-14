import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Settings.popularDados();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            interfaceMenuPrincipal();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    interfaceMenuAutor();
                    break;
                case 2:
                    interfaceMenuLeitor();
                    break;
                case 3:
                    interfaceMenuLivro();
                    break;
                case 4:
                    interfaceMenuEmprestimo();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    public static void interfaceMenuPrincipal() {
        System.out.println("Menu Principal");
        System.out.println("1 - Autores");
        System.out.println("2 - Leitores");
        System.out.println("3 - Livros");
        System.out.println("4 - Empréstimos");
        System.out.println("0 - Sair");
        System.out.print("Digite a opção: ");
    }

    public static void interfaceMenuAutor() {
        System.out.println("Menu Autores");
        // Implementar funcionalidades para Autores
    }

    public static void interfaceMenuLeitor() {
        System.out.println("Menu Leitores");
        // Implementar funcionalidades para Leitores
    }

    public static void interfaceMenuLivro() {
        System.out.println("Menu Livros");
        // Implementar funcionalidades para Livros
    }

    public static void interfaceMenuEmprestimo() {
        System.out.println("Menu Empréstimos");
        // Implementar funcionalidades para Empréstimos
    }
}