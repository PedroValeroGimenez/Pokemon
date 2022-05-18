package pokemon;

import java.util.ArrayList;
import java.util.List;

public class Entrenador {

    private ArrayList<Pokemon> equipoPokemon;
    private ArrayList<Pokemon> caja;
    private String nombre;
    private int pokeDollar;

    public Entrenador(ArrayList<Pokemon> equipoPokemon, ArrayList<Pokemon> caja, String nombre,
            int pokeDollar) {
        this.equipoPokemon = equipoPokemon;
        this.caja = caja;
        this.nombre = nombre;
        this.pokeDollar = (int) (Math.random() * 1000 + 800); // TODO: hacer cálculo entre 800 y 1000

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

    public void setPokeDollar(int numero) {
        this.pokeDollar = numero;
    }

    public boolean dejarPokemon(int numero) {

        if (this.equipoPokemon.size() < 2) {
            System.out.println("Tienes que tener mínimo un Pokemon, no puedes dejar el último");
            return false;
        } else {
            Pokemon pokemonASacarDelEquipo = this.equipoPokemon.get(numero - 1);

            this.caja.add(pokemonASacarDelEquipo);
            this.equipoPokemon.remove(pokemonASacarDelEquipo);
            return true;

        }
    }

    public boolean sacarPokemon(int numero) {
        if (this.equipoPokemon.size() >= 4) {
            System.out.println("No puedes sacar ningun Pokemon, tu equipo esta lleno");
            return false;
        } else {
            Pokemon pokemonASacarDeCaja = this.caja.get(numero - 1);
            this.equipoPokemon.add(pokemonASacarDeCaja);
            this.caja.remove(pokemonASacarDeCaja);
            return true;
        }

    }

    public boolean capturarPokemon(Pokemon pokemon) {
        int random = (int) (Math.random() * 3); // TODO: Calcular número entre 1 y 3
        System.out.println("Has lanzado una Pokeball");

        if (random == 1 || random == 2) {
            System.out.println("El pokemon ha sido capturado");
            // this.caja.add(pokemon);  No funciona el controlador de captura si esta linea no esta comentada.
            return true;
        } else {
            System.out.println("El Pokemon no ha sido capturado");
            return false;
        }

    }

    public void entrenamientoFurioso(Pokemon pokemon) {

        int comprobador = pokeDollar - (30 * pokemon.getNivel());

        //if (comprobador >= 0) {

            pokeDollar = pokeDollar - comprobador;
            pokemon.setAtaque(pokemon.getAtaque() + 5);
            pokemon.setVelocidad(pokemon.getVelocidad() + 5);
            pokemon.setAtaqueEspecial(pokemon.getAtaqueEspecial() + 5);
        //}

    }

    public void entrenamientoFuncional(Pokemon pokemon) {

        int comprobador = pokeDollar - (40 * pokemon.getNivel());

        //if (comprobador >= 0) {

            pokeDollar = pokeDollar - comprobador;
            pokemon.setVelocidad(pokemon.getVelocidad() + 5);
            pokemon.setAtaque(pokemon.getAtaque() + 5);
            pokemon.setDefensa(pokemon.getDefensa() + 5);
            pokemon.setVitalidad(pokemon.getVitalidad() + 5);

       // }

    }

    public void entrenamientoOnirico(Pokemon pokemon) {

        int comprobador = pokeDollar - (40 * pokemon.getNivel());

        //if (comprobador >= 0) {

            pokeDollar = pokeDollar - comprobador;
            pokemon.setVelocidad(pokemon.getVelocidad() + 5);
            pokemon.setAtaqueEspecial(pokemon.getAtaqueEspecial() + 5);
            pokemon.setDefEspecial(pokemon.getDefEspecial() + 5);
            pokemon.setVitalidad(pokemon.getVitalidad() + 5);

        //}

    }
}
