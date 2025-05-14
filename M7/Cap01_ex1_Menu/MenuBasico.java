package M7.Cap01_ex1_Menu;
import java.util.Scanner;

public class MenuBasico {

    public static void main(String[] args) {
        // Criando o menu com título e opções
        criarMenu("Menu Principal", "Opção 1", "Opção 2", "Opção 3");
    }

    // Método para criar e exibir o menu
    public static void criarMenu(String titulo, String opcao1, String opcao2, String opcao3) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Limpar a tela (simplificado - em ambiente real poderia usar System.out.print("\033[H\033[2J"))
            System.out.println("\n\n\n\n\n\n\n\n\n\n");

            // Centralizar o título (aproximadamente)
            System.out.println("\t\t\t" + titulo);
            System.out.println("\t\t\t----------------");

            // Centralizar as opções
            System.out.println("\t\t\t1 - " + opcao1);
            System.out.println("\t\t\t2 - " + opcao2);
            System.out.println("\t\t\t3 - " + opcao3);
            System.out.println("\t\t\t0 - Sair");
            System.out.println("\t\t\t----------------");

            // Pedir a opção ao usuário
            System.out.print("\t\t\tDigite uma opção (0 para sair): ");
            opcao = scanner.nextInt();

            // Processar a opção
            switch(opcao) {
                case 1:
                    metodoOpcao1();
                    break;
                case 2:
                    metodoOpcao2();
                    break;
                case 3:
                    metodoOpcao3();
                    break;
                case 0:
                    System.out.println("\t\t\tSaindo do programa...");
                    break;
                default:
                    System.out.println("\t\t\tOpção inválida!");
            }

            // Esperar pressionar tecla (apenas para opções válidas)
            if(opcao >= 1 && opcao <= 3) {
                System.out.print("\t\t\tPressione Enter para continuar...");
                scanner.nextLine(); // Consumir a quebra de linha pendente
                scanner.nextLine(); // Esperar Enter
            }

        } while(opcao != 0);

        scanner.close();
    }

    // Métodos simples para cada opção (com 2 linhas como solicitado)
    public static void metodoOpcao1() {
        System.out.println("\t\t\tDigitou a opção 1");
        System.out.println("\t\t\tEsta é a funcionalidade da opção 1");
    }

    public static void metodoOpcao2() {
        System.out.println("\t\t\tDigitou a opção 2");
        System.out.println("\t\t\tEsta é a funcionalidade da opção 2");
    }

    public static void metodoOpcao3() {
        System.out.println("\t\t\tDigitou a opção 3");
        System.out.println("\t\t\tEsta é a funcionalidade da opção 3");
    }
}
