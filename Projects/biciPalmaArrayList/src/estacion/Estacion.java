package estacion;

import java.util.ArrayList;
import java.util.List;

import bicicleta.Bicicleta;

public class Estacion {
	
	private int id;
	private String direccion;
	private List<Bicicleta> bicicletas = new ArrayList<>();
	
	public Estacion(int id, String direccion) {
		
		this.id = id;
		this.direccion = direccion;
		
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
		
		this.bicicletas.add(bicicleta);
		int anclaje = this.bicicletas.indexOf(bicicleta) + 1;
		mostrarAnclaje(bicicleta, anclaje);
		
	}
	
	
	public void mostrarAnclaje(Bicicleta bicicleta, int anclaje) {
		
		System.out.println("La bicicleta " + bicicleta.getId() + " se ha anclado en el anclaje " + anclaje);
		
	}

	
	public static void main(String[] args) {
		
		Estacion mundo = new Estacion(003, "Planeta Tierra");
		
		List<Bicicleta> bicicletas = new ArrayList<>();
		
		Bicicleta bike = new Bicicleta(3);
		Bicicleta fiets = new Bicicleta(2);
		Bicicleta bicicleta = new Bicicleta(1);
		Bicicleta pyora = new Bicicleta(4);
		
		bicicletas.add(bike);
		bicicletas.add(fiets);
		bicicletas.add(bicicleta);
		
		mundo.consultarEstacion();
		mundo.anclajesOcupados(bicicletas);
		mundo.consultarAnclajes(bicicletas);
		mundo.anclarBicicleta(pyora);
		
		
	}
	
}
