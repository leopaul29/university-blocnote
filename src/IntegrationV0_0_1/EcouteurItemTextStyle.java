package IntegrationV0_0_1;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class EcouteurItemTextStyle implements TextListener {
	private FenetrePolice createur;

	//--	Constructeur par défaut 
	public EcouteurItemTextStyle(FenetrePolice createur){
		this.createur = createur;
	}

	@Override
	public void textValueChanged(TextEvent arg0) {
		for(int i = 0 ; i < createur.getListeStyle().getItemCount() ; i++){
			
			
			if(createur.getListeStyle().getItem(i).matches("^"+createur.getZoneStyle().getText() + ".*") 
					&& !createur.getZoneStyle().getText().equals("")
					&& !createur.getListeStyle().getItem(i).equals(createur.getZoneStyle().getText())){
				
				createur.getListeStyle().select(i);
			}else{}
		}
		
		createur.setFont();
		
	}
	

}
