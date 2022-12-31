/**
 *
 * La classe EcouteurItemTextTaille fournit un ensemble de services destinés à 
 * recupérer la taille utilisé dans la zone de texte au dessus de la liste des 
 * tailles.
 *
 * Les services fournis sont :
 * EcouteurItemTextTaille			: Créer un ecouteur de la zone de texte 
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

public class EcouteurItemTextTaille implements TextListener {
	private FenetrePolice createur;

	
/**
 *
 * La méthode EcouteurItemTextTaille crée un ecouteur de la zone de texte 
 * avec la FenetrePolice comme paramètre.
 * 
**/

	//--	Constructeur par défaut 
	public EcouteurItemTextTaille(FenetrePolice createur){
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
		createur.setTaille(Integer.valueOf(createur.getZoneTaille().getText()));
		createur.setFont();
		
	}
	

}
