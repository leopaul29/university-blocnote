package V0_0_6;


import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class BarreMenusSaisieTexte extends MenuBar {
private Menu           menuFichier;
private Menu 			menuEdition;
private Menu			menuFormat;
private Menu 			menuAffichage;
private Menu			menuQuestion;
private LinkedHashMap  itemsFichier;
private LinkedHashMap	itemsEdition;
private LinkedHashMap	itemsFormat;
private LinkedHashMap	itemsAffichage;
private LinkedHashMap	itemsQuestion;

   public BarreMenusSaisieTexte() {
   	
      // --- Installer le menu "Fichier"
      //
      menuFichier= new Menu("Fichier");
      add(menuFichier);
      
      // --- Installer le menu "Edition"
      //
      menuEdition= new Menu("Edition");
      add(menuEdition);
      
      // --- Installer le menu "Format
      //
      menuFormat = new Menu("Format");
      add(menuFormat);
      
      // --- Installer le menu "Affichage"
      //
      menuAffichage = new Menu("Affichage");
      add(menuAffichage);
      
      // --- Installer le menu "?"
      //
      menuQuestion = new Menu("?");
      add(menuQuestion);
      
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
      
      // --- Installer tout les items du menu "Edition"
      //
      
      config = new MenuEdition().load();
      
      itemsEdition = new LinkedHashMap();
      i= config.keySet().iterator();
      itemCourant= null;
      
      while (i.hasNext()) {
        	
       	 cle=     (String) i.next();
       	 associe= (Boolean) config.get(cle);
       	
       	 // --- Creer l'item courant de la configuration
          //
          if (associe == null) menuEdition.addSeparator();
          
          else {
          	itemCourant= new MenuItem(cle);
          	itemsEdition.put(cle, itemCourant);
             menuEdition.add(itemCourant);
          }
          
          // --- Activer chaque item valide dans la configuration
          //
          if (associe != null) itemCourant.setEnabled(associe.booleanValue());
       }
      
   // --- Installer tout les items du menu "Format"
      //
      
      config = new MenuFormat().load();
      
      itemsFormat = new LinkedHashMap();
      i= config.keySet().iterator();
      itemCourant= null;
      
      while (i.hasNext()) {
        	
       	 cle=     (String) i.next();
       	 associe= (Boolean) config.get(cle);
       	
       	 // --- Creer l'item courant de la configuration
          //
          if (associe == null) menuFormat.addSeparator();
          
          else {
          	itemCourant= new MenuItem(cle);
          	itemsFormat.put(cle, itemCourant);
             menuFormat.add(itemCourant);
          }
          
          // --- Activer chaque item valide dans la configuration
          //
          if (associe != null) itemCourant.setEnabled(associe.booleanValue());
       }
      
   // --- Installer tout les items du menu "Affichage"
      //
      
      config = new MenuAffichage().load();
      
      itemsAffichage = new LinkedHashMap();
      i= config.keySet().iterator();
      itemCourant= null;
      
      while (i.hasNext()) {
        	
       	 cle=     (String) i.next();
       	 associe= (Boolean) config.get(cle);
       	
       	 // --- Creer l'item courant de la configuration
          //
          if (associe == null) menuAffichage.addSeparator();
          
          else {
          	itemCourant= new MenuItem(cle);
          	itemsAffichage.put(cle, itemCourant);
             menuAffichage.add(itemCourant);
          }
          
          // --- Activer chaque item valide dans la configuration
          //
          if (associe != null) itemCourant.setEnabled(associe.booleanValue());
       }
      
   // --- Installer tout les items du menu "Question"
      //
      
      config = new MenuQuestion().load();
      
      itemsQuestion = new LinkedHashMap();
      i= config.keySet().iterator();
      itemCourant= null;
      
      while (i.hasNext()) {
        	
       	 cle=     (String) i.next();
       	 associe= (Boolean) config.get(cle);
       	
       	 // --- Creer l'item courant de la configuration
          //
          if (associe == null) menuQuestion.addSeparator();
          
          else {
          	itemCourant= new MenuItem(cle);
          	itemsQuestion.put(cle, itemCourant);
             menuQuestion.add(itemCourant);
          }
          
          // --- Activer chaque item valide dans la configuration
          //
          if (associe != null) itemCourant.setEnabled(associe.booleanValue());
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
