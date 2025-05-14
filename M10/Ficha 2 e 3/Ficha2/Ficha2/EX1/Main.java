package M10.Ficha2.EX1;

public class Main {
    public static void main(String[] args) {
        // Criando objetos
        Pessoa pessoa = new Pessoa("João", 30, "Masculino");
        Empregado empregado = new Empregado("Maria", 25, "Feminino", 3000.0, "E123");
        Cliente cliente = new Cliente("Carlos", 40, "Masculino", 500.0, 1980);
        Gerente gerente = new Gerente("Ana", 35, "Feminino", 5000.0, "G456", "Vendas");
        Vendedor vendedor = new Vendedor("Pedro", 28, "Masculino", 2000.0, "V789", 15000.0, 10);

        // Testando os métodos
        System.out.println(pessoa);
        System.out.println(empregado);
        System.out.println("Valor INSS: " + empregado.valorInss());
        System.out.println(cliente);
        System.out.println(gerente);
        System.out.println(vendedor);
    }
}
