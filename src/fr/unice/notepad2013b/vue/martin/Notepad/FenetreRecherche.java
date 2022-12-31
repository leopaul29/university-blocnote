package fr.unice.notepad2013b.vue.martin.Notepad;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class FenetreRecherche extends Frame{
	private Panel         	panneauSupport;
	private TextField      	textSearch;
	private Button			boutonAnnuler;
	private Button			boutonOk;
	private Button			boutonSuivant;
	private Recherche 		r;
	
	public FenetreRecherche(Recherche r1){
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
		boutonAnnuler.addActionListener(new EcouteurFenetreRechercheItemBoutonAnnuler(this));
		boutonOk.addActionListener(new EcouteurFenetreRechercheItemBoutonOk(this));
		boutonSuivant.addActionListener(new EcouteurFenetreRechercheItemBoutonSuivant(this));
		
		
		setVisible(true);
		addWindowListener (new WindowAdapter () {	
		      public void windowClosing (WindowEvent e) {setVisible(false);}
		 });
	}
	
	public TextField getTextField(){
		return this.textSearch;
	}
	
	public Recherche getRecherche(){
		return this.r;
	}
}