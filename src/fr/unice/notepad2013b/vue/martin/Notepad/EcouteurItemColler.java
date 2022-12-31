package fr.unice.notepad2013b.vue.martin.Notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EcouteurItemColler implements ActionListener {

	
	FenetreSaisieTexte hamecon;	
	String pressePapier;
	

	public EcouteurItemColler(FenetreSaisieTexte hamecon) {
	   	
			this.hamecon= hamecon;
	      
	      
	   }
	
	public void actionPerformed (ActionEvent e) {
		
		if(!hamecon.getPressePapier().equals(null));{
			pressePapier = new String(hamecon.getPressePapier());
			if(hamecon.getZoneAffichage().getSelectedText()!=null)
				hamecon.getZoneAffichage().replaceRange("",hamecon.getZoneAffichage().getSelectionStart(),hamecon.getZoneAffichage().getSelectionEnd());
			hamecon.getZoneAffichage().insert(pressePapier, hamecon.getZoneAffichage().getCaretPosition());
			hamecon.setSaveStatus(false);
		}
	}
}
