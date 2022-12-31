package V0_0_5;

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
