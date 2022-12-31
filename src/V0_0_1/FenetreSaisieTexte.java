//
// IUT de Nice / Departement informatique / Module APO-Java
// Annee 2012_2013 - Package AWT
//
// Exemple d'applications interactives non parametrees
//
// Edition A 	: fenetre de saisie de texte
//
//    + Version 1.0.0	: fenetre limitee au cadre externe
//    + Version 1.1.0   : ajout d'un ecouteur du bouton X
//    + Version 1.2.0   : l'ecouteur devient une classe interne anonyme
//    + Version 1.3.0   : le cadre s'ajuste automatiquement a la taille de
//                        l'ecran physique
//    + Version 1.4.0   : ajout d'un panneau interne de couleur jaune
//    + Version 1.5.0   : ajout d'une zone de texte au centre du panneau
//    + Version 1.6.0   : signalement console de chaque activation du cadre
//    + Version 1.7.0   : signalement des activations du cadre dans la zone
//                        de texte de la fenetre
//    + Version 1.8.0   : modification des caracteristiques de la zone de texte
//                        (couleur du texte et police utilisee)
//    + Version 1.9.0   : ajustement automatiquement de la taille de la zone de
//                        de texte a celle du panneau support
//
// Edition B    : integration d'une barre de menus deroulants
//
//    + Version 2.0.0   : ajout d'une barre de menus et d'un menu "Fichier",
//                        sans les items associes et sans gestion d'evenements
//    + Version 2.1.0   : ajout d'items au menu "Fichier" (Bloc notes !)
//    + Version 2.2.0   : ajout des barres de separation des items
//    + Version 2.3.0   : verrouillage initial de la zone de texte
//    + Version 2.4.0   : memorisation des items de menus dans un dictionnaire
//    + Version 2.5.0   : invalidation de tous les items de menus, exceptes
//                        "Nouveau...", "Ouvrir..." et "Quitter"
//    + Version 2.6.0   : gestion operationnelle de l'item "Quitter"
//    + Version 2.7.0   : gestion operationnelle de l'item "Nouveau"
//    + Version 2.8.0   : introduction d'une classe interne dediee a la gestion
//                        des menus et des items (BarreMenusSaisieTexte)
// 
// Edition C    : externalisation de la gestion des menus
//
//    + Version 3.0.0   : mise en place d'une classe externe dediee a la 
//                        la gestion des menus (BarreMenusSaisieTexte)
//    + Version 3.1.0   : externalisation des ecouteurs des items "Nouveau" et
//                        "Quitter"
//    + Version 3.2.0   : introduction d'un dictionnaire de configuration dans
//                        la classe satelitte BarreMenusSaisieTexte
//    + Version 3.3.0   : externalisation de la creation du dictionnaire de
//                        configuration du menu "Fichier" (nouvelle classe
//                        satellite MenuFichier)
//   
// Auteur : A. Thuaire
//
package V0_0_1;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class FenetreSaisieTexte extends Frame {
private Panel         panneauSupport;
private TextArea      zoneAffichage;
private MenuBar       barreMenus;
private LinkedHashMap itemsFichier;
private LinkedHashMap itemsEdition;
private LinkedHashMap itemsFormat;
private LinkedHashMap itemsAffichage;
private LinkedHashMap itemsQuestion;

   public FenetreSaisieTexte() {
   	
      // --- Installer le cadre
      //
      Dimension tailleEcran= Toolkit.getDefaultToolkit().getScreenSize();
      setSize((int)tailleEcran.getWidth(), (int)tailleEcran.getHeight());
      setTitle ("(AWT) Bloc Note - V 0.0.1");
      
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
      itemsEdition= ((BarreMenusSaisieTexte)barreMenus).getItemsEdition();
      itemsFormat= ((BarreMenusSaisieTexte)barreMenus).getItemsFormat();
      itemsAffichage= ((BarreMenusSaisieTexte)barreMenus).getItemsAffichage();
      itemsQuestion= ((BarreMenusSaisieTexte)barreMenus).getItemsQuestion();
      
      // --- Installer l'ecouteur de l'item "Quitter"
      //
      MenuItem itemQuitter= (MenuItem)itemsFichier.get("Quitter");
      itemQuitter.addActionListener(new EcouteurItemQuitter());
      
      // --- Installer l'ecouteur de l'item "Nouveau"
      //
      MenuItem itemNouveau= (MenuItem)itemsFichier.get("Nouveau...");
      itemNouveau.addActionListener(new EcouteurItemNouveau(this));
            
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
