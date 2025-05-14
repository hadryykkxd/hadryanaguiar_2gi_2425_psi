package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    static {
        try {
            // Força o carregamento do driver durante a inicialização
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("ERRO: Driver MySQL não carregado!");
            e.printStackTrace();
            System.exit(1);
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/MainView.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("Sistema de Torneio de Jogos");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}