package V0_0_1;

import java.util.LinkedHashMap;

public class MenuAffichage {
private LinkedHashMap config;

	// ---                                              Constructeur par defaut
	
	public MenuAffichage() {config= new LinkedHashMap();}
	
	// ---                                                         Methode load  
		  
	public LinkedHashMap load() {
		  	
	   config.put("Barre d'état",        new Boolean(true));
	      
	   return config;
	} 
}
