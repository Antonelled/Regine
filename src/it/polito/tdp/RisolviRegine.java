package it.polito.tdp;
//Esempio di ricorsione con Regine di una scacchiera tali che non si mangino a vicenda
// https://www.youtube.com/watch?v=FtwP96CJxpU&list=PLqRTLlwsxDL9ClNsiXVXH3vpgcpBSWK7U&index=16
//vedi anche la mia annotazione sul Q. 193, p. 5  6
import java.util.ArrayList;
import java.util.List;

public class RisolviRegine {
	
	public void trovaRegine(int N) {
		List<Integer> parziale = new ArrayList<Integer>();
		cercaRegine(N, parziale, 0);
	}
	
	/*posiziona una regina alla riga 'riga' compatibilmente con quelle
	 * già presenti nelle righe precedenti ('parziale') 
	 */
	private void cercaRegine(int N, List<Integer> parziale, int riga) {
		if(riga==N) {
			System.out.println(parziale);
			return;
		}
		//genera le soluzioni possibili per questa riga
		for(int col=0;col<N;col++) {
			if(reginaCompatibile(parziale, riga, col)) {
    // aggiungi la regina alla colonna 'col' nella
	// soluzione parziale			
				
				parziale.add(col);
				cercaRegine(N, parziale, riga+1);
				parziale.remove(parziale.size()-1);
			}
		}
	}
	
	//mettere la regina nella colonna 'col' è compatibile con le regine ?
	private boolean reginaCompatibile(List<Integer> parziale, int riga, int col) {
		
		for(int rigaR=0;rigaR < parziale.size();rigaR++) { // rigaR = rigaRegina
			int colR = parziale.get(rigaR);
			
			//Il mangiare per righe delle regine
			if(rigaR == riga)
				return false;
			
			//Il mangiare per colonne delle regine
			if(colR ==col)
				return false;
			
			//Il mangiare per diagonali delle regine
			if(rigaR-colR == riga-col)
				return false;
			if(rigaR+colR == riga+col)
				return false;
			
		}
		return true;  
	}
}
