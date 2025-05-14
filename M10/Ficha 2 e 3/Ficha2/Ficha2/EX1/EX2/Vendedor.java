package M10.Ficha2.EX1.EX2;

public class Vendedor extends Empregado {
    // Atributos adicionais
    private double valorVendas;
    private double comissao;

    // Construtor
    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    // Métodos getters e setters
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // Redefinição do método calcularSalario
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorVendas * comissao);
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + ", Vendedor{" +
                "valorVendas=" + valorVendas +
                ", comissao=" + comissao +
                '}';
    }
}