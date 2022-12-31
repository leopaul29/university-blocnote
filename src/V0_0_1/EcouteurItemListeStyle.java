/**
 *
 * La classe EcouteurItemListeStyle fournit un ensemble de services destin�s � la 
 * gestion de la liste des styles de la fenetre Police de l'application FenetreSaisieTexte
 *
 * Les services fournis sont :
 * EcouteurItemListeStyle			: Cr�er un ecouteur de la ListeStyle
 * actionPerformed					: Modifier le champs text style par le style s�l�ctionn�
 * 
 * @author Leo-Paul MARTIN et Lo�c Feuga
 *
**/
package fr.unice.notepad2013b.vue.feuga.Notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EcouteurItemListeStyle implements ActionListener {
	private FenetrePolice createur;

	
	
/**
 *
 * La m�thode EcouteurItemListeStyle cr�e un ecouteur de la ListeStyle 
 * de la fenetre Police de l'application FenetreSaisieTexte
 * 
**/
	//--	Constructeur par d�faut 
	public EcouteurItemListeStyle(FenetrePolice createur){
		this.createur = createur;
	}
	
	
	
/**
 *
 * La m�thode actionPerformed permet modifier le champs text style par le style s�l�ctionn�
 * dans la liste de la fenetre police.
 * 
**/
	public void actionPerformed(ActionEvent e) {
		String select = createur.getListeStyle().getSelectedItem();
		createur.setZoneStyle(select);
		//createur.setFont();
	}

}
