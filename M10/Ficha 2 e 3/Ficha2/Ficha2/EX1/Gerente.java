package M10.Ficha2.EX1;

public class Gerente extends Empregado {
    // Atributo
    private String nomeGerencia;

    // Construtor
    public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }
    

    // Métodos get e set
    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + ", Gerente{" +
                "nomeGerencia='" + nomeGerencia + '\'' +
                '}';
    }
}
