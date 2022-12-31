package fr.unice.notepad2013b.vue.martin.Notepad;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EcouteurToucheTabPolice implements KeyListener{
FenetrePolice createur;	

	//--	Constructeur par défaut 
	public EcouteurToucheTabPolice(FenetrePolice createur){
		this.createur = createur;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_TAB){
			System.out.println("plop");
			
		}
			
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
