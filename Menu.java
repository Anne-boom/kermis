package kermis;

import java.util.Scanner;

public class Menu {
	
	boolean weggaan = false; 
	Scanner myObj = new Scanner(System.in);
	Kassa kassa = new Kassa(); 
	
	public Menu() {
		boolean weggaan; 
	}
	
	void makeMenu() {
		
		while (weggaan == false) {
			
			menuText();
			String input = myObj.nextLine() ;
			
			switch (input) {
			case "1":
				
				for (int i=0; i<kassa.attracties.size(); i++) {
					Attractie bots1 = (Attractie) kassa.attracties.get(i);
					if (bots1.naam == "botsauto") {
					bots1.attractieDraaien();
					}
				}
				
				System.out.println(kassa.attracties.get(0).tickets);
				break;
			case "2":
				
				for (int i=0; i<kassa.attracties.size(); i++) {
					Attractie spin1 = (Attractie) kassa.attracties.get(i);
					if (spin1.naam == "spin") {
					spin1.attractieDraaien();
					}
				}
				
				System.out.println(kassa.attracties.get(1).tickets);
				break;
			case "3":
				
				for (int i=0; i<kassa.attracties.size(); i++) {
					Attractie spiegelpaleis1 = (Attractie) kassa.attracties.get(i);
					if (spiegelpaleis1.naam == "spiegelpaleis") {
					spiegelpaleis1.attractieDraaien();
					}
				}
				
				System.out.println(kassa.attracties.get(2).tickets);
				break;
			case "4":
				
				for (int i=0; i<kassa.attracties.size(); i++) {
					Attractie spook1 = (Attractie) kassa.attracties.get(i);
					if (spook1.naam == "spookhuis") {
					spook1.attractieDraaien();
					}
				}
				
				System.out.println(kassa.attracties.get(3).tickets);
				break;
			case "5":
				
				for (int i=0; i<kassa.attracties.size(); i++) {
					Attractie hawaii1 = (Attractie) kassa.attracties.get(i);
					if (hawaii1.naam == "hawaii") {
					hawaii1.attractieDraaien();
					}
				}
				
				System.out.println(kassa.attracties.get(4).tickets);
				break;
			case "6":
				
				for (int i=0; i<kassa.attracties.size(); i++) {
					Attractie ladder1 = (Attractie) kassa.attracties.get(i);
					if (ladder1.naam == "ladderklimmen") {
					ladder1.attractieDraaien();
					}
				}
				
				System.out.println(kassa.attracties.get(5).tickets);
				break;
			case "b":
				kassa.belastingInspecteur.bezoek++;
				
				for (int i=0; i<kassa.attracties.size(); i++) {
					Attractie mogelijkGok = (Attractie) kassa.attracties.get(i);
					
					if (mogelijkGok instanceof GokAttractie ) {
						
						Laderklimmen GokSpel = (Laderklimmen) kassa.attracties.get(i); 
						GokSpel.kansSpelBelastingBetalen();
						
					}
				}
				
				kassa.belastingInspecteur.bezoek++;
				
				break;
			case "k":
				kassa.berekenTotalTickets();
				break;
			case "o":
				kassa.berekenTotalOmzet();
				break;
			case "x":
				weggaan = true;
				break;
			default:
				System.out.println("Dit is geen optie, voer alstublieft een correcte optie in.");
			}
			
		}
	}
	
	void menuText() {
		System.out.println("");
		System.out.println("U kunt uit de volgende opties kiezen.");
		System.out.println("1 = neem een ritje in de botsauto's.");
		System.out.println("2 = neem een ritje in de spin.");
		System.out.println("3 = neem een ritje in de spiegelpaleis.");
		System.out.println("4 = neem een ritje in de spookhuis.");
		System.out.println("5 = neem een ritje in de hawaii.");
		System.out.println("6 = neem een ritje in de laderklimmen.");
		System.out.println("p = de totale tickets die verkocht zijn.");
		System.out.println("o = de totale omzet.");
		System.out.println("x = programma afsluiten.");
		System.out.println("");
	}

}
