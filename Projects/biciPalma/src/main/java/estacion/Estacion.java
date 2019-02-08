package estacion;

import java.util.concurrent.ThreadLocalRandom;
import bicicleta.Bicicleta;
import tarjetaUsuario.TarjetaUsuario;

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

        for (Bicicleta element : this.bicicletas){

            numeroAnclaje++;

            if (element != null) {

                System.out.println("Anclaje " + numeroAnclaje + ": "  + element.getId());

            }

            else {

                System.out.println("Anclaje " + numeroAnclaje + ": Libre");

            }
        }
    }
    
    
    public void anclarBicicleta(Bicicleta bicicleta) {

	  	int posicion = 0;
	  	
        for (Bicicleta element : this.bicicletas) {

            if (element == null) {

                this.bicicletas[posicion] = bicicleta;
                mostrarAnclaje(bicicleta, posicion + 1);
                break;
            }
            else {
            	posicion ++;
            }
        }
    }
  
  
    public void leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {
	  
	    if (tarjetaUsuario.getEstado() == true) {
		  
		    System.out.println("La tarjeta está activada");
		  
	    }
	    else {
		  
		    System.out.println("La tarjeta no está activada");
		  
	    }
	  
	  
     }
  
  
    public void mostrarAnclaje(Bicicleta bicicleta, int anclaje) {
	    System.out.println("La bicicleta " + bicicleta.getId() + " ha sido anclada en el anclaje " + anclaje);
    }
    
    
    public void mostrarAnclajeRetirada(Bicicleta bicicleta, int anclaje) {
	    System.out.println("La bicicleta " + bicicleta.getId() + " ha sido retirada del anclaje " + anclaje);
    }
  
  
    public void retirarBicicleta(TarjetaUsuario tarjeta) {
	  
    	boolean biciSacada = false;
    		
	    while(!biciSacada) {
		  
		    int posicion = generarAnclaje();
		  
		    if (this.bicicletas[posicion] != null) {
				  
				    mostrarAnclajeRetirada(this.bicicletas[posicion], posicion + 1);
				    this.bicicletas[posicion] = null;
				    biciSacada = true;
				  
			    }
		    
		    else;
		  
	    }
    }
  
  
    public int generarAnclaje() {
    	
    	return ThreadLocalRandom.current().nextInt(0, this.bicicletas.length);

    }

    
    public static void main (String[] args) {

        Estacion calleManacor = new Estacion(001, "Calle Manacor", 5);
        Bicicleta bicicleta = new Bicicleta(007);
        TarjetaUsuario tarjeta = new TarjetaUsuario(000000001, true);
        
        calleManacor.consultarEstacion();
        calleManacor.anclajesLibres();
        calleManacor.anclarBicicleta(bicicleta);
        calleManacor.consultarAnclajes();
        calleManacor.retirarBicicleta(tarjeta);
        calleManacor.consultarAnclajes();
    
        }
}


