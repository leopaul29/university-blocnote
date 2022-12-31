package V0_0_2;

import java.util.*;

public class MenuQuestion {
private LinkedHashMap config;

	// ---                                              Constructeur par defaut
	
	public MenuQuestion() {config= new LinkedHashMap();}
	
	// ---                                                         Methode load  
		  
	public LinkedHashMap load() {
		  	
	   config.put("Afficher l'aide",        new Boolean(true));
	   config.put("-",              null);
	   config.put("A propos du Bloc-notes" ,        new Boolean(true));
	      
	   return config;
	} 
}
