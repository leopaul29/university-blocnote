package V0_0_5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FenetrePolice extends Frame{
private Panel PanneauSupport;
private Panel PanneauHaut;
private Panel PanneauHaut1;
private Panel PanneauHaut2;
private Panel PanneauHaut3;
private Panel PanneauCentre;
private Panel PanneauCentre1;
private Panel PanneauCentre2;
private Panel PanneauBas;
private Panel PanneauBas1;
private Label TitrePolice;
private Label TitreSyle;
private Label TitreTaille;
private Label Echantillon;
private TextField ZonePolice;
private TextField ZoneStyle;
private TextField ZoneTaille;
private List ListePolice;
private List ListeStyle;
private List ListeTaille;
private String police_select;
private int style_select;
private int taille_select;
TextArea previous;
private EcouteurItemPolice createur;



	public FenetrePolice(EcouteurItemPolice createur){
		this.createur = createur;
		police_select = createur.getCreateur().getFont().getName();
		style_select = createur.getCreateur().getFont().getStyle();
		taille_select = createur.getCreateur().getFont().getSize();
	      setSize(450, 500);
	      setTitle ("Police");
	      setResizable(false);
	      setVisible(true);
	      
	      //on récupère les polices dans un tableau
	      String [] polices =Toolkit.getDefaultToolkit().getFontList();
	      
	      PanneauSupport = new Panel();
	      PanneauSupport.setBackground(Color.getHSBColor(187,200,225));
	      add(PanneauSupport);
	      PanneauSupport.setLayout(new GridLayout(3,1,0,5));
	      
	      PanneauHaut = new Panel();	  
	      PanneauHaut.setBackground(Color.getHSBColor(187,200,225));
	      PanneauSupport.add(PanneauHaut);
	      PanneauCentre = new Panel();
	      PanneauCentre.setBackground(Color.getHSBColor(150,200,225));
	      PanneauSupport.add(PanneauCentre);
	      PanneauBas = new Panel();
	      PanneauBas.setBackground(Color.getHSBColor(187,200,225));
	      PanneauSupport.add(PanneauBas);
	      PanneauHaut.setLayout(new GridLayout(1,3,0,5));
	      
	      //Panel en haut à gauche
	      PanneauHaut1=new Panel();
	      PanneauHaut.add(PanneauHaut1);
	      TitrePolice=new Label("Police :"); // Label(String,alignement'int')
	     
	      PanneauHaut1.add(TitrePolice);
	      ZonePolice=new TextField(10); // La petite textArea
	      PanneauHaut1.add(ZonePolice);
	      ListePolice=new List(6);		// La zone contenant les polices
	      PanneauHaut1.add(ListePolice);
	      
	      //Panel en haut au centre 
	      PanneauHaut2=new Panel();
	      PanneauHaut.add(PanneauHaut2);
	      TitreSyle=new Label("Style de police :");
	      PanneauHaut2.add(TitreSyle);
	      ZoneStyle=new TextField(10);
	      PanneauHaut2.add(ZoneStyle);
	      ListeStyle=new List(6);
	      PanneauHaut2.add(ListeStyle);
	      
	      //Panel en haut à droite
	      PanneauHaut3=new Panel();
	      PanneauHaut.add(PanneauHaut3);
	      TitreTaille=new Label("Taille :");
	      PanneauHaut3.add(TitreTaille);
	      ZoneTaille=new TextField(10);
	      PanneauHaut3.add(ZoneTaille);
	      ListeTaille=new List(6);
	      PanneauHaut3.add(ListeTaille);
	      
	      //On remplis la zone de la police 
	      for (int j = 0; j < polices.length ; j++){
	    	  ListePolice.add(polices[j]);
	      }
	      
	      
	      //On remplis la zone du style
	      ListeStyle.add("Normal");
	      ListeStyle.add("Italique");
	      ListeStyle.add("Gras");
	      ListeStyle.add("Oblique Gras");
	      
	      //on remplis la zone de la taille
	      for(int i = 8; i<73;i++){
	    	  ListeTaille.add(""+i);
	    	  if(i<12 && i > 7) {}
	    	  else if(i>11 && i<28){i++;}
	    	  else if(i>27 && i<36){i = 35;}
	    	  else if(i == 36){i =47;}
	    	  else if(i==48){i=71;}
	      }
	      
	      
	      
	      //Définition des écouteurs 
	  
	      ListePolice.addActionListener(new EcouteurItemListePolice(this));
	      ListeStyle.addActionListener(new EcouteurItemListeStyle(this));
	      ListeTaille.addActionListener(new EcouteurItemListeTaille(this));
	      
	      
	      
	      //Définition du panel du milieu
	     
	      previous = new TextArea("\n\tAaBbCc",8,30,3); // 3 = SCROLLBARS_NONE
	      //previous.getText().CENTER; chercher à centrer le texte en hauteur et lageur
	      // place du texte en fonction de la taille choisi
	      
	      
	      previous.setEditable(false);
	      PanneauCentre.setLayout(new GridLayout(1,2));
	      PanneauCentre1=new Panel();
	      PanneauCentre.add(PanneauCentre1);
	      PanneauCentre2=new Panel();
	      PanneauCentre.add(PanneauCentre2);
	      Echantillon=new Label("Échantillon :");
	      PanneauCentre2.add(Echantillon);
	      PanneauCentre2.add(previous);
	      
	      //Création du panneauBas
	      PanneauBas.setLayout(new GridLayout(3,3));
	      Button cancel = new Button("Annuler");
	      Button ok = new Button("Ok");
	      
	      //Ajout d'un écouteur anonyme sur le bouton Annuler
	      cancel.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent arg0) {dispose();}
	      }
	      );
	      
	      //Ajout d'un écouteur  sur le textField Police
	      ZonePolice.addTextListener(new EcouteurItemTextPolice(this));
	      
	      //Ajout d'un écouteur sur le textField Taille
	      ZoneTaille.addTextListener(new EcouteurItemTextTaille(this));
	      
	      //Ajout d'un écouteur sur le textField Style*
	      ZoneStyle.addTextListener(new EcouteurItemTextStyle(this));
	      
	      //Ajout d'un écouteur anonyme sur le bouton OK
	      ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Font lefont = new Font(getPolice(),getStyle(),getTaille());
				getCreateur().getCreateur().getZoneAffichage().setFont(lefont);
				dispose();
			}
		});
	      
	      
	     PanneauBas.add(new Panel());
	     PanneauBas.add(new Panel()); 
	     PanneauBas.add(new Panel()); 
	     PanneauBas.add(new Panel()); 
	     PanneauBas.add(new Panel());
	     PanneauBas.add(new Panel());
	     PanneauBas.add(new Panel());
	     PanneauBas.add(new Panel());
	     PanneauBas1=new Panel();
	     PanneauBas1.setLayout(new GridLayout(1,2,10,20));
	     PanneauBas.add(PanneauBas1);
	     PanneauBas1.add(ok);
	     PanneauBas1.add(cancel);
	     
	      // Quand on clique sur la croix rouge
	      //
	      addWindowListener (new WindowAdapter () {	
	          public void windowClosing (WindowEvent e) {dispose();}
	         });
	}
	
	//-- Accesseur nouveaux
	public String getPolice(){return police_select;}
	public int getTaille(){return taille_select;}
	public int getStyle(){ return style_select;}
	public void setPolice(String police){
		police_select = police;
		setFont();
	}
	public void setTaille(int taille){
		taille_select = taille;
		Font lefont = new Font(getPolice(),getStyle(),taille_select);
		previous.setFont(lefont);
		setFont();
	}
	
	public void setStyle(String style){
		if(style == "Normal" ){style_select = Font.PLAIN;}
		else if(style == "Italique"){style_select = Font.ITALIC;}
		else if(style == "Gras"){style_select = Font.BOLD;}
		else if(style == "Italique gras"){style_select = Font.ITALIC | Font.BOLD;}
		setFont();
	}
	
	public void setFont(){
		Font lefont = new Font(getPolice(),getStyle(),12);
		ListePolice.setFont(lefont);
		ZonePolice.setFont(lefont);
		ZoneStyle.setFont(lefont);
		ListeStyle.setFont(lefont);
		lefont = new Font(getPolice(),getStyle(),taille_select);
		previous.setFont(lefont);
		
	}
	
	//--	Quelques accesseurs
	public TextField getZonePolice() {return ZonePolice;}
	public void setZonePolice(TextField zonePolice) {ZonePolice = zonePolice;}
	public void setZonePolice(String texte){ZonePolice.setText(texte); setPolice(texte);}
	public TextField getZoneStyle() {return ZoneStyle;}
	public void setZoneStyle(TextField zoneStyle) {ZoneStyle = zoneStyle; }
	public void setZoneStyle(String texte){ZoneStyle.setText(texte); setStyle(texte);}
	public TextField getZoneTaille() {return ZoneTaille;}
	public void setZoneTaille(TextField zoneTaille) {ZoneTaille = zoneTaille;}
	public void setZoneTaille(String texte){ZoneTaille.setText(texte); setTaille(Integer.valueOf(texte));}
	public List getListePolice() {return ListePolice;}
	public void setListePolice(List listePolice) {ListePolice = listePolice;}
	public List getListeStyle() {return ListeStyle;}
	public void setListeStyle(List listeStyle) {ListeStyle = listeStyle;}
	public List getListeTaille() {return ListeTaille;}
	public void setListeTaille(List listeTaille) {ListeTaille = listeTaille;}

	public EcouteurItemPolice getCreateur() {
	return createur;
}

public void setCreateur(EcouteurItemPolice createur) {
	this.createur = createur;
}

	public static void main(String[] args) {
	     new FenetreSaisieTexte().setVisible(true);	
	}
	   
}