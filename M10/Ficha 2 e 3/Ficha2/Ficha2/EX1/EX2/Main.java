package M10.Ficha2.EX1.EX2;

public class Main {
    public static void main(String[] args) {
        // Testando a classe Fornecedor
        Fornecedor fornecedor = new Fornecedor("Fornecedor A", "Rua X", "123456789", 10000.0, 4000.0);
        System.out.println(fornecedor);
        System.out.println("Saldo do Fornecedor: " + fornecedor.obterSaldo());

        // Testando a classe Empregado
        Empregado empregado = new Empregado("João", "Rua Y", "987654321", 1, 3000.0, 0.1);
        System.out.println(empregado);
        System.out.println("Salário do Empregado: " + empregado.calcularSalario());

        // Testando a classe Administrador
        Administrador administrador = new Administrador("Maria", "Rua Z", "555555555", 2, 5000.0, 0.15, 1000.0);
        System.out.println(administrador);
        System.out.println("Salário do Administrador: " + administrador.calcularSalario());

        // Testando a classe Vendedor
        Vendedor vendedor = new Vendedor("Carlos", "Rua W", "111111111", 3, 2000.0, 0.05, 15000.0, 0.1);
        System.out.println(vendedor);
        System.out.println("Salário do Vendedor: " + vendedor.calcularSalario());
    }
}
