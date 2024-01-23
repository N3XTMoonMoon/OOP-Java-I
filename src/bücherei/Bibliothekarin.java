package bücherei;

public class Bibliothekarin {
	private String name;
	private int mitarbeiterID;
	private char geschlecht;
	
	public Bibliothekarin(String name, int mitarbeiterID, char geschlecht) {
		this.name = name;
		this.mitarbeiterID = mitarbeiterID;
		this.geschlecht = geschlecht;
	}
	public String getName() {
		return name;
	}
	public int getMitarbeiterID() {
		return mitarbeiterID;
	}
	public char getGeschlecht() {
		return geschlecht;
	}
}
