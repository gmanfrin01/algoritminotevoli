package algoritminotevoli;

import java.util.Random;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.DefaultConfiguration;

public class Esecuzione {
	
	private static final int LIMITE_SUPERIORE_ELEMENTI	= 25;
	private static final int NUMERO_ELEMENTI			= 10;
	private static final Logger logger = LogManager.getLogger(Esecuzione.class.getName());  


	public static void main(String[] args) {
		
		Configurator.initialize(new DefaultConfiguration());
	    Configurator.setRootLevel(Level.DEBUG);
		
		// sezione inizializzazione algoritmi
	    OrdinamentoBase ordinamento;
		//ordinamento = new SimpleSort(randomIntArray());
		//ordinamento = new BubbleSort(randomIntArray());
		ordinamento = new ShellSort(randomIntArray());

		
		
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
