package estacion;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import bicicleta.Bicicleta;
import tarjetaUsuario.TarjetaUsuario;

public class Estacion {
	
	private int id;
	private String direccion;
	private List<Bicicleta> bicicletas = new ArrayList<>();
	
	public Estacion(int id, String direccion, List<Bicicleta> bicicletas) {
		
		this.id = id;
		this.direccion = direccion;
		this.bicicletas = bicicletas;
		
	}
	
	
	public int getId() {
		
		return this.id;
		
	}
	
	public String getDireccion() {
		
		return this.direccion;
		
	}
	
	public void consultarEstacion() {
		
		System.out.println("Id: " + getId() + "\nDirección: " + getDireccion());
		
	}
	
	public void anclajesOcupados(List<Bicicleta> bicicletas) {
		
		if(bicicletas.size() != 0) {
			
			System.out.println("Anclajes ocupados: " + bicicletas.size());
			
		}
		else {
				
			System.out.println("Todos los anclajes estan libres.");
				
		}
	}
	
	
	public void consultarAnclajes(List<Bicicleta> bicicletas) {

			
		int posicion = 1;
			
		for(Bicicleta bicicleta : bicicletas) {
				
			if (bicicletas.size() != 0) {
				System.out.println("Anclaje " + posicion + ": " + bicicleta.getId());
				posicion++;
			}
			else {
				System.out.println("Anclaje " +  posicion + ": Libre");
				posicion++;
			}
		}	
	}
	
	
	public void anclarBicicleta(Bicicleta bicicleta) {
		
		bicicletas.add(bicicleta);
		int anclaje = this.bicicletas.indexOf(bicicleta) + 1;
		mostrarAnclaje(bicicleta, anclaje);
		
	}
	
	
	public void mostrarAnclaje(Bicicleta bicicleta, int anclaje) {
		
		System.out.println("La bicicleta " + bicicleta.getId() + " se ha anclado en el anclaje " + anclaje);
		
	}

	
	public void leerTarjetaUsuario(TarjetaUsuario tarjeta) {
		
		if(tarjeta.getEstado()) {
			
			System.out.println("La tarjeta " + tarjeta.getId() + " está activada.");
			
		}
		else {
			
			System.out.println("La tarjeta " + tarjeta.getId() + " no está activada.");
		}
		
	}
	
	
	public void retirarBicicleta(TarjetaUsuario tarjeta) {
		
		int posicion = generarAnclaje();
		mostrarBicicleta(this.bicicletas.get(posicion),posicion + 1);
		bicicletas.remove(posicion);
		
	}
	
	
	public void mostrarBicicleta(Bicicleta bicicleta, int anclaje) {
		
		System.out.println("La bicicleta " + bicicleta.getId() + " estaba anclada en el anclaje " + anclaje);
		
	}
	
	
	public int generarAnclaje() {
		
		int anclaje = ThreadLocalRandom.current().nextInt(0, this.bicicletas.size());
		return anclaje;
		
	}
	

	public static void main(String[] args) {
		
		
		List<Bicicleta> bicicletas = new ArrayList<>();
		Estacion mundo = new Estacion(007, "Planeta Tierra", bicicletas);
		
		
		Bicicleta bike = new Bicicleta(3);
		Bicicleta fiets = new Bicicleta(2);
		Bicicleta bicicleta = new Bicicleta(1);
		Bicicleta pyora = new Bicicleta(4);
		
		
		TarjetaUsuario tarjeta = new TarjetaUsuario(555, true);
		
		bicicletas.add(fiets);
		mundo.consultarAnclajes(bicicletas);
		mundo.anclarBicicleta(pyora);
		mundo.consultarAnclajes(bicicletas);
		
	
		
	}
	
}
