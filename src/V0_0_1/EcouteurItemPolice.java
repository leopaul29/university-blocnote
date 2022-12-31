/**
 *
 * La classe EcouteurItemPolice fournit un ensemble de services destinés à la 
 * gestion de l'item "Police" de la barre de menus de l'application FenetreSaisieTexte
 *
 * Les services fournis sont :
 * EcouteurItemPolice			: Créer un ecouteur de l'item "Police" .
 * actionPerformed 				: Créer une fenetre permettant de gerer la font de l'application 
 * 									FenetreSaisieTexte quand l'item "Police" est cliqué.
 * getCreateur					: Recuperer les données de l'application FenetreSaisieTexte.
 * setCreateur					: Modifier les données de l'application FenetreSaisieTexte.
 *
 * @author Leo-Paul MARTIN et Loïc Feuga
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
 * La méthode EcouteurItemPolice crée un ecouteur de l'item "Police" 
 * de la barre de menus de l'application FenetreSaisieTexte
 * 
**/
	public EcouteurItemPolice(FenetreSaisieTexte createur) {
	   	
	      this.createur= createur;
	   }
	   
	   
	   
/**
 *
 * La méthode actionPerformed permet de créer une fenetre permettant de gerer la font de 
 * l'application FenetreSaisieTexte quand l'item "Police" est cliqué.
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
	     
	      //--Affichage de la fenêtre de Police
	      FenetrePolice fp1 = new FenetrePolice(this);
	   }       
	   
	   
/**
 *
 * La méthode getCreateur permet de récupérer les caractéristiques de la font de l'application FenetreSaisieTexte .
 * 
**/
	   public FenetreSaisieTexte getCreateur() {
		return createur;
	}


/**
 *
 * La méthode getCreateur permet de modifier les caractéristiques de la font de l'application FenetreSaisieTexte .
 * 
**/
	public void setCreateur(FenetreSaisieTexte createur) {
		this.createur = createur;
	}
}
