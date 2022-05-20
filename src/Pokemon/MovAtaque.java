package pokemon;
/**
 * Esta es la clase de los movimientos de ataque, con sus atributos
 * @author Pedro y Jaime
 * @version 1.0
 */

public class MovAtaque extends Movimiento {

    public MovAtaque(String nombreMovimiento, int potenciaAtaque, TipoEnum tipoMovimiento, int estamina) {
        super(nombreMovimiento, potenciaAtaque, tipoMovimiento, estamina);
    }

    @Override
    public int getPotenciaAtaque() {
        return super.getPotenciaAtaque();
    }

    @Override
    public TipoEnum getTipoMovimiento() {
        return super.getTipoMovimiento();
    }

    @Override
    public void setPotenciaAtaque(int potenciaAtaque) {
        super.setPotenciaAtaque(potenciaAtaque);
    }

    @Override
    public void setTipoMovimiento(TipoEnum tipoMovimiento) {
        super.setTipoMovimiento(tipoMovimiento);
    }

}
