package V0_0_3;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class EcouteurItemPolice implements ActionListener {
	FenetreSaisieTexte hamecon;	
	
	 
	   public EcouteurItemPolice(FenetreSaisieTexte hamecon) {
	   	
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
	      
	      // --- Valider les items du menu "Format" 
	      //
	      barreMenus= hamecon.getBarreMenus();
	      itemsFichier= ((BarreMenusSaisieTexte)barreMenus).getItemsFormat();
	     
	      //--Affichage de la fenêtre de Police
	      new FenetrePolice();
	   }       
}
