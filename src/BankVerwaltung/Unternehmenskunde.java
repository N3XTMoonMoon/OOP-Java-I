package BankVerwaltung;

public class Unternehmenskunde extends Kunde{

	private String firmenname;
	private String steuernummer;
	
	
	public Unternehmenskunde(int kundennummer, String name, String firmenname, String steuernummer) {
		super(kundennummer, name);
		this.firmenname=firmenname;
		this.steuernummer=steuernummer;
	}
	
	public String getFirmenname() {
		return firmenname;
	}
	public void setFirmenname(String firmenname) {
		this.firmenname = firmenname;
	}
	public String getSteuernummer() {
		return steuernummer;
	}
	public void setSteuernummer(String steuernummer) {
		this.steuernummer = steuernummer;
	}
}
