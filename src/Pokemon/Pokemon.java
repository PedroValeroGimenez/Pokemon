package pokemon;
/**
 * Esta es la clase pokemon con todos los atributos, métodos get y set, el método subir de nivel, método atacar, y el método ventaja.
 *
 * @author Pedro y Jaime
 * @version 1.0
 */

import java.util.Random;

public class Pokemon {

/**
 * Los atributos de los Pokemon
 */

    private int ID;
    private String nombre;
    private String mote;
    private int vitalidad;
    private int vitalidadAct;
    private int ataque;
    private int ataqueAct;
    private int defensa;
    private int defensaAct;
    private int ataqueEspecial;
    private int ataqueEspecialAct;
    private int defEspecial;
    private int defEspecialAct;
    private int velocidad;
    private int velocidadAct;
    private int estamina;
    private int estaminaAct;
    private int nivel;
    private int experiencia;
    private int fertilidad = 5;
    private int fertilidadAct;
    private Movimiento[] arrayMovimiento = new Movimiento[4];
    private Movimiento[] movimientosDisponibles;
    private TipoEnum tipo;
    private Estado estado;

    public Pokemon(String nombre, String mote, int vitalidad, int ataque, int defensa, int ataqueEspecial,
            int defEspecial, int velocidad, int estamina, int nivel, int fertilidad, Movimiento[] arrayMovimiento,
            TipoEnum tipo, Estado estado) {

            

        this.nombre = nombre;
        this.mote = mote;
        this.vitalidad = vitalidad;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defEspecial = defEspecial;
        this.velocidad = velocidad;
        this.estamina = estamina;
        this.nivel = nivel;
        this.fertilidad = fertilidad;
        this.arrayMovimiento = arrayMovimiento;
        this.tipo = tipo;
        this.estado = estado;

    }

    public Pokemon(int i, String string, String string2, String string3) {
    }

    public int getID() {
        return ID;
    }

    public Movimiento[] getMovimientosDisponibles() {
        return movimientosDisponibles;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public Movimiento[] getArrayMovimiento() {
        return arrayMovimiento;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getDefEspecial() {
        return defEspecial;
    }

    public int getDefensa() {
        return defensa;
    }

    public Estado getEstado() {
        return estado;
    }

    public int getEstamina() {
        return estamina;
    }

    public int getFertilidad() {
        return fertilidad;
    }

    public String getMote() {
        return mote;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoEnum getTipo() {
        return tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public int getAtaqueAct() {
        return ataqueAct;
    }

    public int getAtaqueEspecialAct() {
        return ataqueEspecialAct;
    }

    public int getDefEspecialAct() {
        return defEspecialAct;
    }

    public int getDefensaAct() {
        return defensaAct;
    }

    public int getEstaminaAct() {
        return estaminaAct;
    }

    public int getVelocidadAct() {
        return velocidadAct;
    }

    public int getVitalidadAct() {
        return vitalidadAct;
    }

    public int getFertilidadAct() {
        return fertilidadAct;
    }

    public void setMovimientosDisponibles(Movimiento[] movimientosDisponibles) {
        this.movimientosDisponibles = movimientosDisponibles;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setArrayMovimiento(Movimiento[] arrayMovimiento) {
        this.arrayMovimiento = arrayMovimiento;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public void setDefEspecial(int defEspecial) {
        this.defEspecial = defEspecial;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public void setFertilidad(int fertilidad) {
        this.fertilidad = fertilidad;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public void setAtaqueAct(int ataqueAct) {
        this.ataqueAct = ataqueAct;
    }

    public void setAtaqueEspecialAct(int ataqueEspecialAct) {
        this.ataqueEspecialAct = ataqueEspecialAct;
    }

    public void setDefEspecialAct(int defEspecialAct) {
        this.defEspecialAct = defEspecialAct;
    }

    public void setDefensaAct(int defensaAct) {
        this.defensaAct = defensaAct;
    }

    public void setEstaminaAct(int estaminaAct) {
        this.estaminaAct = estaminaAct;
    }

    public void setVelocidadAct(int velocidadAct) {
        this.velocidadAct = velocidadAct;
    }

    public void setVitalidadAct(int vitalidadAct) {
        this.vitalidadAct = vitalidadAct;
    }

    public void setFertilidadAct(int fertilidadAct) {
        this.fertilidadAct = fertilidadAct;
    }
/**
 * El método subir de nivel hace que el Pokemon suba de nivel y cada vez que sube de nivel aumenten las estadísticas del Pokemon
 */
    public void subirNivel() {

        Random rnd = new Random();

        if (experiencia == nivel * 10) {

            vitalidad = vitalidad + rnd.nextInt(5) + 1;
            ataque = ataque + rnd.nextInt(5) + 1;
            defensa = defensa + rnd.nextInt(5) + 1;
            ataqueEspecial = ataqueEspecial + rnd.nextInt(5) + 1;
            defEspecial = defEspecial + rnd.nextInt(5) + 1;
            velocidad = velocidad + rnd.nextInt(5) + 1;

            nivel++;

            // TODO;

            if (nivel % 3 == 1) {

            }

        }

    }
/**
 * El método atacar para que un Pokemon quite vida a otro cuando le ataque.
 * @param pokemonAAtacar
 * @param movimientoAUsar
 */
    public void atacar(Pokemon pokemonAAtacar, Movimiento movimientoAUsar) {

        int vitalidadAQuitar;

        if (this.estamina > movimientoAUsar.getEstamina()) {

            if (this.ventajaODesventaja(pokemonAAtacar) == Ventaja.VENTAJA) {

                vitalidadAQuitar = (int) ((this.ataque - pokemonAAtacar.getDefensa())*1.5 + movimientoAUsar.potenciaAtaque);
                        

                pokemonAAtacar.vitalidad = pokemonAAtacar.vitalidad - vitalidadAQuitar;

            }

        }

        else if (this.ventajaODesventaja(pokemonAAtacar) == Ventaja.NEUTRO) {

            vitalidadAQuitar = (int) ((this.ataque - pokemonAAtacar.getDefensa()) + movimientoAUsar.potenciaAtaque);

            pokemonAAtacar.vitalidad = pokemonAAtacar.vitalidad - vitalidadAQuitar;

        }

        else if (this.ventajaODesventaja(pokemonAAtacar) == Ventaja.DESVENTAJA) {

            vitalidadAQuitar = (int) ((this.ataqueAct - pokemonAAtacar.getDefensa())* 0.5 + movimientoAUsar.potenciaAtaque);

            pokemonAAtacar.vitalidad = pokemonAAtacar.vitalidad - vitalidadAQuitar;

        }
    }


/**
 * Este método ventaja hace que un Pokemon tenga ventaja o desventaja sobre otro dependiendo del tipo que sea, y asi hace mas daño o menos.
 * @param pokemonRival
 * @return
 */
    public Ventaja ventajaODesventaja(Pokemon pokemonRival) {

        if (this.getTipo() == TipoEnum.AGUA && pokemonRival.getTipo() == TipoEnum.FUEGO) {
            return Ventaja.VENTAJA;
        }

        else if (this.getTipo() == TipoEnum.AGUA && pokemonRival.getTipo() == TipoEnum.TIERRA) {
            return Ventaja.VENTAJA;
        }

        else if (this.getTipo() == TipoEnum.FUEGO && pokemonRival.getTipo() == TipoEnum.PLANTA) {
            return Ventaja.VENTAJA;
        }

        else if (this.getTipo() == TipoEnum.FUEGO && pokemonRival.getTipo() == TipoEnum.BICHO) {
            return Ventaja.VENTAJA;
        }

        else if (this.getTipo() == TipoEnum.PLANTA && pokemonRival.getTipo() == TipoEnum.AGUA) {
            return Ventaja.VENTAJA;
        }

        else if (this.getTipo() == TipoEnum.PLANTA && pokemonRival.getTipo() == TipoEnum.TIERRA) {
            return Ventaja.VENTAJA;
        }

        else if (this.getTipo() == TipoEnum.BICHO && pokemonRival.getTipo() == TipoEnum.PLANTA) {
            return Ventaja.VENTAJA;
        }

        else if (this.getTipo() == TipoEnum.VOLADOR && pokemonRival.getTipo() == TipoEnum.PLANTA) {
            return Ventaja.VENTAJA;
        }

        else if (this.getTipo() == TipoEnum.VOLADOR && pokemonRival.getTipo() == TipoEnum.BICHO) {
            return Ventaja.VENTAJA;
        }

        else if (this.getTipo() == TipoEnum.ELECTRICO && pokemonRival.getTipo() == TipoEnum.AGUA) {
            return Ventaja.VENTAJA;
        }

        else if (this.getTipo() == TipoEnum.TIERRA && pokemonRival.getTipo() == TipoEnum.ELECTRICO) {
            return Ventaja.VENTAJA;
        }

        else if (this.getTipo() == TipoEnum.TIERRA && pokemonRival.getTipo() == TipoEnum.FUEGO) {
            return Ventaja.VENTAJA;
        }

        else if (this.getTipo() == TipoEnum.TIERRA && pokemonRival.getTipo() == TipoEnum.FUEGO) {
            return Ventaja.VENTAJA;
        }

        else if (this.getTipo() == TipoEnum.AGUA && pokemonRival.getTipo() == TipoEnum.VOLADOR
                || pokemonRival.getTipo() == TipoEnum.BICHO) {
            return Ventaja.NEUTRO;
        }

        else if (this.getTipo() == TipoEnum.FUEGO && pokemonRival.getTipo() == TipoEnum.ELECTRICO
                || pokemonRival.getTipo() == TipoEnum.TIERRA || pokemonRival.getTipo() == TipoEnum.VOLADOR) {
            return Ventaja.NEUTRO;
        }

        else if (this.getTipo() == TipoEnum.PLANTA && pokemonRival.getTipo() == TipoEnum.ELECTRICO) {
            return Ventaja.NEUTRO;
        }

        else if (this.getTipo() == TipoEnum.BICHO && pokemonRival.getTipo() == TipoEnum.AGUA
                || pokemonRival.getTipo() == TipoEnum.BICHO || pokemonRival.getTipo() == TipoEnum.ELECTRICO
                || pokemonRival.getTipo() == TipoEnum.TIERRA) {
            return Ventaja.NEUTRO;
        }

        else if (this.getTipo() == TipoEnum.ELECTRICO && pokemonRival.getTipo() == TipoEnum.BICHO
                || pokemonRival.getTipo() == TipoEnum.ELECTRICO || pokemonRival.getTipo() == TipoEnum.FUEGO) {
            return Ventaja.NEUTRO;
        }

        else if (this.getTipo() == TipoEnum.VOLADOR && pokemonRival.getTipo() == TipoEnum.AGUA
                || pokemonRival.getTipo() == TipoEnum.FUEGO || pokemonRival.getTipo() == TipoEnum.TIERRA
                || pokemonRival.getTipo() == TipoEnum.VOLADOR) {
            return Ventaja.NEUTRO;
        }

        else if (this.getTipo() == TipoEnum.TIERRA && pokemonRival.getTipo() == TipoEnum.AGUA
                || pokemonRival.getTipo() == TipoEnum.TIERRA) {
            return Ventaja.NEUTRO;
        }

        else {
            return Ventaja.VENTAJA;
        }

    }
/**
 * Este método descansar lo utilizaremos para recuperar la estamina.
 */
    public void descansar() {

        // Recupera la estamina a la estamina base.

        estaminaAct = estamina;

    }

}
