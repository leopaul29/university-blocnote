/**
 *
 * La classe EcouteurItemListeTaille fournit un ensemble de services destinés à la 
 * gestion de la liste des taille de la fenetre Police de l'application FenetreSaisieTexte
 *
 * Les services fournis sont :
 * EcouteurItemListeTaille			: Créer un ecouteur de la ListeTaille
 * actionPerformed					: Modifier le champs text style par la taille séléctionné
 * 
 * @author Leo-Paul MARTIN et Loïc Feuga
 *
**/package V0_1_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurItemListeTaille implements ActionListener {
	private FenetrePolice createur;

	
	
/**
 *
 * La méthode EcouteurItemListeTaille crée un ecouteur de la ListeTaille 
 * de la fenetre Police de l'application FenetreSaisieTexte
 * 
**/
	//--	Constructeur par défaut 
	public EcouteurItemListeTaille(FenetrePolice createur){
		this.createur = createur;
	}
	
	
/**
 *
 * La méthode actionPerformed permet modifier le champs text taille par la taille séléctionné
 * dans la liste de la fenetre police.
 * 
**/
	public void actionPerformed(ActionEvent e) {
		String select = createur.getListeTaille().getSelectedItem();
		createur.setZoneTaille(select);
		//createur.setFont();
	}
}
