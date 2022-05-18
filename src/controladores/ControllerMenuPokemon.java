package controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ControllerMenuPokemon implements Initializable {

    @FXML
    private Button Entrenamiento;

    @FXML
    private Button Combate;

    @FXML

    private void Entrenamiento(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("../vistas/vistaEntrenamiento/vistaEntrenamiento.fxml"));
        Parent root = loader.load();

        ControllerEntrenamiento corntrolador = loader.getController();

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }

    @FXML

    private void Combate(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(
            getClass().getResource("../vistas/vistaCombate/vistaCombate.fxml"));
        Parent root = loader.load();

        ControllerCombate controlador1 = loader.getController();

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
