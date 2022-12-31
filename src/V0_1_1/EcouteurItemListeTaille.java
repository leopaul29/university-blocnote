/**
 *
 * La classe EcouteurItemListeTaille fournit un ensemble de services destin�s � la 
 * gestion de la liste des taille de la fenetre Police de l'application FenetreSaisieTexte
 *
 * Les services fournis sont :
 * EcouteurItemListeTaille			: Cr�er un ecouteur de la ListeTaille
 * actionPerformed					: Modifier le champs text style par la taille s�l�ctionn�
 * 
 * @author Leo-Paul MARTIN et Lo�c Feuga
 *
**/package V0_1_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurItemListeTaille implements ActionListener {
	private FenetrePolice createur;

	
	
/**
 *
 * La m�thode EcouteurItemListeTaille cr�e un ecouteur de la ListeTaille 
 * de la fenetre Police de l'application FenetreSaisieTexte
 * 
**/
	//--	Constructeur par d�faut 
	public EcouteurItemListeTaille(FenetrePolice createur){
		this.createur = createur;
	}
	
	
/**
 *
 * La m�thode actionPerformed permet modifier le champs text taille par la taille s�l�ctionn�
 * dans la liste de la fenetre police.
 * 
**/
	public void actionPerformed(ActionEvent e) {
		String select = createur.getListeTaille().getSelectedItem();
		createur.setZoneTaille(select);
		//createur.setFont();
	}
}
