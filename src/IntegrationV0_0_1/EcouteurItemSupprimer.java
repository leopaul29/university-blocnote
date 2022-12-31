package IntegrationV0_0_1;



import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.accessibility.AccessibleContext;


public class EcouteurItemSupprimer implements ActionListener {
	   private FenetreSaisieTexte createur;
	   private AccessibleContext saisie;
	   
	
	   public EcouteurItemSupprimer(Frame createur){
		   this.createur = (FenetreSaisieTexte) createur;
		   
	   }
	   
    
      @Override
	   public void actionPerformed (ActionEvent e) {
		   
		   this.saisie = createur.getZoneAffichage().getAccessibleContext();
		   createur.getZoneAffichage().replaceRange( "", saisie.getAccessibleText().getSelectionStart(), saisie.getAccessibleText().getSelectionEnd());
	       }
    
	  
      public AccessibleContext getSaisi(){
    	
    	  return this.saisie;
      }
    
      public String AfficheSaisi(){
    	
    	  return this.saisie.getAccessibleText().getSelectedText();
      }
}