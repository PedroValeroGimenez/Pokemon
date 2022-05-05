package Entrenador;

public class Combate {
    private Entrenador entrenador;
    private Entrenador ganador;
    private Entrenador rival;
    private int turno;
    private int koEntrenador;
    private int koRival;

    Combate(int turno, int koEntrenador, int koRival, Entrenador entrenador, Entrenador rival, Entrenador ganador) {
        this.turno = 1;
        this.koEntrenador = 0;
        this.koRival = 0;
        this.entrenador = entrenador;
        this.rival = rival;
        this.ganador = ganador;
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

    public int getTurno() {
        return turno;
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

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void koCombate() {
        if (koEntrenador = 4) {
            rival = ganador;
        }
        else {
            (koRival = 4)
            entrenador = ganador;
            
        }
       
    }

    public void retirarse() {

        this.entrenador.setPokeDollar(this.entrenador.getPokeDollar() - this.entrenador.getPokeDollar() * 0.33);
        this.rival.setPokeDollar(this.rival.getPokeDollar() + this.rival.getPokeDollar() * 0.33);

    }

}
