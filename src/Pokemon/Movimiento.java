package Pokemon;

public class Movimiento {

    protected int potenciaAtaque;
    private TipoEnum tipoMovimiento;
    private int estamina;
    

    public int getPotenciaAtaque() {
        return potenciaAtaque;
    }

    public TipoEnum getTipoMovimiento() {
        return tipoMovimiento;
    }

    public int getEstamina() {
        return estamina;
    }

   public void setPotenciaAtaque(int potenciaAtaque) {
       this.potenciaAtaque = potenciaAtaque;
   }

    public void setTipoMovimiento(TipoEnum tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }
    
}
