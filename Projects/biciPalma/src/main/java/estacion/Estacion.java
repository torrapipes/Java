package estacion;

import java.util.Arrays;

import bicicleta.Bicicleta;

public class Estacion {

    private int id;
    private String direccion;
    private int numeroAnclajes;
    private Bicicleta[] bicicletas;
    
   

    public Estacion(int id, String direccion, int numeroAnclajes) {

        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        this.bicicletas = new Bicicleta[numeroAnclajes];

    }

    // getters
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

    // functions
    public void anclajesLibres() {

        int anclajesLibres = 0;

        for (Bicicleta element : bicicletas) {

            if (element == null){

                anclajesLibres++;

            }
        }

        System.out.println("Anclajes libres: " + anclajesLibres);

    }

    
    public void consultarAnclajes() {

        int numeroAnclaje = 0;

        for (Bicicleta element : bicicletas){

            numeroAnclaje++;

            if (element != null) {

                System.out.println("Anclaje " + numeroAnclaje + ": "  + element);

            }

            else {

                System.out.println("Anclaje " + numeroAnclaje + ": Libre");

            }
        }
    }
    
    

  /*
   *  public void anclarBicicleta(Bicicleta) {

        for (element : anclajes) {

            if (element == 0) {

                element = bicleta.id;
                break;
            }
        }
    } */

    
    public static void main (String[] args) {

        Estacion manacor = new Estacion(001, "Manacor", 10);
        

        manacor.consultarEstacion();
        manacor.anclajesLibres();
        manacor.consultarAnclajes();
        
        }
}

