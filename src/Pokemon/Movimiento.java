package pokemon;

public class Movimiento {
    /**
     * Esta es la clase movimiento, con sus atributos y métodos get y set.
     * @author Pedro y Jaime
     * @version 1.0
     */

    private String nombreMovimiento;
    protected int potenciaAtaque;
    private TipoEnum tipoMovimiento;
    private int estamina;

    public Movimiento(String nombreMovimiento,int potenciaAtaque,TipoEnum tipoMovimiento,int estamina){

        this.nombreMovimiento = nombreMovimiento;
        this.potenciaAtaque = potenciaAtaque;
        this.tipoMovimiento = tipoMovimiento;
        this.estamina = estamina;

    }
    

    public String getNombreMovimiento() {
        return nombreMovimiento;
    }

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
    
    public void setNombreMovimiento(String nombreMovimiento) {
        this.nombreMovimiento = nombreMovimiento;
    }
    
}
