/**
 *
 * La classe EcouteurItemListePolice fournit un ensemble de services destin�s � la 
 * gestion de la liste des police de la fenetre Police de l'application FenetreSaisieTexte
 *
 * Les services fournis sont :
 * EcouteurItemListePolice			: Cr�er un ecouteur de la ListePolice 
 * actionPerformed					: Modifier le champs text police par la police s�l�ctionn�
 * 
 * @author Leo-Paul MARTIN et Lo�c Feuga
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
 * La m�thode EcouteurItemListePolice cr�e un ecouteur de la ListePolice 
 * de la fenetre Police de l'application FenetreSaisieTexte
 * 
**/
	//--	Constructeur par d�faut 
	public EcouteurItemListePolice(FenetrePolice createur){
		this.createur = createur;
	}
	
	
/**
 *
 * La m�thode actionPerformed permet modifier le champs text police par la police s�l�ctionn�
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
