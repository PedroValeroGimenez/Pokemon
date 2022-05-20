package controladores;

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
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import pokemon.Estado;
import pokemon.Pokemon;
import pokemon.TipoEnum;
import pokemon.Entrenador;

public class ControllerEntrenamiento implements Initializable {

    MediaPlayer mediaPlayer;

    public void play() {
        String s = "img/entrenamiento.mp3";
        Media h = new Media(Paths.get(s).toUri().toString());
        mediaPlayer = new MediaPlayer(h);
        mediaPlayer.play();
    }

    public void stop() {
        mediaPlayer.stop();
    }

    @FXML
    private Button Play;

    @FXML
    private Button Stop;

    @FXML
    private Button EntrenamientoFurioso;
    @FXML
    private Button EntrenamientoFuncional;
    @FXML
    private Button EntrenamientoOnirico;

    @FXML
    private Button EntrenamientoPesado;

    private Pokemon miPokemon;
    private Entrenador entrenador;

    @FXML
    private TextField txStats;

    @FXML

    private void entrenamientoFurioso(ActionEvent event) throws IOException {

        entrenador.entrenamientoFurioso(miPokemon);

        txStats.setText("Las Stats de " + miPokemon.getNombre() + " son :" + " Ataque : " + miPokemon.getAtaque()
                + " Velocidad : " + miPokemon.getVelocidad() + " Ataque especial : " + miPokemon.getAtaqueEspecial());

        System.out.println(" El ataque de " + miPokemon.getNombre() + " es de : " + miPokemon.getAtaque());
        System.out.println("\n");
        System.out.println(" La velocidad de " + miPokemon.getNombre() + " es de : " + miPokemon.getVelocidad());
        System.out.println("\n");
        System.out.println(
                " El ataque especial de " + miPokemon.getNombre() + " es de : " + miPokemon.getAtaqueEspecial());
        System.out.println("\n");

    }

    @FXML

    private void entrenamientoFuncional(ActionEvent event) throws IOException {

        entrenador.entrenamientoFuncional(miPokemon);

        txStats.setText("Las Stats de " + miPokemon.getNombre() + " son :" + " Ataque :" + miPokemon.getAtaque()
                + " Velocidad : " + miPokemon.getVelocidad() + " Defensa : " + miPokemon.getDefensa() + "Vitalidad: "
                + miPokemon.getVitalidad());

        System.out.println(" El ataque de " + miPokemon.getNombre() + " es de : " + miPokemon.getAtaque());
        System.out.println("\n");
        System.out.println(" La velocidad de " + miPokemon.getNombre() + " es de : " + miPokemon.getVelocidad());
        System.out.println("\n");
        System.out.println(" La defensa " + miPokemon.getNombre() + " es de : " + miPokemon.getDefensa());
        System.out.println("\n");
        System.out.println(" La vitalidad " + miPokemon.getNombre() + " es de : " + miPokemon.getVitalidad());
        System.out.println("\n");

    }

    @FXML

    private void entrenamientoOnirico(ActionEvent event) throws IOException {

        entrenador.entrenamientoOnirico(miPokemon);

        txStats.setText("Las Stats de " + miPokemon.getNombre() + " son :" + " Ataque especial :"
                + miPokemon.getAtaqueEspecial() + " Velocidad : " + miPokemon.getVelocidad() + " Defensa especial : "
                + miPokemon.getDefEspecial() + "Vitalidad: " + miPokemon.getVitalidad());

        System.out.println(
                " El ataque especial de " + miPokemon.getNombre() + " es de : " + miPokemon.getAtaqueEspecial());
        System.out.println("\n");
        System.out.println(" La velocidad de " + miPokemon.getNombre() + " es de : " + miPokemon.getVelocidad());
        System.out.println("\n");
        System.out.println(" La defensa especial " + miPokemon.getNombre() + " es de : " + miPokemon.getDefEspecial());
        System.out.println("\n");
        System.out.println(" La vitalidad " + miPokemon.getNombre() + " es de : " + miPokemon.getVitalidad());
        System.out.println("\n");

    }

    @FXML

    private void entrenamientoPesado(ActionEvent event) throws IOException {

        entrenador.entrenamientoPesado(miPokemon);

        txStats.setText("Las Stats de " + miPokemon.getNombre() + " son :" + " Defensa :"
                + miPokemon.getDefensa() + " Defensa Especial : " + miPokemon.getDefEspecial() +  " Vitalidad : " + miPokemon.getVitalidad());


    }


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        miPokemon = new Pokemon("Pikachu", null, 100, 50, 60, 10, 10, 10, 10, 10, 0, null, TipoEnum.AGUA,
                Estado.SIN_ESTADO);
        entrenador = new Entrenador(null, null, "PEPE", 1000);

    }

}
