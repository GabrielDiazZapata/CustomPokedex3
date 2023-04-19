README:
CustomPokedex.

CustomPokedex es una aplicación Java que permite a los usuarios llevar un registro personalizado de los Pokémon que han avistado y capturado. La aplicación utiliza las clases Pokemon y PokemonLegendario para almacenar la información de cada Pokémon.
Cómo funciona

La aplicación muestra un menú de opciones que permite al usuario realizar las siguientes acciones:

Añadir un Pokémon avistado
Añadir un avistamiento legendario
Pasar Pokémon de la lista de avistados a la lista de capturados
Mostrar lista de Pokémon avistados
Mostrar lista de Pokémon capturados
Cerrar la Pokédex

Cuando el usuario añade un Pokémon avistado, debe introducir el nombre y el tipo del Pokémon. Cuando añade un avistamiento legendario, debe introducir también la localización del Pokémon. Ambos tipos de Pokémon se almacenan en una lista de avistados.

Cuando el usuario decide capturar un Pokémon de la lista de avistados, este Pokémon se mueve a la lista de capturados.

Las listas de Pokémon avistados y capturados se pueden mostrar en cualquier momento. La lista de capturados solo muestra los Pokémon que el usuario ha capturado, mientras que la lista de avistados muestra todos los Pokémon que el usuario ha avistado, incluyendo los que aún no ha capturado.

¡Clase Pokemon!

La clase Pokemon es una clase básica que representa un Pokemon. Cada instancia de la clase tiene un nombre, un tipo, una altura, un peso y una descripción.
Atributos

nombre - String que representa el nombre del Pokemon.
tipo - String que representa el tipo del Pokemon.
altura - Double que representa la altura del Pokemon.
peso - Double que representa el peso del Pokemon.
descripcion - String que representa la descripción del Pokemon.

Constructores

Pokemon(String nombre, String tipo) - Crea una nueva instancia de Pokemon con el nombre y el tipo especificados. La altura, el peso y la descripción se establecen en valores predeterminados.
Pokemon(String nombre, String tipo, double altura, double peso, String descripcion) - Crea una nueva instancia de Pokemon con el nombre, el tipo, la altura, el peso y la descripción especificados.

Métodos

getNombre() - Devuelve el nombre del Pokemon.
setNombre(String nombre) - Establece el nombre del Pokemon.
getTipo() - Devuelve el tipo del Pokemon.
setTipo(String tipo) - Establece el tipo del Pokemon.
getAltura() - Devuelve la altura del Pokemon.
setAltura(double altura) - Establece la altura del Pokemon.
getPeso() - Devuelve el peso del Pokemon.
setPeso(double peso) - Establece el peso del Pokemon.
getDescripcion() - Devuelve la descripción del Pokemon.
setDescripcion(String descripcion) - Establece la descripción del Pokemon.
toString() - Devuelve una representación en cadena del Pokemon.



Ejemplo de como se usa para los bobos:
// Crear un Pokemon
Pokemon pikachu = new Pokemon("Pikachu", "Eléctrico", 0.4, 6.0, "Un Pokemon adorable con mejillas chispeantes.");

// Obtener el nombre del Pokemon
String nombre = pikachu.getNombre(); // "Pikachu"

// Establecer la altura del Pokemon
pikachu.setAltura(0.5);

// Obtener una representación en cadena del Pokemon
String info = pikachu.toString(); // "Nombre: Pikachu\nTipo: Eléctrico\nAltura: 0.5\nPeso: 6.0\nDescripción: Un Pokemon adorable con mejillas chispeantes."

¡Clase PokemonLegendario!

La clase PokemonLegendario es una subclase de la clase Pokemon, que hereda todas sus propiedades y métodos. Además, agrega una propiedad adicional llamada localizacion, que representa la ubicación donde se puede encontrar un pokemon legendario.

!Clase ListaInteligente¡

La ListaInteligente es una clase que implementa una lista enlazada simple con algunas funcionalidades adicionales, como la posibilidad de agregar elementos únicos, agregar elementos al final de la lista y eliminar elementos por índice o por valor. También se puede obtener la longitud de la lista y verificar si está vacía. Esta clase es muy útil para manejar colecciones de objetos y realizar operaciones básicas sobre ellas de manera eficiente

