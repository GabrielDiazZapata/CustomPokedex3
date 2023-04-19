package net.salesianos.lista;
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

public void eliminarPokemon(String Nombre) {
    for (int i = 0; i < cantidad; i++) {
        if(lista[i].getNombre().equals(Nombre)) {
            for(int j = i; j < cantidad - 1; j++) {
                lista[j] = lista[j + 1];
            }
            cantidad--;
            lista[cantidad] = null;
            System.out.println("Pokemon eliminado correctamente ahora creame otro soplagaitas, y mas te vale que sea bueno.");
            return;
        }
    }
    System.out.println("No se encontró el Pokemon en la lista, aprende a escribir.");

}

public void mostrarPokemon() {
    System.out.println("Lista de Pokemons:");
    for (int i = 0; i < cantidad; i++) {
        System.out.println((i+1) + ". " + lista[i].toString());
    }
}

public Pokemon getPokemon(int posicion) {
    if (posicion < 0 || posicion >= cantidad) {
        return null;
    }
    return lista[posicion];
    }


}
