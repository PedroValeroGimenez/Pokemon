package Entrenador;

import java.util.ArrayList;

public class Combate {
    private Entrenador entrenador;
    private Entrenador ganador;
    private Entrenador rival;
    private int turno;
    private ArrayList<Turno> turnos;
    private int koEntrenador = 0;
    private int koRival = 0;
    private Pokemon pokemonrival;
    private Pokemon mipokemon;

    Combate(Entrenador entrenador) {
        crear random
        this.entrenador = entrenador;
        rival = arrayEntrenadores[random]
        for(int i = 0; i< 3; i++){
            pokemo1 = arrayPokemon[random]
            for(int i = 0; i<= entrenador.getEquipoPokemon()[0].getNivel(); i++){
                pokemon1.subirnivel();
            }

            rival[i] = pokemon1;
        }
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
        mipokemon.setNivel((mipokemon.getNivel() + pokemonrival * 10) / 4);
    }

    public void guardarTurno(int turno, ) {
        Turno turno = new Turno(Turno, movimientoEntrenador, movimientoRival)
    }

}
