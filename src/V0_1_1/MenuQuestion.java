/**
 *
 * La classe MenuQuestion fournit un ensemble de services destinés à 
 * la création du Menu Question qui contient plusieurs items utilisables 
 * qu'à certains moments.
 *
 * Les services fournis sont :
 * MenuQuestion			: Créer un MenuQuestion
 * load					: Permet de changer dans le menu les items defini.
 *
 * @author Leo-Paul MARTIN et Loïc Feuga
 *
**/
package V0_1_1;

import java.util.LinkedHashMap;

public class MenuQuestion {
	private LinkedHashMap config;
   	
	
	
/**
 *
 * La méthode MenuQuestion crée un objet MenuQuestion qui est un LinkedHashMap.
 * 
**/
	   // ---                                              Constructeur par defaut
	   
	   public MenuQuestion() {config= new LinkedHashMap();}
	   
	   
	   
/**
 *
 * La méthode load permet de charger les objet du menu question.
 * 
**/	  
	   // ---                                                         Methode load  
	   	  
	   public LinkedHashMap load() {
	   	  	
		   config = new LinkedHashMap();
		   config.put("Afficher l'aide",true);
		   config.put("-",null);
		   config.put("À propos du Bloc-note", true);
	         
	      return config;
	   } 
}
