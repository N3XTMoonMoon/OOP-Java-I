package BankVerwaltung;

public class PrivatKunde extends Kunde{
	
	private String geburtstag;
	
	public PrivatKunde(int kundennummer, String name, String geburtstag) {
		super(kundennummer, name);
		this.geburtstag = geburtstag;
	}

	public String getGeburtstag() {
		return geburtstag;
	}

	public void setGeburtstag(String geburtstag) {
		this.geburtstag = geburtstag;
	}
}
