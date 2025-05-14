package dao;

import model.Jogador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JogadorDAO {

    private final Connection connection;

    public JogadorDAO() {
        this.connection = Conexao.getConnection();
    }

    public void inserir(Jogador jogador) throws SQLException {
        String sql = "INSERT INTO jogadores (nome, idade, posicao, equipe_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, jogador.getNome());
            stmt.setInt(2, jogador.getIdade());
            stmt.setString(3, jogador.getPosicao());
            stmt.setInt(4, jogador.getEquipeId());
            stmt.executeUpdate();
        }
    }

    public void atualizar(Jogador jogador) throws SQLException {
        String sql = "UPDATE jogadores SET nome = ?, idade = ?, posicao = ?, equipe_id = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, jogador.getNome());
            stmt.setInt(2, jogador.getIdade());
            stmt.setString(3, jogador.getPosicao());
            stmt.setInt(4, jogador.getEquipeId());
            stmt.setInt(5, jogador.getId());
            stmt.executeUpdate();
        }
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM jogadores WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public List<Jogador> listar() throws SQLException {
        List<Jogador> lista = new ArrayList<>();
        String sql = "SELECT * FROM jogadores";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Jogador jogador = new Jogador(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getInt("idade"),
                        rs.getString("posicao"),
                        rs.getInt("equipe_id")
                );
                lista.add(jogador);
            }
        }
        return lista;
    }
}
