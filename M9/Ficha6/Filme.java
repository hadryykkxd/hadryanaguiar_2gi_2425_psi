public class Filme {
    private String nome;
    private String realizador;
    private int ano;

    // Construtor sem argumentos
    public Filme() {
        this.nome = "";
        this.realizador = "";
        this.ano = 0;
    }

    // Construtor com argumentos
    public Filme(String nome, String realizador, int ano) {
        this.nome = nome;
        this.realizador = realizador;
        this.ano = ano;
    }

    // Métodos setters
    public void definirNome(String nome) {
        this.nome = nome;
    }

    public void definirRealizador(String realizador) {
        this.realizador = realizador;
    }

    public void definirAno(int ano) {
        this.ano = ano;
    }

    // Métodos getters
    public String saberNome() {
        return this.nome;
    }

    public String saberRealizador() {
        return this.realizador;
    }

    public int saberAno() {
        return this.ano;
    }

    // Método para escrever os dados do filme
    public void escreveFilme() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Realizador: " + this.realizador);
        System.out.println("Ano: " + this.ano);
    }
}