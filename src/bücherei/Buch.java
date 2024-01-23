package bücherei;

public class Buch {
	private String titel;
	private String autor;
	private String isbn;

	public Buch(String titel, String autor, String isbn) {
		this.titel = titel;
		this.autor = autor;
		this.isbn = isbn;
	}

	public void ausleihen() {
		System.out.println("Das Buch wurde ausgeliehen!");
	}
	
	public void zurueckgeben() {
		System.out.println("Das Buch wurde zurueckgegeben!");
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
