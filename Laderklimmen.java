package kermis;

public class Laderklimmen extends Attractie implements GokAttractie {
	

	public Laderklimmen() {
		naam = "ladderklimmen";
		prijs = 5.00;
		tickets = 0;
		omzet = 0;
		oppervlakte =1;
		
	}
	
	public void kansSpelBelastingBetalen() {
		boolean gokAttractie = true; 
		omzet = omzet * 0.7;
		
	}
	
	void attractieDraaien() {
		System.out.println("De attractie "+ naam + " draait.");
		tickets++; 
		omzet = tickets * prijs; 
		
	}
}
