package fr.unice.notepad2013b.vue.martin.Notepad;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class EcouteurItemRechercher implements ActionListener {
	
	FenetreSaisieTexte hamecon;
	
	public EcouteurItemRechercher(FenetreSaisieTexte hamecon) {
		
		   this.hamecon= hamecon;
	}
	
	public void actionPerformed (ActionEvent e) {
		Recherche r = new Recherche(hamecon);
		new FenetreRecherche(r);
	}

}
