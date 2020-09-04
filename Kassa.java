package kermis;

import java.util.ArrayList;
import java.util.List;

public class Kassa {

	List<Attractie> attracties =  new ArrayList<Attractie>();
	int totalTickets;
	double totalOmzet;
	BelastingInspecteur belastingInspecteur = new BelastingInspecteur(); 
	
	public Kassa() {
		List<Attractie> attracties; 
		totalTickets =0;
		totalOmzet =0;
		
	}
	
	void berekenTotalOmzet() {
		totalOmzet =0;
		for (int i =0; i<attracties.size(); i++) {
			Attractie omzet = attracties.get(i);
			totalOmzet = totalOmzet + omzet.omzet;
			
		}
	System.out.println("De totale omzet is: " +totalOmzet + "."); 
	
	}
	
 void berekenTotalTickets() {
	 totalTickets =0;
	 for (int i =0; i<attracties.size(); i++) {
			Attractie tickets = attracties.get(i);
			totalTickets = totalTickets + tickets.tickets;
			
		}
	 System.out.println("Er zijn " + totalTickets  + " tickets verkocht."); 
 }
}
