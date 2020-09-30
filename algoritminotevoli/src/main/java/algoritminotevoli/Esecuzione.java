package algoritminotevoli;

import java.util.Random;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Esecuzione {
	
	private static final int LIMITE_SUPERIORE_ELEMENTI	= 25;
	private static final int NUMERO_ELEMENTI			= 10;
	private static final Logger logger = LogManager.getLogger(Esecuzione.class.getName());  


	public static void main(String[] args) {
		// sezione inizializzazione algoritmi
		OrdinamentoBase ordinamento = new SimpleSort(randomIntArray());
		
		
		
		// esecuzione
		logger.debug("Test Algoritmi di Ordinamento : " + ordinamento.stampaTitoloOrdinamento());
		
		logger.debug("Array di partenza : " + ordinamento.toString());
		
		ordinamento.ordina();
		
		logger.debug("Array di fine : " + ordinamento.toString());
				

	}
	
	
	private static int[] randomIntArray() {
		int [] risultato = new int[NUMERO_ELEMENTI];
		
		Random rand = new Random(); 
		for (int i=0; i< risultato.length; i++) {			
			risultato[i] = rand.nextInt(LIMITE_SUPERIORE_ELEMENTI);
		}			
		return risultato;
	}
	

}
