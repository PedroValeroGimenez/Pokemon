package pokemon;

/**
 * Esta es la clase entrenador que se usara para utilizar los metodos de entrenador.
 * @author Pedro y Jaime
 * @version 1.0
 */

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

    public void setPokeDollar(int numero) {
        this.pokeDollar = numero;
    }
/**
 * Este método se utiliza para añdir un Pokemon en la caja.
 * @param numero
 * @return
 */
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
    /**
     * Este método sirve para sacar un Pokemon de la caja.
     * @param numero
     * @return 
     */

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
    /** 
     *Este metodo añade el Pokemon capturado a la caja si nuestro equipo esta completo si no se añade al equipo.
     */

    public boolean capturarPokemon(Pokemon pokemonACapturar) {
        int random = (int) (Math.random() * 3);
        System.out.println("Has lanzado una Pokeball");

        if (random == 1 || random == 2) {
            System.out.println("El pokemon ha sido capturado");
            //this.caja.add(pokemon);
            return true;
        } else {
            System.out.println("El Pokemon no ha sido capturado");
            return false;
        }

    }
    /**
     * Este método es un entrenamiento que aumenta los atributos de los Pokemon.  
     * @param pokemon
     */

    public void entrenamientoFurioso(Pokemon pokemon) {

        int comprobador = pokeDollar - (30 * pokemon.getNivel());

        // if (comprobador >= 0) {

        pokeDollar = pokeDollar - comprobador;
        pokemon.setAtaque(pokemon.getAtaque() + 5);
        pokemon.setVelocidad(pokemon.getVelocidad() + 5);
        pokemon.setAtaqueEspecial(pokemon.getAtaqueEspecial() + 5);
        // }

    }
    /**
     * Este método es un entrenamiento que aumenta los atributos de los Pokemon.
     * @param pokemon
     */

    public void entrenamientoFuncional(Pokemon pokemon) {

        int comprobador = pokeDollar - (40 * pokemon.getNivel());

        // if (comprobador >= 0) {

        pokeDollar = pokeDollar - comprobador;
        pokemon.setVelocidad(pokemon.getVelocidad() + 5);
        pokemon.setAtaque(pokemon.getAtaque() + 5);
        pokemon.setDefensa(pokemon.getDefensa() + 5);
        pokemon.setVitalidad(pokemon.getVitalidad() + 5);

        // }

    }
    /**
     * Este método es un entrenamiento que aumenta los atributos de los Pokemon.
     * @param pokemon
     */

    public void entrenamientoOnirico(Pokemon pokemon) {

        int comprobador = pokeDollar - (40 * pokemon.getNivel());

        //if (comprobador >= 0) {

            pokeDollar = pokeDollar - comprobador;
            pokemon.setVelocidad(pokemon.getVelocidad() + 5);
            pokemon.setAtaqueEspecial(pokemon.getAtaqueEspecial() + 5);
            pokemon.setDefEspecial(pokemon.getDefEspecial() + 5);
            pokemon.setVitalidad(pokemon.getVitalidad() + 5);
        }

        //}

       /**
     * Este método es un entrenamiento que aumenta los atributos de los Pokemon.
     * @param pokemon
     */ 

    public void entrenamientoPesado(Pokemon pokemon) {

        int comprobador = pokeDollar - (20 * pokemon.getNivel());

        // if (comprobador >= 0) {

        pokeDollar = pokeDollar - comprobador;
        pokemon.setDefensa(pokemon.getDefensa() + 5);
        pokemon.setDefEspecial(pokemon.getDefEspecial() + 5);
        pokemon.setVitalidad(pokemon.getVitalidad() + 5);

    }
}
