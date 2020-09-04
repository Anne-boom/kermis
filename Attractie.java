package kermis;

public class Attractie {

	String naam;
	double prijs;
	int tickets;
	double omzet;
	double oppervlakte;
	boolean gokAttractie = false; 
	
	
	void attractieDraaien() {
		System.out.println("De attractie "+ naam + " draait.");
		tickets++; 
		omzet = tickets * prijs; 
	}
	
}
