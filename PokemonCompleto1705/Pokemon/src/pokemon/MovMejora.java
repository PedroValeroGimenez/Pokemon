package pokemon;

public class MovMejora extends Movimiento {

    private Mejoras mejoras;
    private int numeroTurnos;

    public Mejoras getMejoras() {
        return mejoras;
    }

    public int getNumeroTurnos() {
        return numeroTurnos;
    }

    @Override
    public int getPotenciaAtaque() {
        return super.getPotenciaAtaque();
    }

    @Override
    public TipoEnum getTipoMovimiento() {
        return super.getTipoMovimiento();
    }

    public void setMejoras(Mejoras mejoras) {
        this.mejoras = mejoras;
    }

    public void setNumeroTurnos(int numeroTurnos) {
        this.numeroTurnos = numeroTurnos;
    }

    @Override
    public void setPotenciaAtaque(int potenciaAtaque) {
    }

    @Override
    public void setTipoMovimiento(TipoEnum tipoMovimiento) {
    }

}
