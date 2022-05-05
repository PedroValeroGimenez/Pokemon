package Pokemon;

public class MainPrueba {

    public static void main(String[] args) {

        Movimiento[] array1 = {};
        Pokemon pokemon1 = new Pokemon("Hola", "julito", 50, 100, 150, 250, 200, 400, 100, 50, 40, array1,
                TipoEnum.FUEGO, Estado.SIN_ESTADO);

                Pokemon pokemon2 = new Pokemon("Hola", "julito", 50, 100, 150, 250, 200, 400, 100, 50, 40, array1,
                TipoEnum.AGUA, Estado.SIN_ESTADO);

        System.out.println(pokemon1.getAtaque());

        pokemon1.ventajaODesventaja(pokemon1, pokemon2);

       System.out.println(pokemon2.getEstamina());

        pokemon2.descansar();

        System.out.println(pokemon2.getEstamina());

    }
}
