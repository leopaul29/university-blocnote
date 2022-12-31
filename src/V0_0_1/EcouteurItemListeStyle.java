/**
 *
 * La classe EcouteurItemListeStyle fournit un ensemble de services destinés à la 
 * gestion de la liste des styles de la fenetre Police de l'application FenetreSaisieTexte
 *
 * Les services fournis sont :
 * EcouteurItemListeStyle			: Créer un ecouteur de la ListeStyle
 * actionPerformed					: Modifier le champs text style par le style séléctionné
 * 
 * @author Leo-Paul MARTIN et Loïc Feuga
 *
**/
package fr.unice.notepad2013b.vue.feuga.Notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EcouteurItemListeStyle implements ActionListener {
	private FenetrePolice createur;

	
	
/**
 *
 * La méthode EcouteurItemListeStyle crée un ecouteur de la ListeStyle 
 * de la fenetre Police de l'application FenetreSaisieTexte
 * 
**/
	//--	Constructeur par défaut 
	public EcouteurItemListeStyle(FenetrePolice createur){
		this.createur = createur;
	}
	
	
	
/**
 *
 * La méthode actionPerformed permet modifier le champs text style par le style séléctionné
 * dans la liste de la fenetre police.
 * 
**/
	public void actionPerformed(ActionEvent e) {
		String select = createur.getListeStyle().getSelectedItem();
		createur.setZoneStyle(select);
		//createur.setFont();
	}

}
