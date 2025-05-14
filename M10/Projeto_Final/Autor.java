public class Autor extends Pessoa {
    private String nacionalidade;

    public Autor(int id, String nome, int idade, String nacionalidade) {
        super(id, nome, idade);
        this.nacionalidade = nacionalidade;
    }

    // Getters e Setters
    public String getNacionalidade() { return nacionalidade; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }
}