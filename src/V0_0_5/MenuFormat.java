package V0_0_5;

import java.util.LinkedHashMap;

public class MenuFormat {
	private LinkedHashMap config;
   	
	   // ---                                              Constructeur par defaut
	   
	   public MenuFormat() {config= new LinkedHashMap();}
	   
	   // ---                                                         Methode load  
	   	  
	   public LinkedHashMap load() {
	   	  	
		   config = new LinkedHashMap();
		   config.put("Retour automatique ? la ligne",new Boolean(true));
		   config.put("Police...",new Boolean(true));
	         
	      return config;
	   } 
}
