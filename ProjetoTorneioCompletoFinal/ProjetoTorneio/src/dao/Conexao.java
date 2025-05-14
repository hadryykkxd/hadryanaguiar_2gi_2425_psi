package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    // Bloco estático para registro do driver
    static {
        try {
            // Dupla verificação do driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        } catch (Exception e) {
            throw new RuntimeException("Falha ao carregar driver JDBC", e);
        }
    }

    // Configurações de conexão com tratamento de timezone
    private static final String URL = "jdbc:mysql://localhost:3306/torneio?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Método com melhor tratamento de erro
    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão estabelecida com sucesso!"); // Log opcional
            return conn;
        } catch (SQLException e) {
            // Mensagem mais detalhada
            throw new RuntimeException("""
                Falha na conexão com o banco. Verifique:
                1. MySQL está rodando?
                2. Banco 'torneio' existe?
                3. Usuário/senha estão corretos?
                4. Servidor aceita conexões? (firewall)
                Erro original: """ + e.getMessage(), e);
        }
    }
}