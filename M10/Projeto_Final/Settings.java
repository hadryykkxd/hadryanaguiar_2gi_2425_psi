import java.util.ArrayList;
import java.util.List;

public class Settings {
    public static List<Pessoa> pessoas = new ArrayList<>();
    public static List<Autor> autores = new ArrayList<>();
    public static List<Leitor> leitores = new ArrayList<>();
    public static List<Livro> livros = new ArrayList<>();
    public static List<Emprestimo> emprestimos = new ArrayList<>();

    public static void popularDados() {
        // Popular autores
        for (int i = 1; i <= 10; i++) {
            autores.add(new Autor(i, "Autor " + i, 30 + i, "Nacionalidade " + i));
        }

        // Popular leitores
        for (int i = 1; i <= 10; i++) {
            leitores.add(new Leitor(i, "Leitor " + i, 20 + i, "Cartao " + i));
        }

        // Popular livros
        for (int i = 1; i <= 10; i++) {
            livros.add(new Livro(i, "Livro " + i, 2000 + i, autores.get(i - 1)));
        }

        // Popular empréstimos
        for (int i = 1; i <= 10; i++) {
            emprestimos.add(new Emprestimo(i, livros.get(i - 1), leitores.get(i - 1), new Date(), new Date()));
        }
    }
}