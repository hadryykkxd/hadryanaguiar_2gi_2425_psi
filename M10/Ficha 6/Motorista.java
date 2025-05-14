public class Motorista extends Empregado {
    private double kmPercorridos;
    private double valorPorKm;

    public Motorista(String nome, int codigo, int diasTrabalhados, double valorPorDia, double kmPercorridos, double valorPorKm) {
        super(nome, codigo, diasTrabalhados, valorPorDia);
        this.kmPercorridos = kmPercorridos;
        this.valorPorKm = valorPorKm;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (kmPercorridos * valorPorKm);
    }
}