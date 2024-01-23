import BankVerwaltung.GiroKonto;
import BankVerwaltung.SparKonto;

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
		SparKonto spar=new SparKonto(1);
		
		spar.einzahlen(100.0);
		spar.abheben(25.0);
		
		double kontoStand=spar.getKontoStand();
		double zinsen=spar.aktualisiereKonotStand()-kontoStand;
		
		System.out.println("SPAR:");
		System.out.println("KontoStand: "+kontoStand);
		System.out.println("Zinsen: "+zinsen);
		
		GiroKonto giro = new GiroKonto(2);
		
		giro.einzahlen(100.0);
		giro.abheben(25.0);
		
		kontoStand=giro.getKontoStand();
		zinsen=giro.aktualisiereKonotStand()-kontoStand;
		
		System.out.println("GIRO:");
		System.out.println("KontoStand: "+kontoStand);
		System.out.println("Zinsen: "+zinsen);
	}
	
	
}
