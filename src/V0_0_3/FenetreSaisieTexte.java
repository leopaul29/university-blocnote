package V0_0_3;

import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class FenetreSaisieTexte extends Frame {
private Panel         panneauSupport;
private TextArea      zoneAffichage;
private MenuBar       barreMenus;
private LinkedHashMap itemsFichier;
private LinkedHashMap itemsFormat;
private LinkedHashMap itemsEdition;
private LinkedHashMap itemsAffichage;
private LinkedHashMap itemsQuestion;


   public FenetreSaisieTexte() {
   	
      // --- Installer le cadre
      //
      Dimension tailleEcran= Toolkit.getDefaultToolkit().getScreenSize();
      setSize((int)tailleEcran.getWidth(), (int)tailleEcran.getHeight());
      setTitle ("Bloc Note V0_0_3");
      
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
      
      // --- Installer la barre de menus
      //
      barreMenus= new BarreMenusSaisieTexte();
      setMenuBar(barreMenus);
      
      // --- Obtenir les items du menu "Fichier"
      //
      itemsFichier= ((BarreMenusSaisieTexte)barreMenus).getItemsFichier();
      
      // --- Obtenir les items du menu "Format"
      itemsFormat = ((BarreMenusSaisieTexte)barreMenus).getItemsFormat();
      
      // --- Installer l'ecouteur de l'item "Quitter"
      //
      MenuItem itemQuitter= (MenuItem)itemsFichier.get("Quitter");
      itemQuitter.addActionListener(new EcouteurItemQuitter());

      // --- Installer l'ecouteur de l'item "Nouveau"
      //
      MenuItem itemNouveau= (MenuItem)itemsFichier.get("Nouveau");
      itemNouveau.addActionListener(new EcouteurItemNouveau(this));
            
      // --- Installer l'ecouteur de l'item "Police..."
      System.out.println(" :: "+itemsFichier.get("Police..."));
      MenuItem itemPolice = (MenuItem)itemsFichier.get("Police...");
      itemPolice.addActionListener(new EcouteurItemPolice(this));
      
      // --- Mettre en place l'ecouteur du bouton X du cadre
      //
      addWindowListener (new WindowAdapter () {	
         public void windowClosing (WindowEvent e) {System.exit(0);}
      });
   }

   public static void main(String[] args) {
      new FenetreSaisieTexte().setVisible(true);
   }
   
   // ---                                            Accesseurs de consultation
   
   MenuBar   getBarreMenus()    {return barreMenus;}
   TextArea  getZoneAffichage() {return zoneAffichage;}
}
