package V0_0_4;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class EcouteurItemTextPolice implements TextListener {
	private FenetrePolice createur;

	//--	Constructeur par défaut 
	public EcouteurItemTextPolice(FenetrePolice createur){
		this.createur = createur;
	}

	@Override
	public void textValueChanged(TextEvent arg0) {
		//System.out.println("Police modif");
		for(int i = 0 ; i < createur.getListePolice().getItemCount() ; i++){
			//System.out.println("test de :"+createur.getListePolice().getItem(i));
			//System.out.println("sur : " +createur.getZonePolice().getText());
			//System.out.println(createur.getListePolice().getItem(i).matches("^"+createur.getZonePolice().getText() + ".*"));
			if(createur.getListePolice().getItem(i).matches("^"+createur.getZonePolice().getText() + ".*") 
					&& !createur.getZonePolice().getText().equals("")
					&& !createur.getListePolice().getItem(i).equals(createur.getZonePolice().getText())){
				createur.getZonePolice().setText(createur.getListePolice().getItem(i));
				createur.setPolice(createur.getListePolice().getItem(i));
			}
		}
		createur.setFont();
		
	}
	

}
