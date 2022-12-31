/**
 *
 * La classe MenuQuestion fournit un ensemble de services destin�s � 
 * la cr�ation du Menu Question qui contient plusieurs items utilisables 
 * qu'� certains moments.
 *
 * Les services fournis sont :
 * MenuQuestion			: Cr�er un MenuQuestion
 * load					: Permet de changer dans le menu les items defini.
 *
 * @author Leo-Paul MARTIN et Lo�c Feuga
 *
**/
package V0_1_1;

import java.util.LinkedHashMap;

public class MenuQuestion {
	private LinkedHashMap config;
   	
	
	
/**
 *
 * La m�thode MenuQuestion cr�e un objet MenuQuestion qui est un LinkedHashMap.
 * 
**/
	   // ---                                              Constructeur par defaut
	   
	   public MenuQuestion() {config= new LinkedHashMap();}
	   
	   
	   
/**
 *
 * La m�thode load permet de charger les objet du menu question.
 * 
**/	  
	   // ---                                                         Methode load  
	   	  
	   public LinkedHashMap load() {
	   	  	
		   config = new LinkedHashMap();
		   config.put("Afficher l'aide",true);
		   config.put("-",null);
		   config.put("� propos du Bloc-note", true);
	         
	      return config;
	   } 
}
