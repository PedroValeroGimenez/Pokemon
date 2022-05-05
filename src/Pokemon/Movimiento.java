package Pokemon;

public class Movimiento {

    protected static int potenciaAtaque;
    private TipoEnum tipoMovimiento;

    public int getPotenciaAtaque() {
        return potenciaAtaque;
    }

    public TipoEnum getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setPotenciaAtaque(int potenciaAtaque) {
        Movimiento.potenciaAtaque = potenciaAtaque;
    }

    public void setTipoMovimiento(TipoEnum tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }


    
}
