/**
 *
 * La classe MenuAffichage fournit un ensemble de services destinés à 
 * la création du menu affichage qui contient un seul item.
 *
 * Les services fournis sont :
 * MenuAffichage			: Créer un MenuAffichage
 * load					: Permet de changer dans le menu les items defini.
 *
 * @author Leo-Paul MARTIN et Loïc Feuga
 *
**/
package V0_1_1;


import java.util.LinkedHashMap;

public class MenuAffichage {
	private LinkedHashMap config;
   	
/**
 *
 * La méthode MenuAffichage crée un objet MenuAffichage qui est un LinkedHashMap.
 * 
**/
	   // ---                                              Constructeur par defaut
	   
	   public MenuAffichage() {config= new LinkedHashMap();}


/**
 *
 * La méthode load permet de charger les objet du menu affichage.
 * 
**/	   
	   // ---                                                         Methode load  
	   	  
	   public LinkedHashMap load() {
	   	  	
		   config = new LinkedHashMap();
		   config.put("Barre d'état",true);
	         
	      return config;
	   } 
}
