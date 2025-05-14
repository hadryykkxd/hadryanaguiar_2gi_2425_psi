import java.util.Scanner;

public class LivroTeste {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Digite o ISBN do livro: ");
       String isbn = scanner.nextLine();

       System.out.print("Digite o título do livro: ");
       String titulo = scanner.nextLine();

       System.out.print("Digite o autor do livro: ");
       String autor = scanner.nextLine();

       System.out.print("Digite a editora do livro: ");
       String editora = scanner.nextLine();

       System.out.print("Digite o número de páginas do livro: ");
       int numPaginas = scanner.nextInt();

       System.out.print("Digite o preço do livro: ");
       double preco = scanner.nextDouble();

       Livro livro = new Livro(isbn, titulo, autor, editora, numPaginas, preco);

       livro.imprimeLivro();
       
       scanner.close();
   }
}