package V0_0_1;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class MenuFichier {
private LinkedHashMap config;
   	
   // ---                                              Constructeur par defaut
   
   public MenuFichier() {config= new LinkedHashMap();}
   
   // ---                                                         Methode load  
   	  
   public LinkedHashMap load() {
   	  	
      config.put("Nouveau...",          new Boolean(true));
      config.put("Ouvrir..." ,          new Boolean(true));
      config.put("Enregistrer",         new Boolean(false));
      config.put("Enregistrer sous...", new Boolean(false));
      
      config.put("-",                   null);
      config.put("Mise en page...",     new Boolean(false));
      config.put("Imprimer...",         new Boolean(false)); 
      
      config.put("--",                  null);
      config.put("Quitter",             new Boolean(true));
         
      return config;
   } 
}    
