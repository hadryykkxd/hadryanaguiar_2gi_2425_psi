
// Classe LampadaTeste
public class LampadaTeste {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada("LED", 220, "Branca", "Philips", 15.99, 9);
        Lampada lampada2 = new Lampada("Fluorescente", 110, "Amarela", "Osram", 12.50, 15);

        System.out.println(lampada1);
        System.out.println(lampada2);

        if (lampada1.getPotencia() > lampada2.getPotencia()) {
            System.out.println("Lâmpada 1 tem maior potência");
        } else if (lampada2.getPotencia() > lampada1.getPotencia()) {
            System.out.println("Lâmpada 2 tem maior potência");
        } else {
            System.out.println("As lâmpadas têm a mesma potência");
        }

        if (lampada1.getPreco() > lampada2.getPreco()) {
            System.out.println("Lâmpada 1 é mais cara");
        } else if (lampada2.getPreco() > lampada1.getPreco()) {
            System.out.println("Lâmpada 2 é mais cara");
        } else {
            System.out.println("As lâmpadas têm o mesmo preço");
        }
    }
}