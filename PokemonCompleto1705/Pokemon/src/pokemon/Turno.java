package pokemon;

public class Turno {
    private int turno;
    private String movimientoEntrenador;
    private String movimientoRival;

    public Turno(int turno, String movimientoEntrenador, String movimientoRival) {
        this.turno = turno;
        this.movimientoEntrenador = movimientoEntrenador;
        this.movimientoRival = movimientoRival;

    }

    public String getMovimientoEntrenador() {
        return movimientoEntrenador;
    }

    public String getMovimientoRival() {
        return movimientoRival;
    }

    public int getTurno() {
        return this.turno;
    }

    public void setMovimientoEntrenador(String movimientoEntrenador) {
        this.movimientoEntrenador = movimientoEntrenador;
    }

    public void setMovimientoRival(String movimientoRival) {
        this.movimientoRival = movimientoRival;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

}
