package einkaufliste;

public class Produkt extends Object {

	private String bezeichnung;
	private double preis;
	private int anzahl;
	
	public Produkt() {
	}
	
	public Produkt(String bezeichnung) {
		this.bezeichnung=bezeichnung;
	}
	
	public Produkt(String bezeichnung, double preis, int anzahl) {
		super();
		this.bezeichnung = bezeichnung;
		this.preis = preis;
		this.anzahl=anzahl;
	}
	
	public void anzahlHinzu() {
		anzahl++;
	}
	
	public void anzahlWeg() {
		anzahl--;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	public int getAnzahl() {
		return anzahl;
	}
	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
	
}
