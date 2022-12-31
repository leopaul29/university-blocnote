package fr.unice.notepad2013b.vue.martin.Notepad;

import java.awt.event.ActionEvent;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.io.*;


public class EcouteurItemOuvrir implements ActionListener {

	FenetreSaisieTexte hamecon;	

	public EcouteurItemOuvrir(FenetreSaisieTexte hamecon) {
	   	
	      this.hamecon= hamecon;
	   }
	public void actionPerformed (ActionEvent e) {
		
		
		explorer();
		hamecon.getZoneAffichage().setEnabled(true);
		
		
	}
	
public void explorer (){
		
		String fileName;
		String fileDirectory;
		String filePath;
		
		//On ouvre à l'aide de la classe FileDialog une boite de dialogue permettant à l'utilisateur d'explorer son espace de stockage
		//On le "limite" à l'ouvertur de fichier .txt
		//---------------------------------------------------------------------------------------------------------------------------------
		
		FileDialog fd = new FileDialog(new Frame(), "Choisissez un fichier texte", FileDialog.LOAD);
		fd.setFile("*.txt");
		fd.setVisible(true);

		
		//Une fois que le fichier a été selectionné, on récupère le nom du fichier, ainsi que le chemin pour y accéder
		//Ces deux chaines sont concaténé afin d'obtenir le chemin complet vers le fichier
		//---------------------------------------------------------------------------------------------------------------------------------
		
		fileName = fd.getFile();
		fileDirectory = fd.getDirectory();
		filePath = fileDirectory + System.getProperty("file.separator") + fileName;
		
		//Si le chemin n'est pas composé d'élément null, on appelle la méthode ouvrirFichier
		//----------------------------------------------------------------------------------------------------------------------------------
		
		if ((fileName!=null)&&(fileDirectory!=null)){
			hamecon.setTitle (fileName+" - NotePad");
			ouvrirFichier(filePath);}
			
		else System.out.println("Opération annulé");
	}
	
	public void ouvrirFichier(String path) {
		
		File file;
		FileReader opener;
		BufferedReader buffer;
		String content;

		try{
					
			file = new File(path);
			opener = new FileReader(file);
			buffer = new BufferedReader(opener);
			content = new String();
			
			//On lit le fichier ligne par ligne à l'aide d'un BufferedReader
			//A la fin de chaque ligne, on ajoute le retour à la ligne
			//Le fichier est concaténé dans une variable
			//---------------------------------------------------------------------------------------------------------------------------------
			
			while(buffer.ready()){
				
				content+=buffer.readLine()+"\r\n";
			}	
		
		//Avant toute chose, on purge la zone de texte
		//On envoie ensuite le texte récupéré du fichier dans la zone de texte
		//Et on ferme les différents flux utilisés
		//-------------------------------------------------------------------------------------------------------------------------------------
		
		hamecon.getZoneAffichage().setText("");
		hamecon.getZoneAffichage().append(content);	
		opener.close();
		buffer.close();
		
		//On sauvegarde ensuite le chemin du fichier ouvert afin de pouvoir le sauvegarder par la suite
		//-------------------------------------------------------------------------------------------------------------------------------------
		
		hamecon.setOpenPath(new String(path));
		
		}
		catch (IOException e){e.printStackTrace();}
	}
}
