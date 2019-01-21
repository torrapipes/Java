package Estacion;

public class Estacion {

    private int id;
    private String direccion;
    private int numeroAnclajes;
    private int[] anclajes = new int[numeroAnclajes];

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

    public void consultarEstacion() {
        System.out.println("Id: " + getId() + "\nDirección: " + getDireccion() + "\nNúmero de anclajes: " + getNumeroAnclajes());
    }

    public void anclajesLibres() {

        int anclajesLibres = 0;

        for (Integer element : anclajes) {

            if (element != 0){

                anclajesLibres++;

            }
        }

        System.out.println("Anclajes libres: " + anclajesLibres);

    }

    public void consultarAnclajes() {

        int numeroAnclaje = 0;

        for (Integer element : anclajes){

            numeroAnclaje++;

            if (element != null) {

                System.out.println("Anclaje: " + numeroAnclaje  + element);

            }

            else {

                System.out.println("Anclaje: " + numeroAnclaje + "Libre");

            }
        }
    }

    public static void main (String[] args) {
        Estacion manacor = new Estacion(001, "Manacor", 10);
        manacor.consultarAnclajes();
        manacor.anclajesLibres();

        }
}
