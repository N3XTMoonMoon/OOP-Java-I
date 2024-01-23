package bücherei;

public class BibliotheksBuch extends Buch {
	private boolean ausgeliehen=false;

	public BibliotheksBuch(String titel, String autor, String isbn) {
		super(titel, autor, isbn);
	}
	
	public BibliotheksBuch(String titel, String autor, String isbn, boolean ausgeliehen) {
		super(titel, autor, isbn);
		this.ausgeliehen = ausgeliehen;
	}
	
	@Override
	public void ausleihen() {
		if(ausgeliehen) {
			System.out.println("DAS BUCH WURDE BEREITS AUSGELIEHEN!!!");
		}else {
			System.out.println("Das Buch "+this.getTitel()+" wurde ausgeliehen!");
			ausgeliehen=true;
		}
	}
	
	@Override
	public void zurueckgeben() {
		if(ausgeliehen) {
			System.out.println("Das Buch "+this.getTitel()+" wurde zurueckgegeben!");
			ausgeliehen=false;
		}else {
			System.out.println("FEHLER BEIM AUSLEIEHEN!!! NICHT AUSGELIEHENS BUCH KANN NICHT ZURÜCKGEGEBEN WERDEN. lol");
		}
	}
	
	@Override
	public String toString() {
		return    "----------------------------------\n"
				+ "Titel: "+this.getTitel()+" ; Autor: "+this.getAutor()+"\n"
				+ "ISBN: "+this.getIsbn()+" ; Ausgeliehen: "+ausgeliehen+"\n"
				+ "----------------------------------\n";
	}
	
	public boolean isAusgeliehen() {
		return ausgeliehen;
	}

	public void setAusgeliehen(boolean ausgeliehen) {
		this.ausgeliehen = ausgeliehen;
	}
}
