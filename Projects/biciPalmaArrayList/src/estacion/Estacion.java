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
	
	
}
