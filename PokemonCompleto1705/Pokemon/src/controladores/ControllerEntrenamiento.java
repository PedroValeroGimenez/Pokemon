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

public class ControllerEntrenamiento implements Initializable{

    @FXML
    private Button EntrenamientoFurioso;
    private Button EntrenamientoFuncional;
    private Button EntrenamientoOnirico;

    @FXML

    private void entrenamientoFurioso(ActionEvent event) throws IOException {
        
        System.out.println("EntrenamientoFurioso!");


    }

    @FXML

    private void entrenamientoFuncional(ActionEvent event) throws IOException {
        
        System.out.println("EntrenamientoFuncional!");


    }

    @FXML

    private void entrenamientoOnirico(ActionEvent event) throws IOException {
        
        System.out.println("EntrenamientoOnirico!");


    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        
    }
    
}
