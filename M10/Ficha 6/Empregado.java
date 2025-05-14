public class Empregado {
    private String nome;
    private int codigo;
    private int diasTrabalhados;
    private double valorPorDia;

    public Empregado(String nome, int codigo, int diasTrabalhados, double valorPorDia) {
        this.nome = nome;
        this.codigo = codigo;
        this.diasTrabalhados = diasTrabalhados;
        this.valorPorDia = valorPorDia;
    }

    public double calcularSalario() {
        return diasTrabalhados * valorPorDia;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public double getValorPorDia() {
        return valorPorDia;
    }
}