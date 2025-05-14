package dao;

import model.Jogo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JogoDAO {

    private final Connection connection;

    public JogoDAO() {
        this.connection = Conexao.getConnection();
    }

    public void inserir(Jogo jogo) throws SQLException {
        String sql = "INSERT INTO jogos (equipe1_id, equipe2_id, data, placar) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, jogo.getEquipe1Id());
            stmt.setInt(2, jogo.getEquipe2Id());
            stmt.setDate(3, Date.valueOf(jogo.getData()));
            stmt.setString(4, jogo.getPlacar());
            stmt.executeUpdate();
        }
    }

    public List<Jogo> listar() throws SQLException {
        List<Jogo> lista = new ArrayList<>();
        String sql = "SELECT * FROM jogos";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Jogo jogo = new Jogo(
                        rs.getInt("id"),
                        rs.getInt("equipe1_id"),
                        rs.getInt("equipe2_id"),
                        rs.getDate("data").toLocalDate(),
                        rs.getString("placar")
                );
                lista.add(jogo);
            }
        }
        return lista;
    }
}
