
package pokemon;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pokemon.Estado;
import pokemon.Movimiento;
import pokemon.Pokemon;
import pokemon.TipoEnum;

public class MainPrueba extends Application {

    public static void main(String[] args) {

        Combate c = new Combate();
        Turno t1 = new Turno(1,"Squirte usa pistola agua", "Charmander usa ascuas");

        c.addTurno(t1);
        c.escribirCombate();

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../vistas/menuPokemon/pokemonMenu.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
