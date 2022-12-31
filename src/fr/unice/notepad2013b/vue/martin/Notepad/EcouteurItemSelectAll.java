package fr.unice.notepad2013b.vue.martin.Notepad;

import java.awt.event.ActionEvent;
import java.awt.FileDialog;
import java.awt.event.ActionListener;
import java.util.*;


public class EcouteurItemSelectAll implements ActionListener{

	FenetreSaisieTexte hamecon;	

	public EcouteurItemSelectAll (FenetreSaisieTexte hamecon) {
	   	
	      this.hamecon= hamecon;
	   }
	public void actionPerformed (ActionEvent e) {
		
		hamecon.getZoneAffichage().selectAll();
		
		
		
	}

}
