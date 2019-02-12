package carrera;

public class Carrera {
	
	private String tarjetaCredito;
	private int tiempoEsperado;
	private int tiempoCarrera;
	private int costeTotal;
	private String conductor;
	private String origen;
	private String destino;
	private double distancia;
	
	
	public Carrera(int tiempoEsperado, String conductor, String tarjetaCredito, String origen, String destino, double distancia) {
		
		this.tiempoEsperado = tiempoEsperado;
		this.conductor = conductor;
		this.tarjetaCredito = tarjetaCredito;
		this.origen = origen;
		this.destino = destino;
		this.distancia = distancia;
		
	}
	
	
	public String getTarjetaCredito() {
		
		return this.tarjetaCredito;
		
	}
	
	
	public String getOrigen() {
		
		return this.origen;
		
	}
	
	
	public String getDestino() {
		
		return this.destino;
		
	}
	
	
	public double getDistancia() {
		
		return this.distancia;
		
	}
	
	
    public static void main( String[] args ) {

    	
    	
    }
}
