public class Circulo {
    private double raio;

    // Construtor sem argumentos
    public Circulo() {
        this.raio = 0;
    }

    // Construtor com argumento
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para definir o raio
    public void definirRaio(double raio) {
        this.raio = raio;
    }

    // Método para saber o raio
    public double saberRaio() {
        return this.raio;
    }

    // Método para calcular o perímetro
    public double calculaPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    // Método para calcular a área
    public double calculaArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }
}