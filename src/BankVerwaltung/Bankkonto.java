package BankVerwaltung;

public abstract class BankKonto {
	private int kontoNummer;
	private double kontoStand;
	private Kunde kunde;

	public BankKonto(Kunde kunde, int kontoNummer) {
		this.kontoNummer = kontoNummer;
		kontoStand = 0.0;
	}

	public void einzahlen(double betrag) {
		kontoStand=kontoStand+betrag;
	}
	
	public double abheben(double betrag) {
		if(kunde instanceof Unternehmenskunde) {
		
			if(kontoStand-betrag>0) {
				kontoStand=kontoStand-betrag + betrag*0.015;
				return kontoStand;
			}else {
				return -1.0;
			}
		}else {
			if(kontoStand-betrag>0) {
			kontoStand=kontoStand-betrag;
			return kontoStand;
		}else {
			return -1.0;
		}
		}
		
	}
	
	public double getKontoStand() {
		return kontoStand;
	}
	
	public int getKonotNummer() {
		return kontoNummer;
	}
	
	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public abstract double aktualisiereKontoStand();
}
