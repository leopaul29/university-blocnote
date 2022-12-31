//
// IUT de Nice / Departement informatique / Module APO-Java
// Annee 2012_2013 - Package AWT
//
// Classe EcouteurItemNouveau : gestion de l'item "Nouveau" de la barre de menus
//                              de l'application FenetreSaisieTexte
//
// Edition A 	: externalisation depuis la classe d'origine
//
//    + Version 1.0.0	: version initiale
//
// Auteur : A. Thuaire
//
package V0_0_6;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

   
public class EcouteurItemNouveau implements ActionListener {
FenetreSaisieTexte hamecon;	
   	
   // ---                                                   Constructeur normal
   
   public EcouteurItemNouveau(FenetreSaisieTexte hamecon) {
   	
      this.hamecon= hamecon;
   }
   
   // ---                                                  Ecouteur clic souris
   
   public void actionPerformed (ActionEvent e) {
   MenuBar       barreMenus;
   TextArea      zoneAffichage;
   LinkedHashMap itemsFichier;
   LinkedHashMap itemsEdition;
   LinkedHashMap itemsFormat;
   
      // --- Valider la zone d'affichage 
      //
      zoneAffichage= hamecon.getZoneAffichage(); 
      zoneAffichage.setEnabled(true);
      
      // --- Valider les items du menu "Fichier" 
      //
      barreMenus= hamecon.getBarreMenus();
      itemsFichier= ((BarreMenusSaisieTexte)barreMenus).getItemsFichier();
      itemsEdition= ((BarreMenusSaisieTexte)barreMenus).getItemsEdition();
     // itemsFormat= ((BarreMenusSaisieTexte)barreMenus).getItemsFormat();
      	 
      Iterator i= itemsFichier.keySet().iterator();
      Iterator j = itemsEdition.keySet().iterator();
      //Iterator k = itemsFormat.keySet().iterator();
      
      MenuItem itemMenu;
      MenuItem itemMenu2;
//      MenuItem itemMenu3;
      
      while (i.hasNext()) {
      	
         itemMenu= (MenuItem)itemsFichier.get(i.next());
         if (itemMenu != null) itemMenu.setEnabled(true);
         
         itemMenu2= (MenuItem)itemsEdition.get(j.next());
         if (itemMenu2 != null) itemMenu2.setEnabled(true); 
         
      //   itemMenu3= (MenuItem)itemsFormat.get(k.next());
        // if (itemMenu != null) itemMenu.setEnabled(true);
      }
   }                	
}
