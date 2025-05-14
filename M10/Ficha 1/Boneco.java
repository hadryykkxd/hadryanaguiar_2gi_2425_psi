import java.util.Scanner;

public class Boneco {
    private String nome;
    private int posX;
    private int posY;
    private String direcao;

    public Boneco(String nome) {
        this.nome = nome;
        this.posX = 0;
        this.posY = 0;
        this.direcao = "direita";
    }

    public void mover() {
        switch (direcao) {
            case "cima":
                posY++;
                break;
            case "baixo":
                posY--;
                break;
            case "esquerda":
                posX--;
                break;
            case "direita":
                posX++;
                break;
        }
    }

    public void mudarDirecao(String novaDirecao) {
        this.direcao = novaDirecao;
    }

    public void mostrarPosicao() {
        System.out.println(nome + " está na posição (" + posX + ", " + posY + ") olhando para " + direcao);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boneco boneco = new Boneco("Zé");

        while (true) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1 - Mover");
            System.out.println("2 - Mudar direção");
            System.out.println("3 - Mostrar posição");
            System.out.println("4 - Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    boneco.mover();
                    System.out.println("Boneco movido.");
                    break;
                case 2:
                    System.out.println("Digite a nova direção (cima/baixo/esquerda/direita):");
                    String novaDirecao = scanner.next();
                    boneco.mudarDirecao(novaDirecao);
                    System.out.println("Direção mudada para " + novaDirecao);
                    break;
                case 3:
                    boneco.mostrarPosicao();
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}