package net.salesianos.pokemones.lista;
import net.salesianos.pokemones.Pokemon;
import java.util.Arrays;

public class ListaInteligente {
    private Pokemon[] lista;
    private int cantidad;

public ListaInteligente() {
    lista = new Pokemon[1];
    cantidad = 0;
}

public void agregarPokemon(Pokemon p) {
    if(cantidad == lista.length) {
        lista = Arrays.copyOf(lista, lista.length * 2);
    }
    lista[cantidad] = p;
    cantidad++;
    System.out.println("Pokemon agregado correctamente gracias por nada bobo.");
}



}
