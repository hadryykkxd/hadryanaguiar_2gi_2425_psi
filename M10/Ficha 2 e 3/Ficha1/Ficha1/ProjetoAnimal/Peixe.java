package M10.Ficha1.ProjetoAnimal;// Arquivo: Peixe.java

public class Peixe extends Animal {
    // Atributo adicional
    private String caracteristicas;

    // Construtor
    public Peixe(String nome, double comprimento, int numeroPatas, String cor, String ambiente, double velocidadeMedia, String caracteristicas) {
        // Chama o construtor da classe Animal
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.caracteristicas = caracteristicas;
    }

    // Métodos Get e Set para o atributo caracteristicas
    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    // Método dadosPeixe
    public void dadosPeixe() {
        // Chama o método dados da classe Animal para imprimir os dados básicos
        super.dados();
        // Imprime a característica específica do peixe
        System.out.println("Características: " + caracteristicas);
    }
}