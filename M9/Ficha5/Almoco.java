// Classe Almoco
public class Almoco {
    private String entradas;
    private String prato;
    private String sobremesa;
    private double preco;

    // Construtor
    public Almoco(String entradas, String prato, String sobremesa, double preco) {
        this.entradas = entradas;
        this.prato = prato;
        this.sobremesa = sobremesa;
        this.preco = preco;
    }

    // Getters e Setters
    public String getEntradas() {
        return entradas;
    }

    public void setEntradas(String entradas) {
        this.entradas = entradas;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método toString
    @Override
    public String toString() {
        return "Almoco{" +
                "entradas='" + entradas + '\'' +
                ", prato='" + prato + '\'' +
                ", sobremesa='" + sobremesa + '\'' +
                ", preco=" + preco +
                '}';
    }
}