package BankVerwaltung;

public class GiroKonto extends Bankkonto{

	public GiroKonto(int kontoNummer) {
		super(kontoNummer);
	}

	@Override
	public double aktualisiereKonotStand() {
		return this.getKontoStand();
	}

	
}
