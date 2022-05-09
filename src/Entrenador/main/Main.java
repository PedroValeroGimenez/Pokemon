package Entrenador.main;

import Entrenador.Combate;
import Entrenador.Turno;

public class Main {
    public static void main(String[] args) {
        Combate c = new Combate();
        Turno t1 = new Turno(1, " Squirtle usa Pistola Agua", " Charmander usa ascuas");
        c.addTurno(t1);
        c.escribirCombate();
    }

}
