import java.util.Scanner;

public class AppLivraria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Adicionar 5 livros
        ConjuntoLivros.adicionar(new Livro("Livro 1", "Autor 1", "ISBN1", "Ficção", 20.0));
        ConjuntoLivros.adicionar(new Livro("Livro 2", "Autor 2", "ISBN2", "Romance", 25.0));
        ConjuntoLivros.adicionar(new Livro("Livro 3", "Autor 3", "ISBN3", "Ficção", 30.0));
        ConjuntoLivros.adicionar(new Livro("Livro 4", "Autor 4", "ISBN4", "Não-ficção", 22.0));
        ConjuntoLivros.adicionar(new Livro("Livro 5", "Autor 5", "ISBN5", "Romance", 28.0));

        int opcao;
        do {
            System.out.println("\n=========MENU=========");
            System.out.println("1 - Registar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Eliminar livro");
            System.out.println("4 - Pesquisar género");
            System.out.println("5 - Pesquisar por gama de preço");
            System.out.println("6 - Calcular preço total");
            System.out.println("7 - Sair do programa");
            System.out.print("=========> Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    registarLivro(scanner);
                    break;
                case 2:
                    System.out.println(ConjuntoLivros.listar());
                    break;
                case 3:
                    eliminarLivro(scanner);
                    break;
                case 4:
                    pesquisarGenero(scanner);
                    break;
                case 5:
                    pesquisarPorGamaDePreco(scanner);
                    break;
                case 6:
                    System.out.printf("Preço total dos livros: %.2f\n", ConjuntoLivros.totalLivros());
                    break;
                case 7:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 7);

        scanner.close();
    }

    private static void registarLivro(Scanner scanner) {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Gênero: ");
        String genero = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        Livro novoLivro = new Livro(titulo, autor, isbn, genero, preco);
        ConjuntoLivros.adicionar(novoLivro);
        System.out.println("Livro registado com sucesso!");
    }

    private static void eliminarLivro(Scanner scanner) {
        System.out.print("Digite o título do livro a ser eliminado: ");
        String titulo = scanner.nextLine();
        ConjuntoLivros.remover(titulo);
        System.out.println("Livro removido (se existente).");
    }

    private static void pesquisarGenero(Scanner scanner) {
        System.out.print("Digite o gênero a ser pesquisado: ");
        String genero = scanner.nextLine();
        int total = ConjuntoLivros.pesquisar(genero);
        System.out.println("Total de livros do gênero " + genero + ": " + total);
    }

    private static void pesquisarPorGamaDePreco(Scanner scanner) {
        System.out.print("Digite o preço mínimo: ");
        double min = scanner.nextDouble();
        System.out.print("Digite o preço máximo: ");
        double max = scanner.nextDouble();
        int total = ConjuntoLivros.pesquisar(min, max);
        System.out.println("Total de livros entre " + min + " e " + max + ": " + total);
    }
}