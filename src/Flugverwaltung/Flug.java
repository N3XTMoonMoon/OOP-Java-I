package Flugverwaltung;

public class Flug {

	private int flugNummer;
	private String abflugOrt;
	private String zielOrt;
	private String AbflugDatum;
	private String Ankunftsdatum;
	private int verfügbarkeit;
	private double preis;
	
	
	public Flug(int flugNummer, String abflugort, String zielort, String abflugDatum, String ankunftsdatum,
			int verfügbarkeit, double preis) {
		this.flugNummer = flugNummer;
		this.abflugOrt = abflugort;
		this.zielOrt = zielort;
		AbflugDatum = abflugDatum;
		Ankunftsdatum = ankunftsdatum;
		this.verfügbarkeit = verfügbarkeit;
		this.preis = preis;
	}
	
	
	public int getFlugNummer() {
		return flugNummer;
	}
	public void setFlugNummer(int flugNummer) {
		this.flugNummer = flugNummer;
	}
	public String getAbflugOrt() {
		return abflugOrt;
	}
	public void setAbflugOrt(String abflugOrt) {
		this.abflugOrt = abflugOrt;
	}
	public String getZielort() {
		return zielOrt;
	}
	public void setZielOrt(String zielort) {
		this.zielOrt = zielort;
	}
	public String getAbflugDatum() {
		return AbflugDatum;
	}
	public void setAbflugDatum(String abflugDatum) {
		AbflugDatum = abflugDatum;
	}
	public String getAnkunftsdatum() {
		return Ankunftsdatum;
	}
	public void setAnkunftsdatum(String ankunftsdatum) {
		Ankunftsdatum = ankunftsdatum;
	}
	public int getVerfügbarkeit() {
		return verfügbarkeit;
	}
	public void setVerfügbarkeit(int verfügbarkeit) {
		this.verfügbarkeit = verfügbarkeit;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	@Override
	public String toString() {
		
		return "flugNummer:"+flugNummer+"abflugort:"+abflugOrt;
	}
}




























