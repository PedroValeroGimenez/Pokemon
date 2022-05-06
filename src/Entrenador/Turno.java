package Entrenador;

public class Turno {
    private int turno;
    private String movimientoEntrenador;
    private String movimientoRival;
    private String texto;

    Turno(int Turno, String movimientoEntrenador, String movimientoRival) {
        this.turno = Turno;
        this.movimientoEntrenador = movimientoEntrenador;
        this.movimientoRival = movimientoRival;
        this.tex

        texto = "Turno: " + getTurno() + \n + mipokemon.getNombre() + "uso: " + movimientoEntrenador.getNombre() + \n + pokemonrival.getNombre() + " usó: "
        + movimientoRival.getNombre();
    }

    public String getMovimientoEntrenador() {
        return movimientoEntrenador;
    }

    public String getMovimientoRival() {
        return movimientoRival;
    }

    public int getTurno() {
        return Turno;
    }

    public void setMovimientoEntrenador(String movimientoEntrenador) {
        this.movimientoEntrenador = movimientoEntrenador;
    }

    public void setMovimientoRival(String movimientoRival) {
        this.movimientoRival = movimientoRival;
    }

    public void setTurno(int turno) {
        Turno = turno;
    }

}
