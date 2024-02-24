package it.polito.tdp;

public class TestRegine {

	public static void main(String[] args) {
		RisolviRegine r = new RisolviRegine();
		r.trovaRegine(4); //scacchiera di 4 regine su 4 righe e 4 colonne)
		//Otteniamo queste due soluzioni, perché le regine 
		//non si mangino a vicenda (i numeri riguardano le colonne:
		// 1, 3, 0, 2   cioè: (riga 0, col 1), (riga 1, col 3), (riga 2, col 0), (riga 3, col 2) 
		// 2, 0, 3, 1   queste sono posizioni simmetriche alla prima soluzione
		//da notare che con 5 tra le parentesi di r.trovaRegine() otteniamo ben altre soluzioni
	}

}
