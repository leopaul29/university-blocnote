package IntegrationV0_0_1;

import java.util.LinkedHashMap;

public class MenuAffichage {
	private LinkedHashMap config;
   	
	   // ---                                              Constructeur par defaut
	   
	   public MenuAffichage() {config= new LinkedHashMap();}
	   
	   // ---                                                         Methode load  
	   	  
	   public LinkedHashMap load() {
	   	  	
		   config = new LinkedHashMap();
		   config.put("Barre d'état",true);
	         
	      return config;
	   } 
}
