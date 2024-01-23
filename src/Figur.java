
public class Figur {
	private char kurzBezeichnung;
	private String langBezeichnung;
	
	public int wert;
	protected int anzahl=0;
	private int maxAnzahl;
	
	public Figur() {
		
	}

	public Figur(char name) {
		kurzBezeichnung = name;
	}
	
	public Figur(char name, String Bezeichnug) {
		kurzBezeichnung = name;
		langBezeichnung=Bezeichnug;
	}
	
	public Figur(char name, String Bezeichnug, int wert) {
		kurzBezeichnung = name;
		langBezeichnung=Bezeichnug;
		this.wert = wert;
	}
	
	public Figur(char name, String Bezeichnug, int wert, int maxAnzahl) {
		kurzBezeichnung = name;
		langBezeichnung=Bezeichnug;
		this.wert = wert;
		this.maxAnzahl=maxAnzahl;
	}

	public void erhoeheAnzahl() {
		anzahl=anzahl+1;
	}

	public char getKurzBezeichnung() {
		return kurzBezeichnung;
	}

	public void setKurzBezeichnung(char kurzBezeichnung) {
		this.kurzBezeichnung = kurzBezeichnung;
	}

	public String getLangBezeichnung() {
		return langBezeichnung;
	}

	public void setLangBezeichnung(String langBezeichnung) {
		this.langBezeichnung = langBezeichnung;
	}

	public int getWert() {
		return wert;
	}

	public void setWert(int wert) {
		this.wert = wert;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

	public int getMaxAnzahl() {
		return maxAnzahl;
	}

	public void setMaxAnzahl(int maxAnzahl) {
		this.maxAnzahl = maxAnzahl;
	}
	
}
