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
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import pokemon.Pokemon;


public class ControllerCombate implements Initializable {

    @FXML
    private Button btnAtacar;

    @FXML
    private TextField txLog;

    private Pokemon miPokemon;
    private Pokemon rivalPokemon;

    @FXML

    private void Atacar(ActionEvent event) throws IOException {

       miPokemon.atacar(rivalPokemon, null);
       txLog.setText("La vitalidad de " + rivalPokemon.getNombre()+" es "+ rivalPokemon.getVitalidad());

        
    }


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        miPokemon = new Pokemon("pikachu", null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null);
        rivalPokemon = new Pokemon("Squirtle", null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null);
    }





    
}
