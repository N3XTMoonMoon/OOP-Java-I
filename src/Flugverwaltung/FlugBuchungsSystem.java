package Flugverwaltung;

import java.util.ArrayList;
import java.util.List;

public class FlugBuchungsSystem {

	List<Flug> verfFlüge;
	List<BuchungsAnfrage> buchungsAnfragen;
	
	public FlugBuchungsSystem() {
		verfFlüge = new ArrayList<Flug>();
		buchungsAnfragen = new ArrayList<BuchungsAnfrage>();
	}
	
	//Flug zu verfügbaren Flügen hinzufügen
	public void flugHinzufuegen(Flug flug) {
		verfFlüge.add(flug);
	}
	
	public void buchungenAnfragen(List<BuchungsAnfrage> buchungsAnfragen){
		BuchungsAnfrage anfrage;
		
		for(int i=0;i<buchungsAnfragen.size();i++) {
			anfrage = buchungsAnfragen.get(i);
			
			try {
				
				anfrageHinzufügen(anfrage);
				
			}catch(BuchungNichtMoeglichException e) {
				System.out.println(e.getFlugNummer());
				e.printStackTrace();
			}
		}
	}
	
	private void anfrageHinzufügen(BuchungsAnfrage anfrage) throws BuchungNichtMoeglichException {
		
		if(verfFlüge.contains(anfrage.getFlug())){
				
				Flug ausgewaehlterFlug = anfrage.getFlug();
				
				if(ausgewaehlterFlug.getVerfügbarkeit()>=anfrage.getAnzahlGewuenschterSitze()) {
					//Klasse poascht!!!!
					Flug flug = verfFlüge.get(verfFlüge.indexOf(anfrage.getFlug()));
					flug.setVerfügbarkeit(ausgewaehlterFlug.getVerfügbarkeit()-anfrage.getAnzahlGewuenschterSitze());
				}else {
					throw new BuchungNichtMoeglichException("FEHLER: Es sind nicht ausreichend Sitzplätze verfügbar", anfrage.getFlug().getFlugNummer());
				}
				
			}else {
				throw new BuchungNichtMoeglichException("Flug wurde nicht gefunden",anfrage.getFlug().getFlugNummer());
			}
	}
}
