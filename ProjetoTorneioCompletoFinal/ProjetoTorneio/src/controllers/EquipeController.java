package controllers;

import dao.EquipeDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.Equipe;

import java.sql.SQLException;
import java.util.List;

public class EquipeController {

    @FXML private TextField nomeField;
    @FXML private TextField paisField;

    @FXML private TableView<Equipe> tabelaEquipes;
    @FXML private TableColumn<Equipe, Integer> colId;
    @FXML private TableColumn<Equipe, String> colNome;
    @FXML private TableColumn<Equipe, String> colPais;

    private final EquipeDAO equipeDAO = new EquipeDAO();
    private final ObservableList<Equipe> listaEquipes = FXCollections.observableArrayList();

    private Equipe equipeSelecionada = null;

    @FXML
    public void initialize() {
        colId.setCellValueFactory(c -> new javafx.beans.property.SimpleIntegerProperty(c.getValue().getId()).asObject());
        colNome.setCellValueFactory(c -> new javafx.beans.property.SimpleStringProperty(c.getValue().getNome()));
        colPais.setCellValueFactory(c -> new javafx.beans.property.SimpleStringProperty(c.getValue().getPais()));

        carregarEquipes();

        tabelaEquipes.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                equipeSelecionada = newVal;
                nomeField.setText(newVal.getNome());
                paisField.setText(newVal.getPais());
            }
        });
    }

    private void carregarEquipes() {
        listaEquipes.clear();
        try {
            List<Equipe> equipes = equipeDAO.listar();
            listaEquipes.addAll(equipes);
            tabelaEquipes.setItems(listaEquipes);
        } catch (SQLException e) {
            mostrarErro("Erro ao carregar equipes: " + e.getMessage());
        }
    }

    @FXML
    public void salvarEquipe() {
        String nome = nomeField.getText();
        String pais = paisField.getText();

        if (nome.isEmpty() || pais.isEmpty()) {
            mostrarErro("Preencha todos os campos.");
            return;
        }

        try {
            if (equipeSelecionada == null) {
                Equipe nova = new Equipe(nome, pais);
                equipeDAO.inserir(nova);
            } else {
                equipeSelecionada.setNome(nome);
                equipeSelecionada.setPais(pais);
                equipeDAO.atualizar(equipeSelecionada);
                equipeSelecionada = null;
            }
            nomeField.clear();
            paisField.clear();
            carregarEquipes();
        } catch (SQLException e) {
            mostrarErro("Erro ao salvar equipe: " + e.getMessage());
        }
    }

    @FXML
    public void editarEquipe() {
        equipeSelecionada = tabelaEquipes.getSelectionModel().getSelectedItem();
        if (equipeSelecionada == null) {
            mostrarErro("Selecione uma equipe para editar.");
        }
    }

    @FXML
    public void excluirEquipe() {
        Equipe selecionada = tabelaEquipes.getSelectionModel().getSelectedItem();
        if (selecionada == null) {
            mostrarErro("Selecione uma equipe para excluir.");
            return;
        }

        try {
            equipeDAO.excluir(selecionada.getId());
            carregarEquipes();
        } catch (SQLException e) {
            mostrarErro("Erro ao excluir equipe: " + e.getMessage());
        }
    }

    private void mostrarErro(String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR, msg, ButtonType.OK);
        alert.showAndWait();
    }
}
