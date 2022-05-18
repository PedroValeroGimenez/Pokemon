package controladores;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ControllerMenuPokemon implements Initializable {

    MediaPlayer mediaPlayer;

	public void musicPlay() {
		String s = "C:/Users/jaime/Desktop/DAM/Proyecto Pokemon/Pokemon-1/lib/pokemon.mp3";
		Media h = new Media(Paths.get(s).toUri().toString());
		mediaPlayer = new MediaPlayer(h);
		mediaPlayer.play();
    }

    public void musicStop() {
		mediaPlayer.stop();
    }

    @FXML
    private Button Entrenamiento;

    @FXML
    private Button Combate;

    @FXML
    private Button Play;

    @FXML
    private Button Stop;


    @FXML

    private void play(ActionEvent event) throws IOException {

        musicPlay();

    }

    @FXML

    private void stop(ActionEvent event) throws IOException {

        musicStop();

    }


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


    @FXML

    private void Capturar(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(
            getClass().getResource("../vistas/vistaCaptura/vistaCaptura.fxml"));
        Parent root = loader.load();

        ControllerCaptura controlador1 = loader.getController();

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
