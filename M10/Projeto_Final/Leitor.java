public class Leitor extends Pessoa {
    private String numeroCartao;

    public Leitor(int id, String nome, int idade, String numeroCartao) {
        super(id, nome, idade);
        this.numeroCartao = numeroCartao;
    }

    // Getters e Setters
    public String getNumeroCartao() { return numeroCartao; }
    public void setNumeroCartao(String numeroCartao) { this.numeroCartao = numeroCartao; }
}