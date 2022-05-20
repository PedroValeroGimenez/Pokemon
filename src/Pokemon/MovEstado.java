package pokemon;
/**
 * Esta es la clase de los movimientos de estado, con los métodos get y set y los atributos.
 */

public class MovEstado extends Movimiento {

    public MovEstado(String nombreMovimiento, int potenciaAtaque, TipoEnum tipoMovimiento, int estamina) {
        super(nombreMovimiento, potenciaAtaque, tipoMovimiento, estamina);
        
    }

    private Estado estado;
    private int numeroTurnos;

    @Override
    public int getPotenciaAtaque() {
        return super.getPotenciaAtaque();
    }

    @Override
    public TipoEnum getTipoMovimiento() {
        return super.getTipoMovimiento();
    }

    public Estado getEstado() {
        return estado;
    }

    public int getNumeroTurnos() {
        return numeroTurnos;
    }

    @Override
    public void setPotenciaAtaque(int potenciaAtaque) {
        super.setPotenciaAtaque(potenciaAtaque);
    }

    @Override
    public void setTipoMovimiento(TipoEnum tipoMovimiento) {
        super.setTipoMovimiento(tipoMovimiento);
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setNumeroTurnos(int numeroTurnos) {
        this.numeroTurnos = numeroTurnos;
    }

}
