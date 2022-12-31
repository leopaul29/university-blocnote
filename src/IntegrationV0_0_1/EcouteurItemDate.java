package IntegrationV0_0_1;




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


public class EcouteurItemDate implements ActionListener {
	

FenetreSaisieTexte hamecon;	
	
// ---                                                   Constructeur normal

public EcouteurItemDate(FenetreSaisieTexte hamecon) {
	
   this.hamecon= hamecon;
}

// ---                                                  Ecouteur clic souris

public void actionPerformed (ActionEvent e) {
	
			TextArea      zoneAffichage;
			
			GregorianCalendar d = new GregorianCalendar();

	        int heure = d.get(Calendar.HOUR_OF_DAY);
	        int min = d.get(Calendar.MINUTE);
			int mois = d.get(Calendar.MONTH) + 1;
	        int annee = d.get(Calendar.YEAR) ;
	        int aujourdhui = d.get(Calendar.DAY_OF_MONTH);
	        
	        zoneAffichage = hamecon.getZoneAffichage();
	        
	        zoneAffichage.append(heure + ":" + min + " " + aujourdhui + "." + mois + "." + annee) ;
	        
	
	        
}	
}                	

