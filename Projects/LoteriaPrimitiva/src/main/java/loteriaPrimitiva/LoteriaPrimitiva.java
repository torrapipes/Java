package loteriaPrimitiva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Este programa genera 5 combinaciones de la lotería primitiva.
 *
 */

public class LoteriaPrimitiva {
	
	public void generarCombinacion() {
		
		ArrayList<Integer> combinacion = new ArrayList<Integer>();
		
		for (int i = 0; i < 6; i++) {
			
			combinacion.add(ThreadLocalRandom.current().nextInt(49 + 1));
			
		}
		
		Collections.shuffle(combinacion);
		System.out.println(combinacion);
	
	}
	
	
	public void generarComplementario() {
		
		int complementario = ThreadLocalRandom.current().nextInt(49 + 1);
		System.out.println("Complementario: " + complementario);
		
	}
	
	
	public void generarReintegro() {
		
		int reintegro = ThreadLocalRandom.current().nextInt(9);
		System.out.println("Reintegro: " + reintegro);
		
	}
	
	
    public static void main( String[] args ){
    	
    	LoteriaPrimitiva lote = new LoteriaPrimitiva();
    	lote.generarCombinacion();
    	lote.generarComplementario();
    	lote.generarReintegro();
        
    }
}
