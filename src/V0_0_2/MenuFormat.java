package V0_0_2;

import java.util.*;

public class MenuFormat {
private LinkedHashMap config;

	// ---                                              Constructeur par defaut
	
	public MenuFormat() {config= new LinkedHashMap();}
	
	// ---                                                         Methode load  
		  
	public LinkedHashMap load() {
		  	
	   config.put("Retour automatique � la ligne",        new Boolean(true));
	   config.put("Police...",      					  new Boolean(true));
	      
	   return config;
	} 

}
