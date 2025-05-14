package M10.Ficha1.ProjetoAnimal;
// Arquivo: Animal.java
public class Animal {
    // Atributos
    private String nome;
    private double comprimento;
    private int numeroPatas;
    private String cor;
    private String ambiente;
    private double velocidadeMedia;

    // Construtor
    public Animal(String nome, double comprimento, int numeroPatas, String cor, String ambiente, double velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroPatas = numeroPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    // Métodos Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    // Método dados
    public void dados() {
        System.out.println("Dados do Animal:");
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento + " metros");
        System.out.println("Número de Patas: " + numeroPatas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade Média: " + velocidadeMedia + " km/h");
    }
}