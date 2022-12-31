/**
 *
 * La classe EcouteurItemQuitter fournit un services destinés à la 
 * gestion de l'item "Quitter" de la barre de menus de l'application FenetreSaisieTexte
 *
 * Le service fourni est :
 * actionPerformed 				: Permet de fermer l'application FenetreSaisieTexte quand l'item "Quitter" est cliqué.
 *
 * @author Leo-Paul MARTIN et Loïc Feuga
 *
**/
package V0_1_1;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
   
public class EcouteurItemQuitter implements ActionListener {
   	
	
/**
 *
 * La méthode actionPerformed permet de fermer l'application FenetreSaisieTexte quand l'item "Quitter" est cliqué.
 * 
**/
   public void actionPerformed (ActionEvent e) {System.exit(0);}
} 
