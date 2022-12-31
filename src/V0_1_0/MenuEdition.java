/**
 *
 * La classe MenuEdition fournit un ensemble de services destin�s � 
 * la cr�ation du Menu Edition qui contient plusieurs items utilisables 
 * qu'� certains moments.
 *
 * Les services fournis sont :
 * MenuEdition			: Cr�er un MenuEdition
 * load					: Permet de changer dans le menu les items defini.
 *
 * @author Leo-Paul MARTIN et Lo�c Feuga
 *
**/
package V0_1_1;


import java.util.LinkedHashMap;

public class MenuEdition {
	private LinkedHashMap config;
   	
	
/**
 *
 * La m�thode MenuEdition cr�e un objet MenuEdition qui est un LinkedHashMap.
 * 
**/
	   // ---                                              Constructeur par defaut
	   
	   public MenuEdition() {config= new LinkedHashMap();}



/**
 *
 * La m�thode load permet de charger les objet du menu edition.
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
