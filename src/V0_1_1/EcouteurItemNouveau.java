/**
 *
 * La classe EcouteurItemNouveau fournit un ensemble de services destin�s � la 
 * gestion de l'item "Nouveau" de la barre de menus de l'application FenetreSaisieTexte
 *
 * Les services fournis sont :
 * EcouteurItemNouveau			: Cr�er un ecouteur de l'item "Nouveau" 
 * actionPerformed 				: Cr�er une zone de texte quand l'item "Nouveau"
 *									est cliqu�.
 *
 * @author Leo-Paul MARTIN et Lo�c Feuga
 *
**/
package V0_1_1;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

   
public class EcouteurItemNouveau implements ActionListener {
FenetreSaisieTexte hamecon;	
 
	
/**
 *
 * La m�thode EcouteurItemNouveau cr�e un ecouteur de l'item "Nouveau" 
 * de la barre de menus de l'application FenetreSaisieTexte
 * 
**/
   // ---                                                   Constructeur normal
   
   public EcouteurItemNouveau(FenetreSaisieTexte hamecon) {
   	
      this.hamecon= hamecon;
   }
   
   
   
/**
 *
 * La m�thode actionPerformed permet de cr�er une zone de texte editable � l'interieur 
 * de l'application FenetreSaisieTexte.
 * 
**/
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
