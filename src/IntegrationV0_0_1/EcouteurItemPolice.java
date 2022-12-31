package IntegrationV0_0_1;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class EcouteurItemPolice implements ActionListener {
	FenetreSaisieTexte createur;	
	
	 

	public EcouteurItemPolice(FenetreSaisieTexte createur) {
	   	
	      this.createur= createur;
	   }
	   
	   // ---                                                  Ecouteur clic souris
	   
	   public void actionPerformed (ActionEvent e) {
	   MenuBar       barreMenus;
	   TextArea      zoneAffichage;
	   LinkedHashMap itemsFichier;
	   
	      // --- Valider la zone d'affichage 
	      //
	      zoneAffichage= createur.getZoneAffichage(); 
	      
	      // --- Valider les items du menu "Format" 
	      //
	      barreMenus= createur.getBarreMenus();
	      itemsFichier= ((BarreMenusSaisieTexte)barreMenus).getItemsFormat();
	     
	      //--Affichage de la fenêtre de Police
	      FenetrePolice fp1 = new FenetrePolice(this);
	   }       
	   
	   

	   public FenetreSaisieTexte getCreateur() {
		return createur;
	}

	public void setCreateur(FenetreSaisieTexte createur) {
		this.createur = createur;
	}
}
