package Flugverwaltung;

import java.util.List;

public class BuchungsAnfrage {

	private Flug flug;
	private List<Passagier> passagier;
	private int anzahlGewuenschterSitze;
	

	public BuchungsAnfrage(Flug flug, List<Passagier> passagier, int anzahlGewuenschterSitze) {
		this.flug = flug;
		this.passagier = passagier;
		this.anzahlGewuenschterSitze = anzahlGewuenschterSitze;
	}

	public Flug getFlug() {
		return flug;
	}

	public void setFlug(Flug flug) {
		this.flug = flug;
	}

	public List<Passagier> getPassagier() {
		return passagier;
	}

	public void setPassagier(List<Passagier> passagier) {
		this.passagier = passagier;
	}

	public int getAnzahlGewuenschterSitze() {
		return anzahlGewuenschterSitze;
	}

	public void setAnzahlGewuenschterSitze(int anzahlGewuenschterSitze) {
		this.anzahlGewuenschterSitze = anzahlGewuenschterSitze;
	}
}
