package V0_0_2;

import java.util.*;

public class MenuEdition {
private LinkedHashMap config;

	// ---                                              Constructeur par defaut
	
	public MenuEdition() {config= new LinkedHashMap();}
	
	// ---                                                         Methode load  
		  
	public LinkedHashMap load() {
		  	
	   config.put("Annuler",        new Boolean(true));
	   
	   config.put("-",              null);
	   config.put("Couper" ,        new Boolean(true));
	   config.put("Copier",         new Boolean(false));
	   config.put("Coller", 		new Boolean(false));
	   config.put("Supprimer", 		new Boolean(false));
	   
	   config.put("--",                   			null);
	   config.put("Rechercher...",     				new Boolean(false));
	   config.put("Rechercher le suivant",         	new Boolean(false)); 
	   config.put("Remplacer...",     				new Boolean(false));
	   config.put("Atteindre...",         			new Boolean(false));
	   
	   config.put("---",                  	null);
	   config.put("Sélectionner tout",      new Boolean(true));
	   config.put("Heure/Date",             new Boolean(true));
	      
	   return config;
	} 
}
