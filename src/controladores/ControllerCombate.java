package controladores;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

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
import pokemon.MainPrueba;
import pokemon.Combate;

public class ControllerCombate implements Initializable {

    MediaPlayer mediaPlayer;

    public void play() {
        String s = "img/combate.mp3";
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
    private Button btnMov1;

    @FXML
    private Button btnMov2;

    @FXML
    private Button btnMov3;

    @FXML
    private Button btnMov4;

    @FXML

    private javafx.scene.control.Button btnHuir;

    @FXML
    private TextField txLog;

    private Combate combate;
    private Pokemon miPokemon;
    private Pokemon rivalPokemon;
    private Movimiento movPrueba;
    private Entrenador entrenador;
    private int contadorRival;
    private int contador;

    @FXML

    private void Atacar(ActionEvent event) throws IOException {

        if (contador < 3 && contadorRival < 3) {

            if (miPokemon.getVitalidad() > 0 && rivalPokemon.getVitalidad() > 0) {

                miPokemon.atacar(rivalPokemon, movPrueba);

                this.btnAtacar.setVisible(true);
                this.btnHuir.setVisible(true);

            }

            else if (miPokemon.getVitalidad() < 0) {
                contador++;
                // TODOS LOS POKEMON TIENEN 100 DE VIDA
                miPokemon.setVitalidad(100);
            }

            if (rivalPokemon.getVitalidad() > 0 && miPokemon.getVitalidad() > 0) {

                rivalPokemon.atacar(miPokemon, movPrueba);

            }

            else if (rivalPokemon.getVitalidad() < 0) {
                contadorRival++;
                // TODOS LOS POKEMON TIENEN 100 DE VIDA
                rivalPokemon.setVitalidad(100);
            }

            txLog.setText("La vitalidad de " + miPokemon.getNombre() + " es de: " +
                    miPokemon.getVitalidad() + " y la vitalidad de " + rivalPokemon.getNombre() + " es de : "
                    + rivalPokemon.getVitalidad() + " llevas " + contador + " ko`s" + " y tu rival " + contadorRival
                    + " ko`s");

            combate.escribirCombate();

        } else {
            txLog.setText("El combate ha terminado");
        }

    }

    @FXML

    private void Huir(ActionEvent event) throws IOException, InterruptedException {

        combate.retirarse(entrenador);

        txLog.setText("Entrenador " + entrenador.getNombre() + " se ha retirado del combate " + "\n"
          + "tus pokedolares actuales son " + entrenador.getPokeDollar());


    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        miPokemon = new Pokemon("pikachu", null, 200, 60, 20, 0, 0, 0, 200, 0, 0, null, null, null);
        rivalPokemon = new Pokemon("Squirtle", null, 200, 38, 20, 0, 0, 0, 200, 0, 0, null, null, null);
        movPrueba = new Movimiento("Pistola agua", 5, TipoEnum.AGUA, 50);
        entrenador = new Entrenador(null, null, "Jaime", 20000);
        combate = new Combate();

    }

}
