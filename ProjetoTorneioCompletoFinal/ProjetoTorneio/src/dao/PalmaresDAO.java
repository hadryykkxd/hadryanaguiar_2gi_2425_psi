package dao;

import model.Palmares;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PalmaresDAO {

    private final Connection connection;

    public PalmaresDAO() {
        this.connection = Conexao.getConnection();
    }

    public void inserir(Palmares palmares) throws SQLException {
        String sql = "INSERT INTO palmares (equipe_id, titulo, ano) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, palmares.getEquipeId());
            stmt.setString(2, palmares.getTitulo());
            stmt.setInt(3, palmares.getAno());
            stmt.executeUpdate();
        }
    }

    public List<Palmares> listar() throws SQLException {
        List<Palmares> lista = new ArrayList<>();
        String sql = "SELECT * FROM palmares";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Palmares palmares = new Palmares(
                        rs.getInt("id"),
                        rs.getInt("equipe_id"),
                        rs.getString("titulo"),
                        rs.getInt("ano")
                );
                lista.add(palmares);
            }
        }
        return lista;
    }
}
