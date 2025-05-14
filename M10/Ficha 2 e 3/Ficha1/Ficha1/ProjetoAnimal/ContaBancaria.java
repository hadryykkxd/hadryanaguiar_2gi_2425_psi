package M10.Ficha1.ProjetoAnimal;

public class ContaBancaria {
    // Atributos
    private String nomeCliente;
    private int numeroConta;
    private double saldo;

    // Construtor
    public ContaBancaria(String nomeCliente, int numeroConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // Métodos
    public void levantar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Levantamento de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para o levantamento.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Getters e Setters
    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}