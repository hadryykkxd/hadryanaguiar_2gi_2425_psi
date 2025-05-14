package M10.Ficha1.ProjetoAnimal;

public class ContaPoupanca extends ContaBancaria {
    // Atributos
    private int diaRendimento;
    private double taxaRendimento;

    // Construtor
    public ContaPoupanca(String nomeCliente, int numeroConta, double saldo, int diaRendimento, double taxaRendimento) {
        super(nomeCliente, numeroConta, saldo);
        this.diaRendimento = diaRendimento;
        this.taxaRendimento = taxaRendimento;
    }

    // Método para calcular o novo saldo
    public void calcularNovoSaldo() {
        double rendimento = getSaldo() * taxaRendimento;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Novo saldo após rendimento: " + getSaldo());
    }

    // Getters e Setters
    public int getDiaRendimento() {
        return diaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }
}
