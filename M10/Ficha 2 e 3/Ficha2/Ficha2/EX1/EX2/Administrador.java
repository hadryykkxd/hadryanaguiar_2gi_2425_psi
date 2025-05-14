package M10.Ficha2.EX1.EX2;

public class Administrador extends Empregado {
    // Atributo adicional
    private double ajudaDeCusto;

    // Construtor
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Métodos getters e setters
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Redefinição do método calcularSalario
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + ", Administrador{" +
                "ajudaDeCusto=" + ajudaDeCusto +
                '}';
    }
}
