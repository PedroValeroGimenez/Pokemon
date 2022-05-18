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
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import pokemon.Combate;
import pokemon.Entrenador;
import pokemon.Movimiento;
import pokemon.Pokemon;
import pokemon.TipoEnum;

public class ControllerCombate implements Initializable {

    MediaPlayer mediaPlayer;

    public void play() {
        String s = "C:/Users/jaime/Desktop/DAM/Proyecto Pokemon/Pokemon-1/lib/combate.mp3";
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
    private Button btnAtacar;

    @FXML

    private javafx.scene.control.Button btnHuir;

    @FXML
    private TextField txLog;

    private Combate combate;
    private Pokemon miPokemon;
    private Pokemon rivalPokemon;
    private Movimiento movPrueba;
    private Entrenador entrenador;

    @FXML

    private void Atacar(ActionEvent event) throws IOException {

        miPokemon.atacar(rivalPokemon, movPrueba);
        txLog.setText("La vitalidad de " + rivalPokemon.getNombre() + " es " + rivalPokemon.getVitalidad());

    }

    @FXML

    private void Huir(ActionEvent event) throws IOException {

        combate.retirarse(entrenador);

        txLog.setText("Entrenador " + entrenador.getNombre() + " se ha retirado del combate " + "\n"
                + "tus pokedolares actuales son " + entrenador.getPokeDollar());

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        miPokemon = new Pokemon("pikachu", null, 100, 0, 0, 0, 0, 0, 200, 0, 0, null, null, null);
        rivalPokemon = new Pokemon("Squirtle", null, 200, 0, 0, 0, 0, 0, 200, 0, 0, null, null, null);
        movPrueba = new Movimiento("Pistola agua", 20, TipoEnum.AGUA, 50);
        entrenador = new Entrenador(null, null, "Jaime", 20000);
        combate = new Combate();
    }

}
