package kermis;

abstract class RisicoRijkeAttracties extends Attractie{

	int draaien; 
	int draaiLimiet;
	
	void opstellingskeuring() {
		
		if(draaien == draaiLimiet) {
			System.out.println("Pas op onderhoudsbeurt moet worden gepleegd.");
			System.out.println("Onderhoudsbeurt is gepleegd.");
			draaien =0; 
		}else if (draaien == (draaiLimiet-1)) {
			System.out.println("Pas op over een draai moet onderhoudsbeurt worden gepleegd.");
		}
		
	}
	
	void attractieDraaien() {
		System.out.println("De attractie "+ naam + " draait.");
		tickets++; 
		omzet = tickets * prijs;
		draaien++;
		opstellingskeuring();
	}
	
}
