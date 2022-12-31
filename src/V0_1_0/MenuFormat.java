/**
 *
 * La classe MenuFormat fournit un ensemble de services destinés à 
 * la création du Menu Format qui contient plusieurs items utilisables 
 * qu'à certains moments.
 *
 * Les services fournis sont :
 * MenuFormat			: Créer un MenuFormat
 * load					: Permet de changer dans le menu les items defini.
 *
 * @author Leo-Paul MARTIN et Loïc Feuga
 *
**/
package V0_1_1;


import java.util.LinkedHashMap;

public class MenuFormat {
	private LinkedHashMap config_format;
   	
	
	
/**
 *
 * La méthode MenuFormat crée un objet MenuFormat qui est un LinkedHashMap.
 * 
**/
	   // ---                                              Constructeur par defaut
	   
	   public MenuFormat() {config_format= new LinkedHashMap();}
	   
	   
	   
/**
 *
 * La méthode load permet de charger les objet du menu format.
 * 
**/	  
	   // ---                                                         Methode load  
	   	  
	   public LinkedHashMap load() {
	   	  	
		 //  config_format = new LinkedHashMap();
		   config_format.put("Retour automatique à la ligne",new Boolean(true));
		   config_format.put("Police...",new Boolean(true));
	         
	      return config_format;
	   } 
}
