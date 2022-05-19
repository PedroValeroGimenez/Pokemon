package controladores;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
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
import pokemon.Entrenador;
import pokemon.Estado;
import pokemon.Pokemon;
import pokemon.TipoEnum;



public class ControllerCaptura implements Initializable {

    MediaPlayer mediaPlayer;

    public void play() {
        String s = "C:/Users/jaime/Desktop/DAM/Proyecto Pokemon/Pokemon-1/lib/capturar.mp3";
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

    Pokemon pokemonACapturar;
    Entrenador entrenador;

    @FXML
    
    private Button btnCapturar;

    @FXML
    
    private TextField txCapturar;



    @FXML

    private void Capturar(ActionEvent event) throws IOException {


        entrenador.capturarPokemon(pokemonACapturar);

        if (entrenador.capturarPokemon(pokemonACapturar) == true) {

            txCapturar.setText("Enhorabuena! , Has capturado el Pokemon.");

        
        }

        else{

            txCapturar.setText("No has capturado el Pokemon, intentalo de nuevo!");
        }
        

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        pokemonACapturar = new Pokemon("Squirtle", null, 100, 100, 100, 100, 100, 100, 100, 100, 100, null, TipoEnum.AGUA, Estado.SIN_ESTADO);
        
        entrenador = new Entrenador(null, null, "Jaime", 20000);
    }


    
}
