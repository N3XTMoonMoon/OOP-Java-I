package BankVerwaltung;

public abstract class Kunde {
	private int kundennummer;
	private String name;
	
	public Kunde(int kundennummer, String name) {
		this.kundennummer = kundennummer;
		this.name = name;
	}
	
	public int getKundennummer() {
		return kundennummer;
	}
	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
