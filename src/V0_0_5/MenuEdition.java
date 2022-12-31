package V0_0_5;

import java.util.LinkedHashMap;

public class MenuEdition {
	private LinkedHashMap config;
   	
	   // ---                                              Constructeur par defaut
	   
	   public MenuEdition() {config= new LinkedHashMap();}
	   
	   // ---                                                         Methode load  
	   	  
	   public LinkedHashMap load() {
	   	  	
		   config = new LinkedHashMap();
		   config.put("Annuler", false);
		   config.put("-",null);
		   config.put("Couper",false);
		   config.put("Coller",false);
		   config.put("Supprimer",false);
		   config.put("--",null);
		   config.put("Rechercher...",false);
		   config.put("Rechercher le suivant",false);
		   config.put("Remplacer...",true);
		   config.put("Atteindre...",true);
		   config.put("---",null);
		   config.put("Selectionner tout",true);
		   config.put("Heure/Date",true);
		   config.put("Couper",true);
	         
	      return config;
	   } 
}
