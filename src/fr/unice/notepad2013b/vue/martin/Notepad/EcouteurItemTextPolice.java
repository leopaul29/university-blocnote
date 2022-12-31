package fr.unice.notepad2013b.vue.martin.Notepad;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.JPanel;

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
			if(createur.getListePolice().getItem(i).matches("^"+createur.getZonePolice().getText() + ".*$") 
					&& !createur.getZonePolice().getText().equals("")
					&& !createur.getListePolice().getItem(i).equals(createur.getZonePolice().getText())){
			
				createur.getListePolice().select(i);
				
			}	
		}
		createur.setFont();
		
	}
	

}
