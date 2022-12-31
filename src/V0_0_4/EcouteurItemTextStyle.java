package V0_0_4;

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
			//System.out.println("test de :"+createur.getListePolice().getItem(i));
			//System.out.println("sur : " +createur.getZonePolice().getText());
			//System.out.println(createur.getListePolice().getItem(i).matches("^"+createur.getZonePolice().getText() + ".*"));
			if(createur.getListeStyle().getItem(i).matches("^"+createur.getZoneStyle().getText() + ".*") 
					&& !createur.getZoneStyle().getText().equals("")
					&& !createur.getListeStyle().getItem(i).equals(createur.getZoneStyle().getText())){
				
				//createur.getZoneStyle().setText(createur.getListeStyle().getItem(i));
				createur.setZoneStyle(createur.getListeStyle().getSelectedItem());
			}
		}
		
		createur.setFont();
		
	}
	

}
