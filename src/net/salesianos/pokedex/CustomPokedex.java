package net.salesianos.pokedex;
import net.salesianos.pokemones.Pokemon;
import net.salesianos.pokemones.PokemonLegendario;
import java.util.ArrayList;
import java.util.Scanner;
public class CustomPokedex {
    public static void main(String[] args) throws Exception {
        System.out.println("¡Bienvenido a CustomPokedex!");

        ArrayList<Pokemon> avistados = new ArrayList<Pokemon>();
        ArrayList<Pokemon> capturados = new ArrayList<Pokemon>();

        Scanner teclado = new Scanner(System.in);
        String opcion = "";

        while (!opcion.equals("f")) {
            System.out.println("\nMenu de interaccion:");
            System.out.println("a) Añadir un pokemon avistado");
            System.out.println("b) Añadir avistamiento legendario");
            System.out.println("c) Pasar a capturados");
            System.out.println("d) Mostrar lista de avistados");
            System.out.println("e) Mostrar lista de caputrados");
            System.out.println("f) Cerrar la Pokédex");
            System.out.println("Selecciona una opción");
            opcion = teclado.nextLine();



            switch (opcion) {
                case "a":
                System.out.print("Nombre del pokemon: ");
                String nombre = teclado.nextLine();
                System.out.print("Tipo del pokemon: ");
                String tipo = teclado.nextLine();
                Pokemon avistado = new Pokemon(nombre, tipo);
                avistados.add(avistado);
                System.out.println("¡Pokemon avistado añadido a la lista!");
                break;

                case "b":
                System.out.print("Nombre del pokemon legendario: ");
                String nombreLegendario = teclado.nextLine();
                System.out.print("Tipo del pokemon legendario: ");
                String tipoLegendario = teclado.nextLine();
                System.out.print("Localización del pokemon legendario: ");
                String localizacionLegendario = teclado.nextLine();
                PokemonLegendario legendario = new PokemonLegendario(nombreLegendario, tipoLegendario);
                legendario.setLocalizacion(localizacionLegendario);
                avistados.add((Pokemon) legendario);
                System.out.println("¡Avistamiento legendario añadido a la lista!");
                break;


                case "c":
                    if (avistados.size() > 0) {
                        System.out.println("Lista de Pokémon avistados:");
                        for (int i = 0; i < avistados.size(); i++) {
                            System.out.println((i + 1) + ") " + avistados.get(i));
                        }
                        System.out.print("Ingrese el número del Pokémon que desea capturar: ");
                        int numPokemon = Integer.parseInt(teclado.nextLine());
                        if (numPokemon > 0 && numPokemon <= avistados.size()) {
                            Pokemon pokemonCapturado = avistados.remove(numPokemon - 1);
                            capturados.add(pokemonCapturado);
                            System.out.println("¡Has capturado a " + pokemonCapturado.getNombre() + "!");
                        } else {
                            System.out.println("Número inválido de Pokémon.");
                        }
                    } else {
                        System.out.println("No hay Pokémon avistados.");
                    }
                    break;


                case "d":
                    System.out.println("\nLista de pokemones avistados:");
                    for (Pokemon pokemon : avistados) {
                        System.out.println("- " + pokemon.getNombre() + " (" + pokemon.getTipo() + ")");
                        if (pokemon instanceof PokemonLegendario) {
                            System.out.println("  Localización: " + ((PokemonLegendario) pokemon).getLocalizacion());
                        }       
                    }   
                    break;


                    case "e":
                        System.out.println("\nLista de pokemones capturados:");
                        for (Pokemon pokemon : capturados) {
                            System.out.println("- " + pokemon.getNombre() + " (" + pokemon.getTipo() + ")");
                            if (pokemon instanceof PokemonLegendario) {
                                System.out.println("  Localización: " + ((PokemonLegendario) pokemon).getLocalizacion());
                            }
                        }
                        break;

            }
        }
    }
}
