package tarjetaUsuario;

public class TarjetaUsuario {
	
	private int id;
	private boolean estado;
	
	public TarjetaUsuario(int id, boolean estado) {
		
		this.id = id;
		this.estado = estado;
		
	}
	
	
	public int getId() {
		
		return this.id;
		
	}
	
	
	public boolean getEstado() {
		
		return this.estado;
		
	}
}
