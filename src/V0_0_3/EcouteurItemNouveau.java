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
package V0_0_3;

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
   
      // --- Valider la zone d'affichage 
      //
      zoneAffichage= hamecon.getZoneAffichage(); 
      zoneAffichage.setEnabled(true);
      
      // --- Valider les items du menu "Fichier" 
      //
      barreMenus= hamecon.getBarreMenus();
      itemsFichier= ((BarreMenusSaisieTexte)barreMenus).getItemsFichier();
      	 
      Iterator i= itemsFichier.keySet().iterator();
      MenuItem itemMenu;
      
      while (i.hasNext()) {
      	
         itemMenu= (MenuItem)itemsFichier.get(i.next());
         if (itemMenu != null) itemMenu.setEnabled(true);
      }
   }                	
}
