package algoritminotevoli;

public class BubbleSort extends OrdinamentoBase {

	public BubbleSort() {
		super();
	}

	public BubbleSort(int[] elementiInput) {
		super(elementiInput);
	}

	@Override
	protected void ordina() {
		int i, k, temp, n;
		int elementi[] = this.getElementi();
		n = elementi.length;
		
		i = n-1;
		while ( (i > 0)) {
			
			for (k=0; k<i; k++) {
				
				if (elementi[k] > elementi[k+1]) {
					temp = elementi[k];
					elementi[k] = elementi[k+1];
					elementi[k+1] = temp;
				}//end if confronto
			}// end for k
			
			 i = i-1;
		}// end while elementi

	}

	@Override
	public String stampaTitoloOrdinamento() {
		return "BUBBLE SORT";

	}

}
