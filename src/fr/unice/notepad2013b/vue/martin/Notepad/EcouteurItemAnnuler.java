package fr.unice.notepad2013b.vue.martin.Notepad;




//
//IUT de Nice / Departement informatique / Module APO-Java
//Annee 2012_2013 - Package AWT
//
//Classe EcouteurItemNouveau : gestion de l'item "Nouveau" de la barre de menus
//                           de l'application FenetreSaisieTexte
//
//Edition A 	: externalisation depuis la classe d'origine
//
// + Version 1.0.0	: version initiale
//
//Auteur : A. Thuaire
//

import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class EcouteurItemAnnuler implements ActionListener {
	

FenetreSaisieTexte hamecon;	
	
// ---                                                   Constructeur normal

public EcouteurItemAnnuler(FenetreSaisieTexte hamecon) {
	
   this.hamecon= hamecon;
}

// ---                                                  Ecouteur clic souris

public void actionPerformed (ActionEvent e) {
	
			TextArea      zoneAffichage;	        
	        zoneAffichage = hamecon.getZoneAffichage();
	        String Chaine;
	        int nb;
	        
	        Chaine = zoneAffichage.getText();
	        
	        nb = Chaine.length();
	        
	        String test2 = Chaine.substring(0,nb-1);
	        
	        zoneAffichage.setText(test2);  	      
	        
}	
}                	

