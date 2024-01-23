package BankVerwaltung;

public class SparKonto extends Bankkonto {

	public SparKonto(int kontoNummer) {
		super(kontoNummer);
	}

	@Override
	public double aktualisiereKonotStand() {
		this.einzahlen(this.getKontoStand()*0.03);
		return this.getKontoStand();
	}

}
