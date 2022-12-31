//
// IUT de Nice / Departement informatique / Module APO-Java
// Annee 2012_2013 - Package AWT
//
// Classe MenuFichier : creation du dictionnaire de configuration du menu
//                      "Fichier" de l'application FenetreSaisieTexte
//
// Edition A 	: externalisation depuis la classe d'origine
//
//    + Version 1.0.0	: version initiale
//
// Auteur : A. Thuaire
//
package fr.unice.notepad2013b.vue.martin.Notepad;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class MenuFichier {
private LinkedHashMap config;
   	
   // ---                                              Constructeur par defaut
   
   public MenuFichier() {config= new LinkedHashMap();}
   
   // ---                                                         Methode load  
   	  
   public LinkedHashMap load() {
   	  	
	   config = new LinkedHashMap();
	   config.put("Nouveau",new Boolean(true));
	   config.put("Ouvrir...",new Boolean(true));
	   config.put("Enregistrer",new Boolean(true));
	   config.put("Enregistrer sous...",new Boolean(true));
	   config.put("-",null);
	   config.put("Mise en page...",new Boolean(false));
	   config.put("Imprimer...",new Boolean(false));
	   config.put("--",null);
	   config.put("Quitter",new Boolean(true));
         
      return config;
   } 
}    
