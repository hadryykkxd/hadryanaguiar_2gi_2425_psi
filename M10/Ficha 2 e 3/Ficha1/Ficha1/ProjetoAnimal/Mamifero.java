package M10.Ficha1.ProjetoAnimal;

public class Mamifero extends Animal {
    // Atributo adicional
    private String alimento;

    // Construtor
    public Mamifero(String nome, double comprimento, int numeroPatas, String cor, String ambiente, double velocidadeMedia, String alimento) {
        // Chama o construtor da classe Animal
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    // Métodos Get e Set para o atributo alimento
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    // Método dadosMamifero
    public void dadosMamifero() {
        // Chama o método dados da classe Animal para imprimir os dados básicos
        super.dados();
        // Imprime o alimento específico do mamífero
        System.out.println("Alimento: " + alimento);
    }
}
