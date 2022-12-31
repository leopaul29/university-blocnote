package fr.unice.notepad2013b.vue.martin.Notepad;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class EcouteurFenetreRechercheItemBoutonSuivant implements ActionListener{
	FenetreRecherche hamecon;
	
	public EcouteurFenetreRechercheItemBoutonSuivant(FenetreRecherche hamecon1){
		this.hamecon=hamecon1;
	}
	
	public void actionPerformed(ActionEvent e){
		if(hamecon.getRecherche().getPattern() != null){
			int[] occurence = hamecon.getRecherche().find();
			if(occurence[hamecon.getRecherche().getCount()+1]!=-1){
				hamecon.getRecherche().incCount();
				hamecon.getRecherche().getTexte().select(occurence[hamecon.getRecherche().getCount()], occurence[hamecon.getRecherche().getCount()]+hamecon.getRecherche().getPatternlen());
			}
			else{ // on arrive à la fin du tableau, on recommance du début
				hamecon.getRecherche().setCount(0);
				hamecon.getRecherche().getTexte().select(occurence[0], occurence[0]+hamecon.getRecherche().getPatternlen());
			}
		}
		else{
			new Alert("Aucun pattern n'a été rentré.");
		}
	}
	
}
