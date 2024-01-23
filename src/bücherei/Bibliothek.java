package bücherei;

import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
private String anschrift;
private String name;
private List<BibliotheksBuch> bücher;
private List<Bibliothekarin> mitarbeiter;


public Bibliothek(String anschrift, String name) {
	this.anschrift = anschrift;
	this.name = name;
	mitarbeiter = new ArrayList<Bibliothekarin>();
	bücher=new ArrayList<BibliotheksBuch>();
}

public void addMitarbeiter(int mitarbeiterId, String name, char geschlecht) {
	mitarbeiter.add(new Bibliothekarin(name, mitarbeiterId, geschlecht));
}

public void buchAusleihen(String isbn) {
	
}

public void addBibliotheksBuch(String titel, String autor, String isbn) {
	bücher.add(new BibliotheksBuch(titel, autor, isbn));
}

public List<BibliotheksBuch> getBücher() {
	return bücher;
}

public String getAnschrift() {
	return anschrift;
}
public void setAnschrift(String anschrift) {
	this.anschrift = anschrift;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Bibliothekarin> getMitarbeiter() {
	return mitarbeiter;
}
public void setMitarbeiter(List<Bibliothekarin> mitarbeiter) {
	this.mitarbeiter = mitarbeiter;
}
}
