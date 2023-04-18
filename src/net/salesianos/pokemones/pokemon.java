package net.salesianos.pokemones;

public class pokemon {
    private String Nombre;
    private String Tipo;
    private double Altura;
    private double Peso;
    private String Descripcion;


    public pokemon(String Nombre, String Tipo, double Altura, double Peso, String Descripcion){
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Altura = Altura;
        this.Peso = Peso;
        this.Descripcion = Descripcion;
    }

    public pokemon(String Nombre, String Tipo){
        this.Nombre = Nombre;
        this.Tipo = Tipo;
    }
}
