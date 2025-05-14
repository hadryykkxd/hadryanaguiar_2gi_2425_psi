// Classe Lampada
public class Lampada {
    private String tipo;
    private int voltagem;
    private String cor;
    private String marca;
    private double preco;
    private int potencia;
    private boolean status;

    // Construtor
    public Lampada(String tipo, int voltagem, String cor, String marca, double preco, int potencia) {
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.potencia = potencia;
        this.status = false;
    }

    // Getters e Setters
    // ... (implementar getters e setters para todos os atributos)

    // Método toString
    @Override
    public String toString() {
        return "Lampada{" +
                "tipo='" + tipo + '\'' +
                ", voltagem=" + voltagem +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", preco=" + preco +
                ", potencia=" + potencia +
                ", status=" + status +
                '}';
    }

    // Métodos acender e apagar
    public void acender() {
        this.status = true;
    }

    public void apagar() {
        this.status = false;
    }
}