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
package V0_0_1;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class BarreMenusSaisieTexte extends MenuBar {
private Menu           menuFichier;
private Menu		   menuEdition;
private Menu		   menuFormat;
private Menu		   menuAffichage;
private Menu		   menuQuestion;
private LinkedHashMap  itemsFichier;
private LinkedHashMap  itemsEdition;
private LinkedHashMap  itemsFormat;
private LinkedHashMap  itemsAffichage;
private LinkedHashMap  itemsQuestion;

   public BarreMenusSaisieTexte() {
   	
      // --- Installer le menu "Fichier"
      //
      menuFichier= new Menu("Fichier");
      add(menuFichier);
      
      // --- Charger le dictionnaire de configuration
      //
      LinkedHashMap config= new MenuFichier().load();
      
      // --- Installer tous les items du menu "Fichier"
      //
      itemsFichier= new LinkedHashMap(); 
      Iterator i= config.keySet().iterator(); 
      String cle;
      Boolean associe;
      MenuItem itemCourant= null;
      
      while (i.hasNext()) {
      	
      	 cle=     (String) i.next();
      	 associe= (Boolean) config.get(cle);
      	
      	 // --- Creer l'item courant de la configuration
         //
         if (associe == null) menuFichier.addSeparator();
         
         else {
         	itemCourant= new MenuItem(cle);
         	itemsFichier.put(cle, itemCourant);
            menuFichier.add(itemCourant);
         }
         
         // --- Activer chaque item valide dans la configuration
         //
         if (associe != null) itemCourant.setEnabled(associe.booleanValue());
      }
      
// --------------------------------------------------------------------------------------------------------------
      
      // --- Installer le menu "Edition"
      //
      menuEdition= new Menu("Edition");
      add(menuEdition);
      
      // --- Charger le dictionnaire de configuration
      //
      LinkedHashMap config1= new MenuEdition().load();
      
      // --- Installer tous les items du menu "Fichier"
      //
      itemsEdition= new LinkedHashMap(); 
      Iterator i1= config1.keySet().iterator(); 
      String cle1;
      Boolean associe1;
      MenuItem itemCourant1= null;
      
      while (i1.hasNext()) {
      	
      	 cle1=     (String) i1.next();
      	 associe1= (Boolean) config1.get(cle1);
      	
      	 // --- Creer l'item courant de la configuration
         //
         if (associe1 == null) menuEdition.addSeparator();
         
         else {
         	itemCourant1= new MenuItem(cle1);
         	itemsEdition.put(cle1, itemCourant1);
         	menuEdition.add(itemCourant1);
         }
         
         // --- Activer chaque item valide dans la configuration
         //
         if (associe1 != null) itemCourant1.setEnabled(associe1.booleanValue());
      }
      
   // --------------------------------------------------------------------------------------------------------------
      
      // --- Installer le menu "Format"
      //
      menuFormat= new Menu("Format");
      add(menuFormat);
      
      // --- Charger le dictionnaire de configuration
      //
      LinkedHashMap config4= new MenuFormat().load();
      
      // --- Installer tous les items du menu "Fichier"
      //
      itemsFormat= new LinkedHashMap(); 
      Iterator i4= config4.keySet().iterator(); 
      String cle4;
      Boolean associe4;
      MenuItem itemCourant4= null;
      
      while (i4.hasNext()) {
      	
      	 cle4=     (String) i4.next();
      	 associe4= (Boolean) config4.get(cle4);
      	
      	 // --- Creer l'item courant de la configuration
         //
         if (associe4 == null) menuFormat.addSeparator();
         
         else {
         	itemCourant4= new MenuItem(cle4);
         	itemsFormat.put(cle4, itemCourant4);
         	menuFormat.add(itemCourant4);
         }
         
         // --- Activer chaque item valide dans la configuration
         //
         if (associe4 != null) itemCourant4.setEnabled(associe4.booleanValue());
      }
      
// --------------------------------------------------------------------------------------------------------------
      
      // --- Installer le menu "Affichage"
      //
      menuAffichage= new Menu("Affichage");
      add(menuAffichage);
      
      // --- Charger le dictionnaire de configuration
      //
      LinkedHashMap config2= new MenuAffichage().load();
      
      // --- Installer tous les items du menu "Fichier"
      //
      itemsAffichage= new LinkedHashMap(); 
      Iterator i2= config2.keySet().iterator(); 
      String cle2;
      Boolean associe2;
      MenuItem itemCourant2= null;
      
      while (i2.hasNext()) {
      	
      	 cle2=     (String) i2.next();
      	 associe2= (Boolean) config2.get(cle2);
      	
      	 // --- Creer l'item courant de la configuration
         //
         if (associe2 == null) menuAffichage.addSeparator();
         
         else {
         	itemCourant2= new MenuItem(cle2);
         	itemsAffichage.put(cle2, itemCourant2);
         	menuAffichage.add(itemCourant2);
         }
         
         // --- Activer chaque item valide dans la configuration
         //
         if (associe2 != null) itemCourant2.setEnabled(associe2.booleanValue());
      }
   
   
// --------------------------------------------------------------------------------------------------------------
   
   // --- Installer le menu "Question ?"
   //
   menuQuestion= new Menu("?");
   add(menuQuestion);
   
   // --- Charger le dictionnaire de configuration
   //
   LinkedHashMap config3= new MenuQuestion().load();
   
   // --- Installer tous les items du menu "Fichier"
   //
   itemsQuestion= new LinkedHashMap(); 
   Iterator i3= config3.keySet().iterator(); 
   String cle3;
   Boolean associe3;
   MenuItem itemCourant3= null;
   
   while (i3.hasNext()) {
   	
   	 cle3=     (String) i3.next();
   	 associe3= (Boolean) config3.get(cle3);
   	
   	 // --- Creer l'item courant de la configuration
      //
      if (associe3 == null) menuQuestion.addSeparator();
      
      else {
      	itemCourant3= new MenuItem(cle3);
      	itemsQuestion.put(cle3, itemCourant3);
      	menuQuestion.add(itemCourant3);
      }
      
      // --- Activer chaque item valide dans la configuration
      //
      if (associe3 != null) itemCourant3.setEnabled(associe3.booleanValue());
   }
   
}
   
   // ---                                           Accesseurs de consultation
      
   public LinkedHashMap getItemsFichier() {return itemsFichier;}
   public LinkedHashMap getItemsEdition() {return itemsEdition;}
   public LinkedHashMap getItemsFormat() {return itemsFormat;}
   public LinkedHashMap getItemsAffichage() {return itemsAffichage;}
   public LinkedHashMap getItemsQuestion() {return itemsQuestion;}
   
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
