package controladores;
/**
 * 
 * 
 */

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
        String s = "img/capturar.mp3";
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

    Pokemon pokemonCaptura;

    Pokemon poke1;
    Pokemon poke2;
    Pokemon poke3;
    Pokemon poke4;

    Entrenador entrenador;
    ArrayList<Pokemon> caja ;
   
    @FXML
    
    private Button btnCapturar;

    @FXML
    
    private Button btnEquipo;

    @FXML
    
    private TextField txCapturar;



    @FXML

    private void Capturar(ActionEvent event) throws IOException {


        if (entrenador.capturarPokemon(poke1 ) == true) {

            txCapturar.setText("Enhorabuena! , Has capturado el Pokemon.");

            this.caja.add(poke1);

        }

        else{

            txCapturar.setText("No has capturado el Pokemon, intentalo de nuevo!");
        }
        

    }

    @FXML

    private void listarEquipo(ActionEvent event) throws IOException {


        for (int i = 0 ; i < caja.size() ; i++){

        caja.get(i).getNombre();

        }

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ArrayList<Pokemon> salvajes = new ArrayList<Pokemon>();
        salvajes.add(poke1);
        salvajes.add(poke2);
        salvajes.add(poke3);
        salvajes.add(poke4);

        entrenador = new Entrenador(null, caja, "Jaime", 3000);
        poke1 = new Pokemon("Torterra", null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null);
        poke2 = new Pokemon("Gengar", null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null);
        poke3 = new Pokemon("Pikachu", null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null);
        poke4 = new Pokemon("Ho-Ho", null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null);
        caja = new ArrayList<Pokemon>();


    }


    
}
