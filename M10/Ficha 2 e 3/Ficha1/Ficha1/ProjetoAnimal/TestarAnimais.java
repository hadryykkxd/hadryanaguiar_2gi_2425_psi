package M10.Ficha1.ProjetoAnimal;

public class TestarAnimais {
    public static void main(String[] args) {
        // Criando um objeto camelo do tipo Mamifero
        Mamifero camelo = new Mamifero("Camelo", 150, 4, "Amarelo", "Terra", 2.0, "Plantas");

        // Criando um objeto tubarao do tipo Peixe
        Peixe tubarao = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", 1.5, "Barbatanas e cauda");

        // Criando um objeto ursocanada do tipo Mamifero
        Mamifero ursocanada = new Mamifero("Urso do Canadá", 180, 4, "Vermelho", "Terra", 0.5, "Mel");

        // Imprimindo os dados dos animais
        System.out.println("Dados do Camelo:");
        camelo.dadosMamifero();

        System.out.println("\nDados do Tubarão:");
        tubarao.dadosPeixe();

        System.out.println("\nDados do Urso do Canadá:");
        ursocanada.dadosMamifero();
    }
}