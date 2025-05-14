public class ex11 {
    public static double calculaOperacao(double a, double b, char operacao) {
        switch (operacao) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("5 + 3 = " + calculaOperacao(5, 3, '+'));
    }
}