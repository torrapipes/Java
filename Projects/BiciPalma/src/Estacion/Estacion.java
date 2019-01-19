package Estacion;

public class Estacion {

    private int id;
    String direccion;
    int numeroAnclajes;
    int[] anclajes[numeroAnclajes];

    public Estacion(int id, String direccion, int numeroAnclajes) {

        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;

    }

    public int getId() {
        return this.id;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getNumeroAnclajes() {
        return this.numeroAnclajes;
    }

    public String consultarEstacion() {
        System.out.println("El id de la estación es " + this.id + ", la dirección es " + this.direccion + " y el número de anclajes es " + this.numeroAnclajes);
    }

    public int anclajesLibres() {
        //int result = numeroAnclajes - anclajes.size();

    }
}
