package Pokemon;

import java.util.Random;

public class Pokemon {

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
    private int fertilidad;
    private Movimiento[] arrayMovimiento;
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

    public void subirNivel() {

        Random rnd = new Random();
        int puntosAleatorios = rnd.nextInt(1 - 5);

        if (experiencia == nivel * 10) {

            vitalidad = vitalidad + puntosAleatorios;
            ataque = ataque + puntosAleatorios;
            defensa = defensa + puntosAleatorios;
            ataqueEspecial = ataqueEspecial + puntosAleatorios;
            defEspecial = defEspecial + puntosAleatorios;
            velocidad = velocidad + puntosAleatorios;

            nivel++;

            // TODO;

            if (nivel % 3 == 1) {

            }

        }

    }

    public void atacar(Pokemon pokemonAAtacar, Movimiento movimientoAUsar) {

        int vitalidadAQuitar;

        if (this.ventajaODesventaja(pokemonAAtacar) == Ventaja.VENTAJA) {

            vitalidadAQuitar = pokemonAAtacar.getVitalidad() - (this.getAtaqueAct() * 2) + ataque - defensa;

            pokemonAAtacar.vitalidad = pokemonAAtacar.vitalidad - vitalidadAQuitar;

        }

        else if (this.ventajaODesventaja(pokemonAAtacar) == Ventaja.NEUTRO) {

            vitalidadAQuitar = pokemonAAtacar.getVitalidad() - (this.getAtaqueEspecialAct()) + ataque
                    - defensa;

            pokemonAAtacar.vitalidad = pokemonAAtacar.vitalidad - vitalidadAQuitar;

        }

        else if (this.ventajaODesventaja(pokemonAAtacar) == Ventaja.DESVENTAJA) {

            vitalidadAQuitar = (int) (pokemonAAtacar.getVitalidad() - (this.getAtaqueEspecialAct()*0.5) + ataque
                    - defensa);

            pokemonAAtacar.vitalidad = pokemonAAtacar.vitalidad - vitalidadAQuitar;

        }

    }

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

    public void descansar() {

        // Recupera la estamina a la estamina base.

        estaminaAct = estamina;

    }

}
