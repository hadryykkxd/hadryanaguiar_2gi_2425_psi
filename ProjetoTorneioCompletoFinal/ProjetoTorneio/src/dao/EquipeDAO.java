package dao;

import model.Equipe;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EquipeDAO {

    private final Connection connection;

    public EquipeDAO() {
        this.connection = Conexao.getConnection();
    }

    public void inserir(Equipe equipe) throws SQLException {
        String sql = "INSERT INTO equipes (nome, pais) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, equipe.getNome());
            stmt.setString(2, equipe.getPais());
            stmt.executeUpdate();
        }
    }

    public void atualizar(Equipe equipe) throws SQLException {
        String sql = "UPDATE equipes SET nome = ?, pais = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, equipe.getNome());
            stmt.setString(2, equipe.getPais());
            stmt.setInt(3, equipe.getId());
            stmt.executeUpdate();
        }
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM equipes WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public List<Equipe> listar() throws SQLException {
        List<Equipe> lista = new ArrayList<>();
        String sql = "SELECT * FROM equipes";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Equipe equipe = new Equipe(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("pais")
                );
                lista.add(equipe);
            }
        }
        return lista;
    }
}
