/**
 *
 * La classe EcouteurItemTextPolice fournit un ensemble de services destinés à 
 * recupérer la police utilisé dans la zone de texte au dessus de la liste des 
 * polices.
 *
 * Les services fournis sont :
 * EcouteurItemTextPolice			: Créer un ecouteur de la zone de texte 
 * textValueChanged					: Permet de changer la zone de texte par 
 *										par rapport à la liste.
 *
 * @author Leo-Paul MARTIN et Loïc Feuga
 *
**/
package V0_1_1;


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

/**
 *
 * La méthode EcouteurItemTextPolice crée un ecouteur de la zone de texte 
 * avec la FenetrePolice comme paramètre.
 * 
**/
	//--	Constructeur par défaut 
	public EcouteurItemTextPolice(FenetrePolice createur){
		this.createur = createur;
	}

/**
 *
 * La méthode textValueChanged permet de changer la zone de texte en fonction de se qu'on ecrit dedans.
 * Si on ecrit une première lettre et que cette lettre et la première d'un composant de la liste,
 * alors il est séléctionné.
 * 
**/
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
