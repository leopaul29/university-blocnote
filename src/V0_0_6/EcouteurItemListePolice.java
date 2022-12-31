package V0_0_6;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurItemListePolice implements ActionListener {
	private FenetrePolice createur;

	//--	Constructeur par défaut 
	public EcouteurItemListePolice(FenetrePolice createur){
		this.createur = createur;
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		//int index = createur.getListePolice().getSelectedIndex(); 
		//String select = createur.getListePolice().getItem(index);
		String select = createur.getListePolice().getSelectedItem();
		//System.out.println(" le select : " + select);
		createur.setZonePolice(select);
		//createur.setFont();
	}

}
