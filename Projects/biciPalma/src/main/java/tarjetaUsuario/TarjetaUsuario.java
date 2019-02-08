package tarjetaUsuario;

public class TarjetaUsuario {
	
	private int id = 0;
	private boolean activada = false;
	
	
	public TarjetaUsuario(int identificador, boolean activada) {
		
		this.id = identificador;
		this.activada = activada;
		
	}
	
	
	public int getId() {
		
		return this.id;
		
	}
	
	
	public boolean getEstado() {
		
		return this.activada;
		
	}
	
}
