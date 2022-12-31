package V0_0_5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurItemListeTaille implements ActionListener {
	private FenetrePolice createur;

	//--	Constructeur par défaut 
	public EcouteurItemListeTaille(FenetrePolice createur){
		this.createur = createur;
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		String select = createur.getListeTaille().getSelectedItem();
		createur.setZoneTaille(select);
		//createur.setFont();
	}
}
