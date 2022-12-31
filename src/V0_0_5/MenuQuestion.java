package V0_0_5;

import java.util.LinkedHashMap;

public class MenuQuestion {
	private LinkedHashMap config;
   	
	   // ---                                              Constructeur par defaut
	   
	   public MenuQuestion() {config= new LinkedHashMap();}
	   
	   // ---                                                         Methode load  
	   	  
	   public LinkedHashMap load() {
	   	  	
		   config = new LinkedHashMap();
		   config.put("Afficher l'aide",true);
		   config.put("-",null);
		   config.put("À propos du bloc note", true);
	         
	      return config;
	   } 
}
