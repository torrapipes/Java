package carreraTest;

import carrera.Carrera;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CarreraTest {
	
	@Test
	public void getTarjetaCreditoTest() {
		
		int tiempo = 10;
		String conductor = "Mike";
		String tarjeta = "0123K";
		String origen = "Maria";
		String destino = "Manacor";
		double distancia = 40.1;
		
		Carrera carrera = new Carrera(tiempo, conductor, tarjeta, origen, destino, distancia);

		assertEquals(tarjeta,carrera.getTarjetaCredito()); 
		
	}
	
	@Test
	public void getOrigen() {
		
		int tiempo = 10;
		String conductor = "Mike";
		String tarjeta = "0123K";
		String origen = "Maria";
		String destino = "Manacor";
		double distancia = 40.1;
		
		Carrera carrera = new Carrera(tiempo, conductor, tarjeta, origen, destino, distancia);
		
		assertEquals(origen, carrera.getOrigen());

	}
	
	
}