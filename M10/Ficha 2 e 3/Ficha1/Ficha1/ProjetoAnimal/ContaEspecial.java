package M10.Ficha1.ProjetoAnimal;

public class ContaEspecial extends ContaBancaria {
    // Atributo
    private double limite;

    // Construtor
    public ContaEspecial(String nomeCliente, int numeroConta, double saldo, double limite) {
        super(nomeCliente, numeroConta, saldo);
        this.limite = limite;
    }

    // Redefinição do método levantar
    @Override
    public void levantar(double valor) {
        if (valor > 0 && valor <= (getSaldo() + limite)) {
            setSaldo(getSaldo() - valor);
            System.out.println("Levantamento de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Limite de crédito excedido.");
        }
    }

    // Getter e Setter
    public double getLimite() {
        return limite;
    }
}
