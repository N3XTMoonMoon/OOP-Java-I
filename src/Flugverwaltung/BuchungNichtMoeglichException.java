package Flugverwaltung;

public class BuchungNichtMoeglichException extends Exception{
	private static final long serialVersionUID = 1L;
	private String message;
	private int flugNummer;

	public BuchungNichtMoeglichException(String message, int flugNummer) {
		this.message=message;
		this.flugNummer=flugNummer;
	}
	public String getMessage() {
		return this.message;
	}
	public int getFlugNummer() {
		return flugNummer;
	}
}
