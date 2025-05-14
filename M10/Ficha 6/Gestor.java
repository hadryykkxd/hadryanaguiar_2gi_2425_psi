public class Gestor extends Empregado {
    private double premioPercentagem;

    public Gestor(String nome, int codigo, int diasTrabalhados, double valorPorDia, double premioPercentagem) {
        super(nome, codigo, diasTrabalhados, valorPorDia);
        this.premioPercentagem = premioPercentagem;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        return salarioBase + (salarioBase * premioPercentagem / 100);
    }
}