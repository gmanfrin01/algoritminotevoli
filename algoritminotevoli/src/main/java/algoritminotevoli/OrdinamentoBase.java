package algoritminotevoli;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;

import org.apache.log4j.Logger;

public abstract class OrdinamentoBase {
	
	protected Logger logger = LogManager.getLogger(OrdinamentoBase.class.getName());  
	
	private int[] elementi;

	public OrdinamentoBase() {
		BasicConfigurator.configure();  
	}
	
	
	
	public OrdinamentoBase(int[] elementiInput) {
		BasicConfigurator.configure();  
		elementi = elementiInput;
	}

	protected abstract void ordina();
	
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<elementi.length; i++) {
			sb.append(elementi[i]);
			if (i < elementi.length-1) {}
				sb.append(" - ");
		}		
		return sb.toString();
	}
	
	
	public abstract String stampaTitoloOrdinamento(); 
	
}