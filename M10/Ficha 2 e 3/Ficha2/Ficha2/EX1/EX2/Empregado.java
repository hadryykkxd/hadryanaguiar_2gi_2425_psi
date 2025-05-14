package M10.Ficha2.EX1.EX2;

public class Empregado extends Pessoa {
    // Atributos adicionais
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    // Construtor
    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    // Métodos getters e setters
    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    // Método calcularSalario
    public double calcularSalario() {
        return salarioBase - (salarioBase * imposto);
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + ", Empregado{" +
                "codigoSetor=" + codigoSetor +
                ", salarioBase=" + salarioBase +
                ", imposto=" + imposto +
                '}';
    }
}
