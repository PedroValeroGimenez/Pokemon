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
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import pokemon.Estado;
import pokemon.Pokemon;
import pokemon.TipoEnum;
import pokemon.Entrenador;

public class ControllerEntrenamiento implements Initializable{

    @FXML
    private Button EntrenamientoFurioso;
    private Button EntrenamientoFuncional;
    private Button EntrenamientoOnirico;
    private Pokemon miPokemon;
    private Entrenador entrenador;

    @FXML

    private void entrenamientoFurioso(ActionEvent event) throws IOException {
        
        entrenador.entrenamientoFurioso(miPokemon);

        System.out.println(miPokemon.getAtaqueEspecial());
        System.out.println(miPokemon.getVelocidad());
        System.out.println(miPokemon.getAtaqueEspecial());

    }

    @FXML

    private void entrenamientoFuncional(ActionEvent event) throws IOException {
        
        entrenador.entrenamientoFuncional(miPokemon);


    }

    @FXML

    private void entrenamientoOnirico(ActionEvent event) throws IOException {
        
        entrenador.entrenamientoOnirico(miPokemon);


    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        miPokemon = new Pokemon("Pikachu", null, 100, 50, 60, 10, 10, 10, 10, 10, 0, null,TipoEnum.AGUA, Estado.SIN_ESTADO);
        
        
        
    }
    
}
