import java.time.LocalDate;

// Classe Pessoa
public class Pessoa {
    private String nome;
    private int anoNascimento;
    private double altura;
    private double peso;

    // Construtor
    public Pessoa(String nome, int anoNascimento, double altura, double peso) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    // Getters e Setters
    // ... (implementar getters e setters para todos os atributos)

    // Método para imprimir dados da pessoa
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }

    // Método para calcular idade
    public int calcularIdade() {
        return LocalDate.now().getYear() - anoNascimento;
    }

    // Método para calcular IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }
}
