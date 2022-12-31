/**
 *
 * La classe EcouteurItemTextPolice fournit un ensemble de services destinés à 
 * l'interface du bloc note, c'est avec cette fenetre que l'on va avoir accès à
 * tous les menus du bloc note.
 *
 * Les services fournis sont :
 * FenetreSaisieTexte 				: créer la fenetre du bloc note
 * main 							: lancer le bloc note
 * getBorderStatus 					: recupère le bord de la fenetre du bloc note
 *
 * @author Leo-Paul MARTIN et Loïc Feuga
 *
**/
package V0_1_1;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class FenetreSaisieTexte extends Frame {

private FenetreSaisieTexte	backup;
private Panel         panneauSupport;
private TextArea      zoneAffichage;
private MenuBar       barreMenus;
private LinkedHashMap itemsFichier;
private LinkedHashMap itemsEdition;
private LinkedHashMap itemsFormat;
private LinkedHashMap itemsAffichage;
private LinkedHashMap itemsQuestion;
private String 		  openFilePath;
private String			pressePapier;
private boolean			wasSaved;
private boolean			aboutToQuit;
private boolean			retourLigne;
private int				tailleTexte;





	/**
	 *
	 * La méthode FenetreSaisieTexte crée la fenetre principale du bloc note
	 * 
	 **/
   public FenetreSaisieTexte() {
   	
      // --- Installer le cadre
      //
      Dimension tailleEcran= Toolkit.getDefaultToolkit().getScreenSize();
      setSize((int)tailleEcran.getWidth(), (int)tailleEcran.getHeight());
      setTitle ("Bloc Note V1_0_0");
      
      // --- Installer un panneau interne
      //
      panneauSupport= new Panel();     
      add(panneauSupport);
      panneauSupport.setBackground(Color.yellow);
      panneauSupport.setLayout(new GridLayout(1,0));
      
      // --- Installer la zone centrale de texte
      //
      zoneAffichage= new TextArea();
      zoneAffichage.setForeground(Color.red);
      zoneAffichage.setFont(new Font("Times Roman", Font.BOLD, 16));
      panneauSupport.add(zoneAffichage, "Center");
      
      zoneAffichage.setEnabled(false);    
      this.wasSaved=true;
      this.aboutToQuit=false;
      this.retourLigne=false;
      this.tailleTexte=0;
      // --- Installer la barre de menus
      //
      barreMenus= new BarreMenusSaisieTexte();
      setMenuBar(barreMenus);
      
      // --- Obtenir les items du menu "Fichier"
      //
      itemsFichier= ((BarreMenusSaisieTexte)barreMenus).getItemsFichier();
      
      // --- Obtenir les items du menu "Edition"
      itemsEdition = ((BarreMenusSaisieTexte)barreMenus).getItemsEdition();
      
      // --- Obtenir les items du menu "Format"
      itemsFormat = ((BarreMenusSaisieTexte)barreMenus).getItemsFormat();
      
      // --- Obtenir les items du menu "?"
      itemsQuestion = ((BarreMenusSaisieTexte)barreMenus).getItemsQuestion();
      
      // --- Installer l'ecouteur de l'item "Quitter"
      //
      MenuItem itemQuitter= (MenuItem)itemsFichier.get("Quitter");
      itemQuitter.addActionListener(new EcouteurItemQuitter());

      // --- Installer l'ecouteur de l'item "Nouveau"
      //
      MenuItem itemNouveau= (MenuItem)itemsFichier.get("Nouveau");
      itemNouveau.addActionListener(new EcouteurItemNouveau(this));
            
      // --- Installer l'ecouteur de l'item "Police..."
     // System.out.println(" :: "+itemsFichier.get("Police..."));
      MenuItem itemPolice = (MenuItem)itemsFormat.get("Police...");
          itemPolice.addActionListener(new EcouteurItemPolice(this));
      
      // --- Mettre en place l'ecouteur du bouton X du cadre
      //
      addWindowListener (new WindowAdapter () {	
         public void windowClosing (WindowEvent e) {
        	 System.exit(0);
         }

   	/**
	 *
	 * La méthode main permet de lancer le bloc note
	 * 
	 **/
   public void main(String[] args) {
      new FenetreSaisieTexte().setVisible(true);
   }
   
   // ---                                            Accesseurs de consultation
   /**
	 *
	 * Accesseur de la FenetreSaisieTexte :
	 * getBarreMenus
	 * getZoneAffichage
	 * setOpenPath
	 * getOpenPath
	 * getPressePapier
	 * setPressePapier
	 * getWasSaved
	 * setSaveStatus
	 * getQuitStatus
	 * setQuitStatus
	 * getRetourLigne
	 * setRetourLigne
	 * 
	 **/
   MenuBar   getBarreMenus()    {return barreMenus;}
   TextArea  getZoneAffichage() {return zoneAffichage;}
   public void 	 setOpenPath(String path){this.openFilePath = path;}
   public String	 getOpenPath()		{return this.openFilePath;}
   public String	getPressePapier()	{return this.pressePapier;}
   public void		setPressePapier(String text)	{this.pressePapier = text;}
   public boolean	getWasSaved()		{return this.wasSaved;}
   public void		setSaveStatus(boolean saved)	{this.wasSaved = saved;}
   public boolean	getQuitStatus()		{return this.aboutToQuit;}
   public void		setQuitStatus(boolean status)	{this.aboutToQuit = status;}		
   public boolean 	getRetourLigne()	{return this.retourLigne;}
   public void		setRetourLigne(boolean active)	{this.retourLigne = active;}
   
   
// ---											Vérificateur d'atteinte de bord de fenetre
   	/**
	 *
	 * La méthode getBorderStatus permet de recupérer si on est proche du bord quand on écrit dans le bloc note
	 * 
	 **/
   public boolean getBorderStatus() {
	   
	   FontMetrics metrics = zoneAffichage.getFontMetrics(zoneAffichage.getFont());
	   if (zoneAffichage.getWidth()-25 <= metrics.stringWidth(zoneAffichage.getText())-(tailleTexte*(zoneAffichage.getWidth()-45))){
		   System.out.println(metrics.stringWidth(zoneAffichage.getText())-(tailleTexte*(zoneAffichage.getWidth()-45)));
		   tailleTexte++;
		   return true;
	   }

	   else
		   return false;
   }
      }
   }
}

