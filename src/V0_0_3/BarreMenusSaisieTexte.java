//
// IUT de Nice / Departement informatique / Module APO-Java
// Annee 2012_2013 - Package AWT
//
// Classe BarreMenusSaisieTexte : gestion des menus deroulants de l'application
//                                FenetreSaisieTexte
//
// Edition A 	: externalisation depuis la classe d'origine
//
//    + Version 1.0.0	: limitee au menu "Fichier"
//    + Version 1.1.0   : introduction d'un dictionnaire de configuration
//                        et d'un main d'auto test
//    + Version 1.2.0   : externalisation de la creation du dictionnaire de
//                        configuration du menu "Fichier" (classe satellite
//                        MenuFichier)
//
// Auteur : A. Thuaire
//
package V0_0_3;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class BarreMenusSaisieTexte extends MenuBar {
private Menu           menuFichier;
private LinkedHashMap  itemsFichier;
private LinkedHashMap  itemsEdition;
private LinkedHashMap  itemsFormat;
private LinkedHashMap  itemsAffichage;
private LinkedHashMap  itemsQuestion;

   public BarreMenusSaisieTexte() {
   	
	   //--Menu Fichier
	  itemsFichier = new MenuFichier().load();
	   
	   //--Menu Edition
	   itemsEdition = new MenuEdition().load();
	  
	   //--Menu Format
	   itemsFormat = new MenuFormat().load();
	   
	   //--Menu Affichage
	   itemsAffichage = new MenuAffichage().load();
	   
	   //--Menu ?
	   itemsQuestion = new MenuQuestion().load();
	   
			  
	   // --- Installer les menus
	   //
	   LinkedHashMap all = new LinkedHashMap();
	   all.put("Fichier", itemsFichier);
	   all.put("Edition", itemsEdition);
	   all.put("Format", itemsFormat);
	   all.put("Affichage", itemsAffichage);
	   all.put("?", itemsQuestion);
	   
	   Iterator j = all.keySet().iterator();
	
	   
	  while(j.hasNext()){
		  String  cle = (String) j.next();
	      
	      
	      // --- Charger le dictionnaire de configuration
	      //
	      LinkedHashMap config= (LinkedHashMap) all.get(cle);
	      
	      
	      menuFichier= new Menu(cle);
	      add(menuFichier);
	      
	      // --- Installer tous les items des menus
	      //
	     // config = new LinkedHashMap(); 
	      Iterator i= config.keySet().iterator(); 
	      cle = null;
	      Boolean associe;
	     
	      while (i.hasNext()) {
	    	  MenuItem itemCourant;
	      	 cle = (String) i.next();
	      	 associe = (Boolean) config.get(cle);
	      	
	      	 // --- Creer l'item courant de la configuration
	         //
	      
		     
	         if (associe == null) menuFichier.addSeparator();
	         
	         else {
	        	  itemCourant= new MenuItem(cle);
			     itemCourant.setEnabled(associe);
			     itemsFichier.put(cle, itemCourant);
			     menuFichier.add(itemCourant);
	         }
	         
	         
	         
	         // --- Activer chaque item valide dans la configuration
	         //
	         //if (associe != null) itemCourant.setEnabled(associe.booleanValue());*/
	      }
	  }
   }
   
   // ---                                           Accesseurs de consultation
      
   public LinkedHashMap getItemsFichier() {return itemsFichier;}
   public LinkedHashMap getItemsEdition() {return itemsEdition;}
   public LinkedHashMap getItemsFormat() {return itemsFormat;}
   public LinkedHashMap getItemsQuestions() {return itemsQuestion;}
   public LinkedHashMap getItemsAffichage() {return itemsAffichage;}
     
   // ---                                                         Methode main
   
   public static void main (String[] args) {
   Frame cadreSupport= new Frame();
   BarreMenusSaisieTexte barreMenus= new BarreMenusSaisieTexte();
      
      cadreSupport.setSize(600, 400);
      cadreSupport.setTitle ("(AWT) Classe BarreMenusSaisieTexte - V 1.2.0");
      
      cadreSupport.setMenuBar(barreMenus);
      cadreSupport.setVisible(true);
   }
}
