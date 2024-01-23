
public class Chess {
	
	Figur[] figurenListe = {new Figur('B', "Bauer",1,8),
							new Figur('T', "Turm",5,2),
							new Figur('S', "Springer",3,2),
							new Figur('L', "Läufer",3,2),
							new Figur('D', "Dame",9,1),
							new Figur('K', "König",0,1)};
	
	Figur[][] feld;

	public void game() {
		feld = new Figur[8][8];
		
		initialisiereFeld();
		
		setzeSpielfiguren();
		
		showSpielfeld();
	}
	
	public void showSpielfeld() {
		
		if(feld==null) {
			System.out.println("FELD NICHT INITIALISIERT");
		}{
			for(int i=0;i<feld.length;i++) {
				
				for(int j=0;j<feld[0].length;j++) {
					
					System.out.print("["+feld[i][j].getKurzBezeichnung()+"]");
					
				}
				System.out.println("");
			}
		}
	}
	
	public void setzeSpielfiguren() {
		int anzahlFiguren = (int) (Math.random() * 16);
		System.out.println("anzahlFiguren: "+anzahlFiguren);
		int punkte=0;
		
		for(int i=0;i<anzahlFiguren;i++) {
			
			int figurNummer=(int) (Math.random() * 5);
			
			if(figurenListe[figurNummer].getAnzahl() < figurenListe[figurNummer].getMaxAnzahl()) {
				setzeFigur(figurNummer);
				figurenListe[figurNummer].erhoeheAnzahl();
				punkte =punkte+ figurenListe[figurNummer].getWert();
				
			}else {
				System.out.println("FIGUR: "+figurenListe[figurNummer].getLangBezeichnung()+" BEREITS > MAXANZAHL VORHANDEN!!");
				i--;
			}
		}
	}
	
	public void setzeFigur(int figurNummer) {
		
		Figur aktFigur=figurenListe[figurNummer];
		int x;
		int y;
		
		do {
			x=(int) (Math.random() * 8);
			y=(int) (Math.random() * 8);
			
		}while(feld[x][y].getLangBezeichnung()!=null);
		
		feld[x][y]=aktFigur;
	}
	
	public void initialisiereFeld() {
		for(int i=0;i<feld.length;i++) {
			for(int j=0;j<feld[0].length;j++) {
				
				feld[i][j]=new Figur();
				
			}
		}
	}

}
