/**
 *
 * La classe EcouteurItemListePolice fournit un ensemble de services destinés à la 
 * gestion de la liste des police de la fenetre Police de l'application FenetreSaisieTexte
 *
 * Les services fournis sont :
 * EcouteurItemListePolice			: Créer un ecouteur de la ListePolice 
 * actionPerformed					: Modifier le champs text police par la police séléctionné
 * 
 * @author Leo-Paul MARTIN et Loïc Feuga
 *
**/
package V0_1_1;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurItemListePolice implements ActionListener {
	private FenetrePolice createur;

/**
 *
 * La méthode EcouteurItemListePolice crée un ecouteur de la ListePolice 
 * de la fenetre Police de l'application FenetreSaisieTexte
 * 
**/
	//--	Constructeur par défaut 
	public EcouteurItemListePolice(FenetrePolice createur){
		this.createur = createur;
	}
	
	
/**
 *
 * La méthode actionPerformed permet modifier le champs text police par la police séléctionné
 * dans la liste de la fenetre police.
 * 
**/
	public void actionPerformed(ActionEvent e) {
		//int index = createur.getListePolice().getSelectedIndex(); 
		//String select = createur.getListePolice().getItem(index);
		String select = createur.getListePolice().getSelectedItem();
		//System.out.println(" le select : " + select);
		createur.setZonePolice(select);
		//createur.setFont();
	}

}
