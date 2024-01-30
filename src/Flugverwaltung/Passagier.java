package Flugverwaltung;

public class Passagier {

	private String name;
	private int alter;
	private String eMailAdresse;
	private int telefonnummer;
	
	
	public Passagier(String name, int alter, String eMailAdresse, int telefonnummer) {
		this.name = name;
		this.alter = alter;
		this.eMailAdresse = eMailAdresse;
		this.telefonnummer = telefonnummer;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public String geteMailAdresse() {
		return eMailAdresse;
	}
	public void seteMailAdresse(String eMailAdresse) {
		this.eMailAdresse = eMailAdresse;
	}
	public int getTelefonnummer() {
		return telefonnummer;
	}
	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
}
