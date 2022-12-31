/**
 *
 * La classe MenuEdition fournit un ensemble de services destinés à 
 * la création du Menu Edition qui contient plusieurs items utilisables 
 * qu'à certains moments.
 *
 * Les services fournis sont :
 * MenuEdition			: Créer un MenuEdition
 * load					: Permet de changer dans le menu les items defini.
 *
 * @author Leo-Paul MARTIN et Loïc Feuga
 *
**/
package V0_1_1;


import java.util.LinkedHashMap;

public class MenuEdition {
	private LinkedHashMap config;
   	
	
/**
 *
 * La méthode MenuEdition crée un objet MenuEdition qui est un LinkedHashMap.
 * 
**/
	   // ---                                              Constructeur par defaut
	   
	   public MenuEdition() {config= new LinkedHashMap();}



/**
 *
 * La méthode load permet de charger les objet du menu edition.
 * 
**/	  	   
	   // ---                                                         Methode load  
	   	  
	   public LinkedHashMap load() {
	   	  	
		   config = new LinkedHashMap();
		   config.put("Annuler", false);
		   config.put("-",null);
		   config.put("Copier",false);
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
