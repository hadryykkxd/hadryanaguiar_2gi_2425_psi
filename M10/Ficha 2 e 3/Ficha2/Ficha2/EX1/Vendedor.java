package M10.Ficha2.EX1;

public class Vendedor extends Empregado {
    // Atributos
    private double valorVendas;
    private int qntVendas;

    // Construtor
    public Vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorVendas, int qntVendas) {
        super(nome, idade, sexo, salario, matricula);
        this.valorVendas = valorVendas;
        this.qntVendas = qntVendas;
    }

    // Métodos get e set
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + ", Vendedor{" +
                "valorVendas=" + valorVendas +
                ", qntVendas=" + qntVendas +
                '}';
    }
}