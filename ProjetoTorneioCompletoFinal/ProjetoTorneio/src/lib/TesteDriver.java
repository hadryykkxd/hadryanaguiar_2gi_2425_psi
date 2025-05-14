package lib;

import com.mysql.cj.jdbc.Driver;  // Adicione esta importação manualmente

public class TesteDriver {
    public static void main(String[] args) {
        try {
            // Método 100% garantido para testar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver encontrado e carregado com sucesso!");

            // Teste adicional (opcional)
            Driver driver = new Driver();
            System.out.println("Driver instanciado com sucesso: " + driver);
        } catch (Exception e) {
            System.err.println("Falha crítica:");
            e.printStackTrace();
        }
    }
}