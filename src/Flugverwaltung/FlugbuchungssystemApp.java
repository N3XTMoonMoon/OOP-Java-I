package Flugverwaltung;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlugbuchungssystemApp {

	FlugBuchungsSystem system;

	public FlugbuchungssystemApp() {
		system = new FlugBuchungsSystem();
		erstelleFlüge();
	}

	private void erstelleFlüge() {

		String[] abflugOrt = { "Hamburg", "Düsseldorf", "Dortmund", "England", "Spanien", "Deutschland", "Norwegen",
				"Schweden", "Russland", "Niederlande" };
		String[] zielOrt = { "Niederlande", "Hamburg", "Dortmund", "Düsseldorf", "Deutschland", "Spanien", "England",
				"Russland", "Schweden", "Norwegen" };
		String abflugDatum = "29.01.2024";
		String ankunftsDatum = "30.01.2024";

		for (int i = 0; i < 10; i++) {
			system.flugHinzufuegen(new Flug(i + 1 * 10, abflugOrt[i], zielOrt[i], abflugDatum, ankunftsDatum,
					(int) (Math.random() * 10) + 5, // Verfügbarkeit
					Math.random() * 100// Preis
			));
		}
	}

	private List<Passagier> erstellePassagierListe() {
		String[] name = { "Richard", "Lea", "Clemens", "Phillip", "Flobirian", "Markus", "Jens", "Maxim", "Wilhelm",
				"Name", "Name2" };

		List<Passagier> passagierList = new ArrayList<Passagier>();
		int wiederholungen = (int) (Math.random() * 10);

		for (int i = 0; i <= wiederholungen; i++) {
			passagierList.add(new Passagier(name[i], (int) Math.random() * 80, "E-Mail@Provider.com",
					(int) Math.random() * 1500000));
		}

		return passagierList;
	}

	public void verarbeiteBuchungen() {
		List<BuchungsAnfrage> anfragen = new ArrayList<BuchungsAnfrage>();
		
		

		for (int i = 0; i < 25; i++) {
			List<Passagier> passagiere = erstellePassagierListe();

			List<Flug> flüge = getVerfügbareFlüge(passagiere.size());
			
			Flug flug = flüge.get((int) (Math.random() * flüge.size()));
			flug.toString();

			anfragen.add(new BuchungsAnfrage(flug, passagiere, passagiere.size()));
		}

		system.buchungenAnfragen(anfragen);
		System.out.println("Alle möglichen Flüge gebuch");
	}
	
	private List<Flug> getVerfügbareFlüge(int anzahl){
		return system.verfFlüge.stream().filter(flug -> isVerfügbar(flug, anzahl)).collect(Collectors.toList());
	}
	
	private boolean isVerfügbar(Flug flug, int anzahl) {
		return flug.getVerfügbarkeit()>anzahl;
	}
}
