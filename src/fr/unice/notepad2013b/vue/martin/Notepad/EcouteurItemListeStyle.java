package fr.unice.notepad2013b.vue.martin.Notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EcouteurItemListeStyle implements ActionListener {
	private FenetrePolice createur;

	//--	Constructeur par d?faut 
	public EcouteurItemListeStyle(FenetrePolice createur){
		this.createur = createur;
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		String select = createur.getListeStyle().getSelectedItem();
		createur.setZoneStyle(select);
		//createur.setFont();
	}

}
