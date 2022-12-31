package fr.unice.notepad2013b.vue.martin.Notepad;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class FenetreRechercher extends Frame{
	private Panel         	panneauSupport;
	private TextField      	textSearch;
	private Button			boutonAnnuler;
	private Button			boutonOk;
	private Button			boutonSuivant;
	private Recherche 		r;
	
	public FenetreRechercher(Recherche r1){
		setSize(300,80);
		setTitle("Rechercher");
		setResizable(false);
		r=r1;
		
		// --- Mise en place du Panel
		panneauSupport = new Panel();
		add(panneauSupport);
		panneauSupport.setLayout(new GridLayout(2,3));
		
		// --- TextField pour la rechercher (textSearch)
		textSearch= new TextField("");
		textSearch.setForeground(Color.black);
		textSearch.setFont(new Font("Times Roman", Font.BOLD, 12));
		
		// --- ajout du Label et du TextField
		panneauSupport.add(new Label("Rechercher :"));
		panneauSupport.add(textSearch, "texte");
		
		// --- Bouton de la fenêtre
		boutonOk=new Button("OK");
		panneauSupport.add(boutonOk,"ok");
		boutonAnnuler=new Button("Annuler");
		panneauSupport.add(boutonAnnuler,"annuler");
		boutonSuivant=new Button("Suivant");
		panneauSupport.add(boutonSuivant,"Suivant");
		
		// --- listener bouton annuler
		boutonAnnuler.addActionListener(new EcouteurBoutonAnnuler());
		boutonOk.addActionListener(new EcouteurItemBoutonOk());
		boutonSuivant.addActionListener(new EcouteurBoutonSuivant());
		
		
		setVisible(true);
		addWindowListener (new WindowAdapter () {	
		      public void windowClosing (WindowEvent e) {setVisible(false);}
		 });
	}
	
	public String getTextField(){
		return this.textSearch.getText();
	}


private class EcouteurItemBoutonOk implements ActionListener{
	public void actionPerformed (ActionEvent e){
		r.setPattern(textSearch);
		int[] occurence = r.find();

		if (occurence.length>0){
			r.getTexte().select(occurence[0], occurence[0]+r.getPatternlen());
		}// -- MARCHE PAS U_U
		else{ // fenetre de dialogue qui signale l'absence d'occurence
			// ... à compléter
		}
	}
}

private class EcouteurBoutonAnnuler implements ActionListener{
	public void actionPerformed (ActionEvent e){
		setVisible(false);
	}
}

private class EcouteurBoutonSuivant implements ActionListener{
	public void actionPerformed (ActionEvent e){
//		if(r.getPattern() != null){
			int[] occurence = r.find();
			if(occurence[r.getCount()+1]!=-1){
				r.incCount();
				r.getTexte().select(occurence[r.getCount()], occurence[r.getCount()]+r.getPatternlen());
			}
			else{ // on arrive à la fin du tableau, on recommance du début
				r.setCount(0);
				r.getTexte().select(occurence[0], occurence[0]+r.getPatternlen());
			}
//		}
//		else{
			// à compléter avec un fenetre de dialogue
//		}
	}
}
}