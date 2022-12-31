/**
 *
 * La classe EcouteurItemQuitter fournit un services destin�s � la 
 * gestion de l'item "Quitter" de la barre de menus de l'application FenetreSaisieTexte
 *
 * Le service fourni est :
 * actionPerformed 				: Permet de fermer l'application FenetreSaisieTexte quand l'item "Quitter" est cliqu�.
 *
 * @author Leo-Paul MARTIN et Lo�c Feuga
 *
**/
package V0_1_1;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
   
public class EcouteurItemQuitter implements ActionListener {
   	
	
/**
 *
 * La m�thode actionPerformed permet de fermer l'application FenetreSaisieTexte quand l'item "Quitter" est cliqu�.
 * 
**/
   public void actionPerformed (ActionEvent e) {System.exit(0);}
} 
