public class Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private String editora;
    private int numPaginas;
    private double preco;

    // Construtor com todos os atributos
    public Livro(String isbn, String titulo, String autor, String editora, int numPaginas, double preco) {
        if (numPaginas > 0) this.numPaginas = numPaginas; else throw new IllegalArgumentException("Número de páginas deve ser maior que zero.");
        
        if (preco > 0) this.preco = preco; else throw new IllegalArgumentException("Preço deve ser maior que zero.");
        
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        
     }

     // Métodos setters
     public void setIsbn(String isbn) { this.isbn = isbn; }
     public void setTitulo(String titulo) { this.titulo = titulo; }
     public void setAutor(String autor) { this.autor = autor; }
     public void setEditora(String editora) { this.editora = editora; }
     public void setNumPaginas(int numPaginas) { 
         if (numPaginas > 0) 
             this.numPaginas = numPaginas; 
         else 
             throw new IllegalArgumentException("Número de páginas deve ser maior que zero.");
     }
     public void setPreco(double preco) { 
         if (preco > 0) 
             this.preco = preco; 
         else 
             throw new IllegalArgumentException("Preço deve ser maior que zero.");
     }

     // Métodos getters
     public String getIsbn() { return isbn; }
     public String getTitulo() { return titulo; }
     public String getAutor() { return autor; }
     public String getEditora() { return editora; }
     public int getNumPaginas() { return numPaginas; }
     public double getPreco() { return preco; }

     // Método para imprimir os dados do livro
     public void imprimeLivro() {
         System.out.println("ISBN: " + isbn);
         System.out.println("Título: " + titulo);
         System.out.println("Autor: " + autor);
         System.out.println("Editora: " + editora);
         System.out.println("Número de Páginas: " + numPaginas);
         System.out.println("Preço: " + preco);
     }
}