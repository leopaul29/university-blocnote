package IntegrationV0_0_1;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class EcouteurFenetreRechercheItemBoutonOk implements ActionListener{
	FenetreRecherche hamecon;
	
	public EcouteurFenetreRechercheItemBoutonOk(FenetreRecherche hamecon1){
		this.hamecon=hamecon1;
	}
	
	public void actionPerformed(ActionEvent e){
		hamecon.getRecherche().setPattern(hamecon.getTextField());
		int[] occurence = hamecon.getRecherche().find();

		if (occurence[0] != -1){
			hamecon.getRecherche().getTexte().select(occurence[0], occurence[0]+hamecon.getRecherche().getPatternlen());
		}
		else{
			new Alert("Le pattern n'a pas été trouvé");
		}
	}

}
