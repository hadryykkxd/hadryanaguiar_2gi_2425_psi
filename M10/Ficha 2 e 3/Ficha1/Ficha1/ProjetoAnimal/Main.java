package M10.Ficha1.ProjetoAnimal;

public class Main {
    public static void main(String[] args) {
        // Criando objetos
        ContaBancaria conta1 = new ContaBancaria("João Silva", 12345, 1000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria Souza", 54321, 2000.0, 5, 0.05);
        ContaEspecial contaEspecial = new ContaEspecial("Carlos Oliveira", 67890, 1500.0, 500.0);

        // Testando operações
        conta1.levantar(500);
        conta1.depositar(200);
        System.out.println("Saldo da conta1: " + conta1.getSaldo());

        contaPoupanca.calcularNovoSaldo();
        System.out.println("Saldo da contaPoupanca: " + contaPoupanca.getSaldo());

        contaEspecial.levantar(2000);
        System.out.println("Saldo da contaEspecial: " + contaEspecial.getSaldo());
    }
}
