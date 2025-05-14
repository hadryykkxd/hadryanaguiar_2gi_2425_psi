package M10.Ficha2.EX1.EX2;

public class Fornecedor extends Pessoa {
    // Atributos adicionais
    private double valorCredito;
    private double valorDivida;

    // Construtor
    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    // Métodos getters e setters
    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    // Método obterSaldo
    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + ", Fornecedor{" +
                "valorCredito=" + valorCredito +
                ", valorDivida=" + valorDivida +
                '}';
    }
}
