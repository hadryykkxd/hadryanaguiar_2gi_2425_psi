import java.util.ArrayList;

public class ConjuntoLivros {
    private static ArrayList<Livro> listaLivros = new ArrayList<>();

    public static ArrayList<Livro> getListaLivros() {
        return listaLivros;
    }

    public static void adicionar(Livro livro) {
        listaLivros.add(livro);
    }

    public static String listar() {
        StringBuilder lista = new StringBuilder();
        for (Livro livro : listaLivros) {
            lista.append(livro.getTitulo()).append(" - ").append(livro.getAutor()).append("\n");
        }
        return lista.toString();
    }

    public static int pesquisar(String genero) {
        int total = 0;
        for (Livro livro : listaLivros) {
            if (livro.getGenero().equalsIgnoreCase(genero)) {
                total++;
            }
        }
        return total;
    }

    public static void remover(String titulo) {
        listaLivros.removeIf(livro -> livro.getTitulo().equalsIgnoreCase(titulo));
    }

    public static double totalLivros() {
        return listaLivros.stream().mapToDouble(Livro::getPreco).sum();
    }

    public static int pesquisar(double valorInicial, double valorFinal) {
        return (int) listaLivros.stream()
                .filter(livro -> livro.getPreco() >= valorInicial && livro.getPreco() <= valorFinal)
                .count();
    }

    public static void atualizar(String isbn) {
        for (Livro livro : listaLivros) {
            if (livro.getIsbn().equals(isbn)) {
                // Aqui você pode implementar a lógica para atualizar os dados do livro
                // Por exemplo, solicitando novos dados ao usuário
                System.out.println("Livro encontrado. Implemente a lógica de atualização aqui.");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}