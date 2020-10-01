package algoritminotevoli;

public class ShellSort extends OrdinamentoBase {

	public ShellSort() {
	}

	public ShellSort(int[] elementiInput) {
		super(elementiInput);
	}

	@Override
	protected void ordina() {
		int dist=0, i=0, j=0, currentElem=0, currentIdx=0, precIdx=0, n;
		int elementi[] = this.getElementi();
		n = elementi.length;
		dist = n;
		
		while (dist > 1) {
			dist = dist/2;
			
			for (i=0; i<dist; i++ ) {
				j = i + dist;
				while (j < n) {
					currentElem = elementi[j];
					currentIdx  = j; 
					precIdx = currentIdx - dist;
					
					while ( ( precIdx >= i) && (currentElem < elementi[precIdx])){
						
						elementi[currentIdx] = elementi[precIdx];
						currentIdx = precIdx;
						precIdx = precIdx - dist;
						
					} // end while test
					
					elementi[currentIdx] = currentElem;
					j = j+dist;
				} // end while j
				
			}// end for i
			
			
			
		} // end while dist

	}

	@Override
	public String stampaTitoloOrdinamento() {
		return "SHELL SORT";
	}

}
