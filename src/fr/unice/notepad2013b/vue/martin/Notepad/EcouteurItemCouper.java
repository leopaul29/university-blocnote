package fr.unice.notepad2013b.vue.martin.Notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EcouteurItemCouper implements ActionListener {

	FenetreSaisieTexte hamecon;	
	String selectedText;

	public EcouteurItemCouper(FenetreSaisieTexte hamecon) {
	   	
	      this.hamecon= hamecon;
	      selectedText = new String();
	      
	   }
	
	public void actionPerformed (ActionEvent e) {
		
		if((!hamecon.getZoneAffichage().getSelectedText().equals(null))||(!hamecon.getZoneAffichage().getSelectedText().equals(""))){
			selectedText = hamecon.getZoneAffichage().getSelectedText();
			hamecon.setPressePapier(selectedText);
			hamecon.getZoneAffichage().replaceRange("",hamecon.getZoneAffichage().getSelectionStart(),hamecon.getZoneAffichage().getSelectionEnd());
			hamecon.setSaveStatus(false);
		}
	}

}
