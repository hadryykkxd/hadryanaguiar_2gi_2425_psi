public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("João", "A", 1, 9.5);
        Estudante estudante2 = new Estudante("Maria", "B", 2, 8.0);
        Estudante estudante3 = new Estudante("Pedro", "C", 3, 10.0);

        estudante1.imprimirDados();
        System.out.println("Situação: " + estudante1.verificarAprovacao());

        estudante2.imprimirDados();
        System.out.println("Situação: " + estudante2.verificarAprovacao());

        estudante3.imprimirDados();
        System.out.println("Situação: " + estudante3.verificarAprovacao());
    }
}