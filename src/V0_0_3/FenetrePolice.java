package V0_0_3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class FenetrePolice extends Frame{
private Panel PanneauSupport;
private Panel PanneauHaut;
private Panel PanneauHaut1;
private Panel PanneauHaut2;
private Panel PanneauHaut3;

private Panel PanneauCentre;
private Panel PanneauBas;

private Label TitrePolice;
private Label TitreSyle;
private Label TitreTaille;

private TextField ZonePolice;
private TextField ZoneStyle;
private TextField ZoneTaille;

private List ListePolice;
private List ListeStyle;
private List ListeTaille;
	
	public FenetrePolice(){
	      setSize(450, 500);
	      setTitle ("Police");
	      setVisible(true);
	      PanneauSupport = new Panel();
	      add(PanneauSupport);
	      PanneauSupport.setLayout(new GridLayout(3,1,0,5));
	      
	      PanneauHaut = new Panel();	      
	      PanneauSupport.add(PanneauHaut);
	      PanneauCentre = new Panel();
	      PanneauSupport.add(PanneauCentre);
	      PanneauBas = new Panel();
	      PanneauSupport.add(PanneauBas);
	      
	      PanneauHaut.setLayout(new GridLayout(1,3,0,5));
	      
	      PanneauHaut1=new Panel();
	      PanneauHaut.add(PanneauHaut1);
	      TitrePolice=new Label("Police :");
	      TitrePolice.setLocation(0, 0);
	      TitrePolice.setBackground(Color.YELLOW);
	      PanneauHaut1.add(TitrePolice);
	      ZonePolice=new TextField(10);
	      PanneauHaut1.add(ZonePolice);
	      ListePolice=new List(6);
	      PanneauHaut1.add(ListePolice);
	      
	      PanneauHaut2=new Panel();
	      PanneauHaut.add(PanneauHaut2);
	      TitreSyle=new Label("Style de police :");
	      PanneauHaut2.add(TitreSyle);
	      ZoneStyle=new TextField(10);
	      PanneauHaut2.add(ZoneStyle);
	      ListeStyle=new List(6);
	      PanneauHaut2.add(ListeStyle);
	      
	      PanneauHaut3=new Panel();
	      PanneauHaut.add(PanneauHaut3);
	      TitreTaille=new Label("Taille :");
	      PanneauHaut3.add(TitreTaille);
	      ZoneTaille=new TextField(10);
	      PanneauHaut3.add(ZoneTaille);
	      ListeTaille=new List(6);
	      PanneauHaut3.add(ListeTaille);
	      
	      
	      
	      
	      // Quand on clique sur la croix rouge
	      //
	      addWindowListener (new WindowAdapter () {	
	          public void windowClosing (WindowEvent e) {dispose();}
	         });
	}

	public static void main(String[] args) {
	     new FenetreSaisieTexte().setVisible(true);	
	}
	   

}


