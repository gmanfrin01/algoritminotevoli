package algoritminotevoli;

public class InsertionSort extends OrdinamentoBase {

	public InsertionSort() {
	}

	public InsertionSort(int[] elementiInput) {
		super(elementiInput);
	}

	@Override
	protected void ordina() {
		int elementi[] = this.getElementi();
		int n = elementi.length;
		
		int k, temp;
		
		for (int i=1; i<=n; i++) {
			k = i-1;
			
			while ((k >= 0) && (k < n-1) && (elementi[k] > elementi[k+1])) {
				temp = elementi[k];
				elementi[k] = elementi[k+1];
				elementi[k+1] = temp;
				k--;
			}// end while confronto e scambio
			
			
		}//end for i

	}

	@Override
	public String stampaTitoloOrdinamento() {
		return "INSERTION SORT";
	}

}
