package fr.unice.notepad2013b.vue.martin.Notepad;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class EcouteurFenetreRechercheItemBoutonAnnuler implements ActionListener{
	private FenetreRecherche hamecon;
	
	public EcouteurFenetreRechercheItemBoutonAnnuler(FenetreRecherche hamecon1){
		this.hamecon=hamecon1;
	}
	
	public void actionPerformed(ActionEvent e){
		hamecon.setVisible(false);
	}
	
}
