package BankVerwaltung;

public abstract class Bankkonto {
	private int kontoNummer;
	private double kontoStand;

	public Bankkonto(int kontoNummer) {
		this.kontoNummer = kontoNummer;
		kontoStand = 0.0;
	}

	public void einzahlen(double betrag) {
		kontoStand=kontoStand+betrag;
	}
	
	public double abheben(double betrag) {
		if(kontoStand-betrag>0) {
			kontoStand=kontoStand-betrag;
			return kontoStand;
		}else {
			return -1.0;
		}
	}
	
	public double getKontoStand() {
		return kontoStand;
	}
	
	public int getKonotNummer() {
		return kontoNummer;
	}
	
	public abstract double aktualisiereKonotStand();
}
