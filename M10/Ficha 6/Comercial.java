public class Comercial extends Empregado {
    private double vendasRealizadas;
    private double percentagemVendas;

    public Comercial(String nome, int codigo, int diasTrabalhados, double valorPorDia, double vendasRealizadas, double percentagemVendas) {
        super(nome, codigo, diasTrabalhados, valorPorDia);
        this.vendasRealizadas = vendasRealizadas;
        this.percentagemVendas = percentagemVendas;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (vendasRealizadas * percentagemVendas / 100);
    }
}