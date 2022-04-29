package Entrenador;

import java.util.ArrayList;
import java.util.List;

public class Entrenador {

    private ArrayList<Pokemon> equipoPokemon;
    private ArrayList<Pokemon> caja;
    private String nombre;
    private int pokeDollar;

    Entrenador(ArrayList equipoPokemon, int cajas, String nombre,
            float pokeDollar) {
        this.equipoPokemon = equipoPokemon;
        this.caja = cajas;
        this.nombre = nombre;
        this.pokeDollar = (int) (Math.random() * 1000 + 800);

    }

    public ArrayList<Pokemon> getCaja() {
        return caja;
    }

    public ArrayList<Pokemon> getEquipoPokemon() {
        return equipoPokemon;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPokeDollar() {
        return pokeDollar;
    }

    public void setCaja(ArrayList<Pokemon> caja) {
        this.caja = caja;
    }

    public void setEquipoPokemon(ArrayList<Pokemon> equipoPokemon) {
        this.equipoPokemon = equipoPokemon;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPokeDollar(int pokeDollar) {
        this.pokeDollar = pokeDollar;
    }

    public boolean dejarPokemon(int numero) {
        if (this.equipoPokemon.size() < 2) {
            System.out.println("Tines que tener minimo un Pokemon, no puedes dejar el ultimo");
            return false;
        }

        else {
            this.caja.add(this.equipoPokemon.get(numero);
            return true;
            
            
        }
        
    }

}
