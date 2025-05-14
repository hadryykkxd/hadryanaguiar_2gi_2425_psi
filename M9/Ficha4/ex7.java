public class ex7 {
    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * (9.0/5.0) + 32.0;
    }

    public static void main(String[] args) {
        System.out.println("30°C em Fahrenheit é: " + celsiusParaFahrenheit(30));
    }
}