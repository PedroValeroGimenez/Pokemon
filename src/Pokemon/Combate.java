package pokemon;
/**
 * Esta es la clase combate que se usara para que los Pokemon luchen.
 * @author Pedro y Jaime
 * @version 1.0
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import javafx.application.Application;
import javafx.stage.Stage;

public class Combate {
    /**
     * Estos son los atributos de la clase combate
     */

    public static final String PATH = "./log/combate.log";
    private Entrenador entrenador;
    private Entrenador ganador;
    private Entrenador rival;
    private int turno;
    private LinkedList<Turno> turnos;
    private int koEntrenador = 0;
    private int koRival = 0;
    private Pokemon pokemonrival;
    private Pokemon mipokemon;

    Combate(Entrenador entrenador, Entrenador rival) {
        this.turno = 1;
        this.entrenador = entrenador;
        this.rival = rival;
        this.turnos = new LinkedList<>();
        /**
         * El constructor de la clase combate
         */

        /*
         * crear random
         * this.entrenador = entrenador;
         * rival = arrayEntrenadores[random]
         * for(int i = 0; i< 3; i++){
         * pokemo1 = arrayPokemon[random]
         * for(int i = 0; i<= entrenador.getEquipoPokemon()[0].getNivel(); i++){
         * pokemon1.subirnivel();
         * }
         * 
         * rival[i] = pokemon1;
         * }
         */


        
    }
        /**
         * Los métodos get y set de todos los atributos
         */

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public int getKoEntrenador() {
        return koEntrenador;
    }

    public int getKoRival() {
        return koRival;
    }

    public Entrenador getRival() {
        return rival;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public void setKoEntrenador(int koEntrenador) {
        this.koEntrenador = koEntrenador;
    }

    public void setKoRival(int koRival) {
        this.koRival = koRival;
    }

    public void setRival(Entrenador rival) {
        this.rival = rival;
    }

    /**
     * El método para almacenar todos los kos de los Pokemon
     */

    public void koCombate() {
        if (this.koEntrenador == 4) {
            rival = ganador;
        } else if (this.koRival == 4) {
            entrenador = ganador;

        }
    }
    /**
     * El método retirarse, que al retirarnos del combate termina el combate y perdemos el 33% de nuestro dinero.
     * @param miEntrenador
     */

    public void retirarse(Entrenador miEntrenador) {
        miEntrenador.setPokeDollar((int) (miEntrenador.getPokeDollar() - miEntrenador.getPokeDollar() * 0.33));
    }
/**
 * El método para gana experiencia, suma los niveles de ambos Pokemon los multiplica por 10 y divide el resultadop entre 4.
 */
    public void ganarExp() {
        mipokemon.setNivel((mipokemon.getNivel() + pokemonrival.getNivel() * 10) / 4);
    }

    /**
     * El método combate que crea una lista donde van los turnos.
     */

    public Combate() {
        turnos = new LinkedList<>();
    }
/**
 * Este método añade un turno
 */
    public void addTurno(Turno turno) {
        this.turnos.add(turno);
    }
/**
 * Este método escribe en el fichero de la carpeta log lo que hacemos en el combate
 */
    public void escribirCombate() {

        File fichero = new File(PATH);
        try {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Turno turno : turnos) {
                bw.write("Turno" + turno.getTurno() + ": \n");
                bw.write("Entrenador: " + turno.getMovimientoEntrenador() + "\n");
                bw.write("Rival: " + turno.getMovimientoRival() + "\n");

            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
