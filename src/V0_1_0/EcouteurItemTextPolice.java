/**
 *
 * La classe EcouteurItemTextPolice fournit un ensemble de services destin�s � 
 * recup�rer la police utilis� dans la zone de texte au dessus de la liste des 
 * polices.
 *
 * Les services fournis sont :
 * EcouteurItemTextPolice			: Cr�er un ecouteur de la zone de texte 
 * textValueChanged					: Permet de changer la zone de texte par 
 *										par rapport � la liste.
 *
 * @author Leo-Paul MARTIN et Lo�c Feuga
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
 * La m�thode EcouteurItemTextPolice cr�e un ecouteur de la zone de texte 
 * avec la FenetrePolice comme param�tre.
 * 
**/
	//--	Constructeur par d�faut 
	public EcouteurItemTextPolice(FenetrePolice createur){
		this.createur = createur;
	}

/**
 *
 * La m�thode textValueChanged permet de changer la zone de texte en fonction de se qu'on ecrit dedans.
 * Si on ecrit une premi�re lettre et que cette lettre et la premi�re d'un composant de la liste,
 * alors il est s�l�ctionn�.
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
