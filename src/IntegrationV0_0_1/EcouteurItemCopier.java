package IntegrationV0_0_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EcouteurItemCopier implements ActionListener {

	FenetreSaisieTexte hamecon;	
	String selectedText;

	public EcouteurItemCopier(FenetreSaisieTexte hamecon) {
	   	
	      this.hamecon= hamecon;
	      selectedText = new String();
	   }
	public void actionPerformed (ActionEvent e) {
		
		if((hamecon.getZoneAffichage().getSelectedText()!=null && hamecon.getZoneAffichage().getSelectedText()!="")){
			selectedText = hamecon.getZoneAffichage().getSelectedText();
			hamecon.setPressePapier(selectedText);
		}
	}

}
