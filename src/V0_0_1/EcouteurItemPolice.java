/**
 *
 * La classe EcouteurItemPolice fournit un ensemble de services destin�s � la 
 * gestion de l'item "Police" de la barre de menus de l'application FenetreSaisieTexte
 *
 * Les services fournis sont :
 * EcouteurItemPolice			: Cr�er un ecouteur de l'item "Police" .
 * actionPerformed 				: Cr�er une fenetre permettant de gerer la font de l'application 
 * 									FenetreSaisieTexte quand l'item "Police" est cliqu�.
 * getCreateur					: Recuperer les donn�es de l'application FenetreSaisieTexte.
 * setCreateur					: Modifier les donn�es de l'application FenetreSaisieTexte.
 *
 * @author Leo-Paul MARTIN et Lo�c Feuga
 *
**/
package fr.unice.notepad2013b.vue.feuga.Notepad;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class EcouteurItemPolice implements ActionListener {
	FenetreSaisieTexte createur;	
	
	 
/**
 *
 * La m�thode EcouteurItemPolice cr�e un ecouteur de l'item "Police" 
 * de la barre de menus de l'application FenetreSaisieTexte
 * 
**/
	public EcouteurItemPolice(FenetreSaisieTexte createur) {
	   	
	      this.createur= createur;
	   }
	   
	   
	   
/**
 *
 * La m�thode actionPerformed permet de cr�er une fenetre permettant de gerer la font de 
 * l'application FenetreSaisieTexte quand l'item "Police" est cliqu�.
 * 
**/
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
	     
	      //--Affichage de la fen�tre de Police
	      FenetrePolice fp1 = new FenetrePolice(this);
	   }       
	   
	   
/**
 *
 * La m�thode getCreateur permet de r�cup�rer les caract�ristiques de la font de l'application FenetreSaisieTexte .
 * 
**/
	   public FenetreSaisieTexte getCreateur() {
		return createur;
	}


/**
 *
 * La m�thode getCreateur permet de modifier les caract�ristiques de la font de l'application FenetreSaisieTexte .
 * 
**/
	public void setCreateur(FenetreSaisieTexte createur) {
		this.createur = createur;
	}
}
