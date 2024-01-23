package einkaufliste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Einkauf {

	private List<Produkt> einkaufsListe;
	private List<Produkt> lagerListe;

	public Einkauf() {
		einkaufsListe = new ArrayList<Produkt>();
		lagerListe = new ArrayList<Produkt>();
		
		erstelleLager();
		
	}

	public void einkauf() {
		Scanner scanner = new Scanner(System.in);
		String eingabe;
		
		System.out.println("Guten Tag im Online Einkaufladen.");
		System.out.println("Bitte geben Sie einene Befehl ein! Bei Fregen hilt \"info\" Ihnen weiter");
		
		do {
			

			eingabe = scanner.nextLine();
			String[] eingabeListe = eingabe.split(" ");

			switch (eingabeListe[0]) {
			case ("info"):
				info();
				break;
			case ("list"):
				
				if (eingabeListe.length == 2) {
					if(eingabeListe[1].equals("lager")) {
						listLager();
					} else if(eingabeListe[1].equals("einkauf")) {
						listEinkauf();
					}
					
				} else if (eingabeListe.length < 2) {
					System.out.println("ZU WENIGE EINGABEN. PRODUKTNAME FEHLT");
				} else if (eingabeListe.length > 2) {
					System.out.println("ZU VIELE EINGABEN");
				}
				
				break;
			case ("add"):

				if (eingabeListe.length == 2) {
					addToEinkauf(eingabeListe[1]);
				} else if (eingabeListe.length < 2) {
					System.out.println("ZU WENIGE EINGABEN. PRODUKTNAME FEHLT");
				} else if (eingabeListe.length > 2) {
					System.out.println("ZU VIELE EINGABEN");
				}
				break;
			case ("pay"):
				bezahlen();
				break;
			case ("exit"):
				System.out.println("Vielen Dank für den Einkauf!");
				break;
			default:
				System.out.println("Die Eingabe: "+eingabe+" wurde nicht erkannt! info bietet Hilfe");
			}
		} while (!eingabe.equals("exit"));
		scanner.close();
	}

	private void bezahlen() {

		System.out.println("Folgende Rechnung ist zu bezahlen:");
		listEinkauf();
		
		System.out.println("Mit Folgendem Preis:"+getEinkaufPreis());
	}
	
	private double getEinkaufPreis() {
		
		double preis=0.0;
		for(int i=0;i<einkaufsListe.size();i++) {
			preis=preis+einkaufsListe.get(i).getPreis();
		}
		return preis;
	}

	public void addToEinkauf(String produktName) {

		for (int i = 0; i < lagerListe.size(); i++) {
			if (lagerListe.get(i).getBezeichnung().equals(produktName)) {
				einkaufsListe.add(lagerListe.get(i));
				break;
			}
		}
	}
	
	public void verlassen() {
		
	}

	private void listLager() {
		for (int i = 0; i < lagerListe.size(); i++) {
			System.out.println(lagerListe.get(i).getBezeichnung() + " : " + lagerListe.get(i).getPreis());
		}
	}
	
	private void listEinkauf() {
		for (int i = 0; i < einkaufsListe.size(); i++) {
			System.out.println(einkaufsListe.get(i).getBezeichnung() + " : " + einkaufsListe.get(i).getPreis());
		}
	}

	public void info() {
		System.out.println("Folgende Befehle sind vorhanden:");
		System.out.println("info: Alle verfügbaren Befehle auflisten");
		System.out.println("list einkauf/lager: Auflistung aller verfügbaren Artikel");
		System.out.println("add <ARTIKELNAME>: hinzufügen eines Artikels");
		System.out.println("pay: Bezahlen, auflistung der  Produkte mit Preis");
		System.out.println("exit: verlassen");
	}

	public void erstelleLager() {
		String[] artikelNamen = { "Bananen", "Äpfel", "Brot", "Müsli", "Energy", "Kaffee", "Nudeln", "Jogurt", "Saft",
				"Bier", "Stift", "Schere", "Papier", "Chips", "Dosen", "Fleisch", "Kürbis" };
		

		for (int i = 0; i < artikelNamen.length; i++) {
			String produktName = artikelNamen[i];
			
			double preis = (Math.random() * 4)+1;
			
			preis = Math.round(100.0 * preis) / 100.0;
			
			int anzahl = (int) Math.random() * 10;

			lagerListe.add(new Produkt(produktName, preis, anzahl));
		}

	}
}
