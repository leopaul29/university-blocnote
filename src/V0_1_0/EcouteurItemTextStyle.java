/**
 *
 * La classe EcouteurItemTextStyle fournit un ensemble de services destinés à 
 * recupérer le style utilisé dans la zone de texte au dessus de la liste des 
 * styles.
 *
 * Les services fournis sont :
 * EcouteurItemTextStyle			: Créer un ecouteur de la zone de texte 
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

public class EcouteurItemTextStyle implements TextListener {
	private FenetrePolice createur;

/**
 *
 * La méthode EcouteurItemTextPolice crée un ecouteur de la zone de texte 
 * avec la FenetrePolice comme paramètre.
 * 
**/
	//--	Constructeur par défaut 
	public EcouteurItemTextStyle(FenetrePolice createur){
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
