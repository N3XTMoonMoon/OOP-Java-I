package BankVerwaltung;

import java.util.ArrayList;
import java.util.List;

public class Bank {
private List<BankKonto> kontoListe;
private int kontoNr;

public Bank() {
	kontoListe = new ArrayList<BankKonto>();
}

public BankKonto erzeugeKonto(Kunde kunde, String typ){
	
	if(kontoListe.isEmpty()) {
		kontoNr=1;
	}
	
	switch(typ) {
		case("Giro"):
			return new GiroKonto(kunde,kontoNr);
		case("Sparkonto"):
			return new SparKonto(kunde,kontoNr);
		default:
			return new GiroKonto(kunde,kontoNr);
	}
}
}
