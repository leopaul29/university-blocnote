/**
 *
 * La classe MenuAffichage fournit un ensemble de services destin�s � 
 * la cr�ation du menu affichage qui contient un seul item.
 *
 * Les services fournis sont :
 * MenuAffichage			: Cr�er un MenuAffichage
 * load					: Permet de changer dans le menu les items defini.
 *
 * @author Leo-Paul MARTIN et Lo�c Feuga
 *
**/
package V0_1_1;


import java.util.LinkedHashMap;

public class MenuAffichage {
	private LinkedHashMap config;
   	
/**
 *
 * La m�thode MenuAffichage cr�e un objet MenuAffichage qui est un LinkedHashMap.
 * 
**/
	   // ---                                              Constructeur par defaut
	   
	   public MenuAffichage() {config= new LinkedHashMap();}


/**
 *
 * La m�thode load permet de charger les objet du menu affichage.
 * 
**/	   
	   // ---                                                         Methode load  
	   	  
	   public LinkedHashMap load() {
	   	  	
		   config = new LinkedHashMap();
		   config.put("Barre d'�tat",true);
	         
	      return config;
	   } 
}
