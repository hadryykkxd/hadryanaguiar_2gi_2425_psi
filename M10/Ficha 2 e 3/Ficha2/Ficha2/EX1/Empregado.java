package M10.Ficha2.EX1;

public class Empregado extends Pessoa {
    // Atributos
    private double salario;
    private String matricula;

    // Construtor
    public Empregado(String nome, int idade, String sexo, double salario, String matricula) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    // Métodos get e set
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método valorInss
    public double valorInss() {
        return salario * 0.11;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + ", Empregado{" +
                "salario=" + salario +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}