package BankVerwaltung;

public class SparKonto extends BankKonto {

	public SparKonto(Kunde kunde, int kontoNummer) {
		super(kunde, kontoNummer);
	}

	@Override
	public double aktualisiereKontoStand() {
		if (this.getKunde() instanceof Unternehmenskunde) {
			this.einzahlen(this.getKontoStand() * 0.05);
			return this.getKontoStand();
			
		} else if (this.getKunde() instanceof PrivatKunde) {
			this.einzahlen(this.getKontoStand() * 0.03);
			return this.getKontoStand();
			
		} else {
			return this.getKontoStand();
		}

	}
}