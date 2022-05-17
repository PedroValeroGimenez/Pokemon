package pokemon;



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

    public void koCombate() {
        if (this.koEntrenador == 4) {
            rival = ganador;
        } else if (this.koRival == 4) {
            entrenador = ganador;

        }
    }

    public void retirarse() {
        this.entrenador.setPokeDollar((int) (this.entrenador.getPokeDollar() - this.entrenador.getPokeDollar() * 0.33));
        this.rival.setPokeDollar((int) (this.rival.getPokeDollar() + this.rival.getPokeDollar() * 0.33));
    }

    public void ganarExp() {
        mipokemon.setNivel((mipokemon.getNivel() + pokemonrival.getNivel() * 10) / 4);
    }

    public Combate() {
        turnos = new LinkedList<>();
    }

    public void addTurno(Turno turno) {
        this.turnos.add(turno);
    }

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
