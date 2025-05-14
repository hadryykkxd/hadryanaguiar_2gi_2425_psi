public class ApoliceTeste {
    public static void main(String[] args) {
        Apolice apolice = new Apolice("João Silva", 30, 1000);

        System.out.println("Dados iniciais:");
        apolice.imprimir();

        apolice.calcularPremioApolice();
        System.out.println("\nApós cálculo do prémio:");
        apolice.imprimir();

        apolice.oferecerDesconto("Lisboa");
        System.out.println("\nApós desconto para Lisboa:");
        apolice.imprimir();
    }
}