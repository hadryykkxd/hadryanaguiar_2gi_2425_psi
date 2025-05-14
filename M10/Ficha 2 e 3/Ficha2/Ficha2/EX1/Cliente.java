package M10.Ficha2.EX1;

public class Cliente extends Pessoa {
    // Atributos
    private double valorDivida;
    private int anoNascim;

    // Construtor
    public Cliente(String nome, int idade, String sexo, double valorDivida, int anoNascim) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascim = anoNascim;
    }

    // Métodos get e set
    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascim() {
        return anoNascim;
    }

    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + ", Cliente{" +
                "valorDivida=" + valorDivida +
                ", anoNascim=" + anoNascim +
                '}';
    }
}
