package V0_0_5;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class EcouteurItemTextTaille implements TextListener {
	private FenetrePolice createur;

	//--	Constructeur par défaut 
	public EcouteurItemTextTaille(FenetrePolice createur){
		this.createur = createur;
	}

	@Override
	public void textValueChanged(TextEvent arg0) {
		createur.setTaille(Integer.valueOf(createur.getZoneTaille().getText()));
		createur.setFont();
		
	}
	

}
