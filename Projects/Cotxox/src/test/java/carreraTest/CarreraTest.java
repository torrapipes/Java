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
	
	
	@Test
	public void getDestino() {
		
		int tiempo = 10;
		String conductor = "Mike";
		String tarjeta = "0123K";
		String origen = "Maria";
		String destino = "Manacor";
		double distancia = 40.1;
		
		Carrera carrera = new Carrera(tiempo, conductor, tarjeta, origen, destino, distancia);
		
		assertEquals(destino, carrera.getDestino());
		
	}
	
	
	@Test
	public void getDistancia() {
		
		int tiempo = 10;
		String conductor = "Mike";
		String tarjeta = "0123K";
		String origen = "Maria";
		String destino = "Manacor";
		double distancia = 40.1;
		
		Carrera carrera = new Carrera(tiempo, conductor, tarjeta, origen, destino, distancia);
		
		assertEquals(distancia, carrera.getDistancia(), 0.01);
		
	}
	
	@Test
	public void realizarPagoTest() {
		
		int tiempo = 10;
		String conductor = "Mike";
		String tarjeta = "0123K";
		String origen = "Maria";
		String destino = "Manacor";
		double distancia = 40.1;
		
		Carrera carrera = new Carrera(tiempo, conductor, tarjeta, origen, destino, distancia);
		
		carrera.realizarPago(4);
		
		assertEquals(4, carrera.getPago());
		
	}
	
	@Test
	public void recibirPropina() {
		
		int tiempo = 10;
		String conductor = "Mike";
		String tarjeta = "0123K";
		String origen = "Maria";
		String destino = "Manacor";
		double distancia = 40.1;
		
		Carrera carrera = new Carrera(tiempo, conductor, tarjeta, origen, destino, distancia);
		
		carrera.recibirPropina(5);
		assertEquals(5, carrera.getPropina());
		
	}
	
	
	
	
}