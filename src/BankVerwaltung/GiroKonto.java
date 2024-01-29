package BankVerwaltung;

public class GiroKonto extends BankKonto{

	public GiroKonto(Kunde kunde, int kontoNummer) {
		super(kunde, kontoNummer);
	}

	@Override
	public double aktualisiereKontoStand() {
		return this.getKontoStand();
	}

	
}
