package kermis;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	  

	  public static void main(String[] args) {
		  Menu menu = new Menu();
		 Kassa kassa = menu.kassa;
	    
		Botsauto bots = new Botsauto();
	    kassa.attracties.add(bots);
	    Spin spin = new Spin();
	    kassa.attracties.add(spin);
	    Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
	    kassa.attracties.add(spiegelpaleis);
	    Spookhuis spookhuis = new Spookhuis();
	    kassa.attracties.add(spookhuis);
	    Hawaii hawaii = new Hawaii();
	    kassa.attracties.add(hawaii);
	    Laderklimmen laderklimmen = new Laderklimmen();
	    kassa.attracties.add(laderklimmen);
	    
	    
	    
	    menu.makeMenu();
	    
	  
	  
	
	  
	  }
	}
