package algoritminotevoli;

public class SimpleSort extends OrdinamentoBase {

	public SimpleSort() {
	}

	public SimpleSort(int[] elementiInput) {
		super(elementiInput);
	}

	@Override
	protected void ordina() {
		int temp = 0;
		int elementi[] = this.getElementi();
		
		for (int i=0; i<elementi.length-1; i++) {
			
			for (int j=i+1; j<elementi.length; j++) {
				
				if (elementi[i] > elementi[j]) {
					temp = elementi[i];
					elementi[i] = elementi[j];
					elementi[j] = temp;
				}
				
			}
			
		}
	}

	@Override
	public String stampaTitoloOrdinamento() {		
		return "SIMPLE SORT";
	}

}
