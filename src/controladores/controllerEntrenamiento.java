package controladores;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class controllerEntrenamiento implements Initializable {

    @FXML
    private Button btnEntrenamientoFurioso;

    @FXML

    private void entrenamientoFurioso(ActionEvent event){
        System.out.println("prueba");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }


    
}
