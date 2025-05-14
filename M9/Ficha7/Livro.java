public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private String genero;
    private double preco;

    public Livro() {
    }

    public Livro(String titulo, String autor, String isbn, String genero, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.genero = genero;
        this.preco = preco;
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public String getGenero() { return genero; }
    public double getPreco() { return preco; }

    // Setters
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setPreco(double preco) { this.preco = preco; }

    public void imprimirLivro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Gênero: " + genero);
        System.out.println("Preço: " + preco);
    }
}