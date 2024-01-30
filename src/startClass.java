import java.util.List;

import BankVerwaltung.Bank;
import BankVerwaltung.BankKonto;
import BankVerwaltung.GiroKonto;
import BankVerwaltung.Kunde;
import BankVerwaltung.PrivatKunde;
import BankVerwaltung.SparKonto;
import BankVerwaltung.Unternehmenskunde;
import bücherei.Bibliothek;
import bücherei.BibliotheksBuch;

public class startClass {
	public static void main(String args[]) {
//		SleepingGuide guide = new SleepingGuide();
//		
//		guide.startGuide();
		
//		TemperaturConverter converter = new TemperaturConverter();
//		
//		converter.convert(10, 'F');
//		converter.convert(20, 'C');
		
//		GuessingGame game = new GuessingGame();
//		game.game();
		
//		Chess chess = new Chess();
//		chess.game();
		
//		Einkauf einkauf = new Einkauf();
//		einkauf.einkauf();
		
		//----------------------------------------------------------
//		Bibliothek bib = new Bibliothek("Adresse 1", "BIBBI liothek");
//		
//		bib.addMitarbeiter(1, "Tina", 'F');
//		bib.addBibliotheksBuch("titel1","autor","1");
//		
//		List<BibliotheksBuch> bücherListe = bib.getBücher();
//		
//		for(BibliotheksBuch buch:bücherListe) {
//			buch.ausleihen();
//			buch.zurueckgeben();
//			buch.toString();
//		}
//		
//		Bibliothek bib2 = new Bibliothek("Adresse 2", "Buubliothek");
//		
//		bib2.addBibliotheksBuch("titel2","autor","1");
//		bib2.addMitarbeiter(1, "Bina", 'F');
//		
//		bücherListe = bib2.getBücher();
//		
//		for(BibliotheksBuch buch:bücherListe) {
//			buch.ausleihen();
//			buch.zurueckgeben();
//			buch.ausleihen();
//			buch.ausleihen();
//			buch.toString();
//		}
		//----------------------------------------------------------
		
		Bank bank = new Bank();
		
		
		
		Unternehmenskunde unternehmen = new  Unternehmenskunde(5, "Untern", "Firma", "0101");
		
		PrivatKunde privat = new PrivatKunde(6, "Privat", "09.09.1999");
		
//		SparKonto spar=new SparKonto(unternehmen, 1);
		SparKonto spar = (SparKonto) bank.erzeugeKonto(unternehmen, "Sparkonto");
		
		
		spar.einzahlen(100.0);
		spar.abheben(25.0);
		
		double kontoStand=spar.getKontoStand();
		double zinsen=spar.aktualisiereKontoStand()-kontoStand;
		
		System.out.println("SPAR:");
		System.out.println("KontoStand: "+kontoStand);
		System.out.println("Zinsen: "+zinsen);
		
		GiroKonto giro = new GiroKonto(privat,2);
		
		giro.einzahlen(100.0);
		giro.abheben(25.0);
		
		kontoStand=giro.getKontoStand();
		zinsen=giro.aktualisiereKontoStand()-kontoStand;
		
		System.out.println("GIRO:");
		System.out.println("KontoStand: "+kontoStand);
		System.out.println("Zinsen: "+zinsen);
	}
}
