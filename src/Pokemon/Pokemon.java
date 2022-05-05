package Pokemon;

import java.util.Random;

public class Pokemon {

    private String nombre;
    private String mote;
    private int vitalidad;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defEspecial;
    private int velocidad;
    private int estamina;
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

            //TODO

            if (nivel % 3 == 0) {

            }

        }

    }

    public void atacar(Pokemon pokemonAAtacar, Movimiento movimientoAUsar) {

        if (movimientoAUsar.getTipoMovimiento() == TipoEnum.NORMAL) {

            Movimiento.potenciaAtaque = ataque * Movimiento.potenciaAtaque - pokemonAAtacar.defensa;

        }

        else if (movimientoAUsar.getTipoMovimiento() == TipoEnum.){


        }

    }

}
