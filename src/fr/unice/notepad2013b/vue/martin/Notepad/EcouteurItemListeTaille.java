package fr.unice.notepad2013b.vue.martin.Notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurItemListeTaille implements ActionListener {
	private FenetrePolice createur;

	//--	Constructeur par d�faut 
	public EcouteurItemListeTaille(FenetrePolice createur){
		this.createur = createur;
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		String select = createur.getListeTaille().getSelectedItem();
		createur.setZoneTaille(select);
		//createur.setFont();
	}
}
