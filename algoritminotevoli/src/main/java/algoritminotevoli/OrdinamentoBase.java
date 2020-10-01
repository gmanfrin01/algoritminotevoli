package algoritminotevoli;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class OrdinamentoBase {
	
	protected Logger logger = LogManager.getLogger(OrdinamentoBase.class.getName());  
	
	private int[] elementi;

	public int[] getElementi() {
		return elementi;
	}



	public void setElementi(int[] elementi) {
		this.elementi = elementi;
	}



	public OrdinamentoBase() {
	}
	
	
	
	public OrdinamentoBase(int[] elementiInput) {
		elementi = elementiInput;
	}

	protected abstract void ordina();
	
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<elementi.length; i++) {
			sb.append(elementi[i]);
			if (i < elementi.length-1) {
				sb.append(" - ");
			}
		}		
		return sb.toString();
	}
	
	
	public abstract String stampaTitoloOrdinamento(); 
	
	
}
