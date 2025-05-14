public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 1990, 1.75, 70);
        Pessoa pessoa2 = new Pessoa("Maria", 1985, 1.65, 60);
        Pessoa pessoa3 = new Pessoa("Pedro", 2000, 1.80, 80);

        pessoa1.imprimirDados();
        System.out.println("Idade: " + pessoa1.calcularIdade());
        System.out.println("IMC: " + pessoa1.calcularIMC());

        pessoa2.imprimirDados();
        System.out.println("Idade: " + pessoa2.calcularIdade());
        System.out.println("IMC: " + pessoa2.calcularIMC());

        pessoa3.imprimirDados();
        System.out.println("Idade: " + pessoa3.calcularIdade());
        System.out.println("IMC: " + pessoa3.calcularIMC());
    }
}