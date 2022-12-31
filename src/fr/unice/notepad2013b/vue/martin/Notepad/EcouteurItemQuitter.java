//
// IUT de Nice / Departement informatique / Module APO-Java
// Annee 2012_2013 - Package AWT
//
// Classe EcouteurItemQuitter : gestion de l'item "Quitter" de la barre de menus
//                              de l'application FenetreSaisieTexte
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
   
public class EcouteurItemQuitter implements ActionListener {
   	
   public void actionPerformed (ActionEvent e) {System.exit(0);}
} 
