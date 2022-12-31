package IntegrationV0_0_1;

import java.util.LinkedHashMap;

public class MenuFormat {
	private LinkedHashMap config_format;
   	
	   // ---                                              Constructeur par defaut
	   
	   public MenuFormat() {config_format= new LinkedHashMap();}
	   
	   // ---                                                         Methode load  
	   	  
	   public LinkedHashMap load() {
	   	  	
		 //  config_format = new LinkedHashMap();
		   config_format.put("Retour automatique à la ligne",new Boolean(true));
		   config_format.put("Police...",new Boolean(true));
	         
	      return config_format;
	   } 
}
