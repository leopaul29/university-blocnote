/**
 *
 * La classe MenuFichier fournit un ensemble de services destin�s � 
 * la cr�ation du Menu Fichier qui contient plusieurs items utilisables 
 * qu'� certains moments.
 *
 * Les services fournis sont :
 * MenuFichier			: Cr�er un MenuFichier
 * load					: Permet de changer dans le menu les items defini.
 *
 * @author Leo-Paul MARTIN et Lo�c Feuga
 *
**/
package V0_1_1;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class MenuFichier {
private LinkedHashMap config;
   	
	
	
/**
 *
 * La m�thode MenuFichier cr�e un objet MenuFichier qui est un LinkedHashMap.
 * 
**/
   // ---                                              Constructeur par defaut
   
   public MenuFichier() {config= new LinkedHashMap();}
   
   
   
/**
 *
 * La m�thode load permet de charger les objet du menu fichier.
 * 
**/	  
   // ---                                                         Methode load  
   	  
   public LinkedHashMap load() {
   	  	
	   config = new LinkedHashMap();
	   config.put("Nouveau",new Boolean(true));
	   config.put("Ouvrir...",new Boolean(true));
	   config.put("Enregistrer",new Boolean(true));
	   config.put("Enregistrer sous...",new Boolean(true));
	   config.put("-",null);
	   config.put("Mise en page...",new Boolean(false));
	   config.put("Imprimer...",new Boolean(false));
	   config.put("--",null);
	   config.put("Quitter",new Boolean(true));
         
      return config;
   } 
}    
