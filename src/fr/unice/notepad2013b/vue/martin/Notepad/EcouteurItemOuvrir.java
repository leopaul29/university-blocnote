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
		
		//On ouvre � l'aide de la classe FileDialog une boite de dialogue permettant � l'utilisateur d'explorer son espace de stockage
		//On le "limite" � l'ouvertur de fichier .txt
		//---------------------------------------------------------------------------------------------------------------------------------
		
		FileDialog fd = new FileDialog(new Frame(), "Choisissez un fichier texte", FileDialog.LOAD);
		fd.setFile("*.txt");
		fd.setVisible(true);

		
		//Une fois que le fichier a �t� selectionn�, on r�cup�re le nom du fichier, ainsi que le chemin pour y acc�der
		//Ces deux chaines sont concat�n� afin d'obtenir le chemin complet vers le fichier
		//---------------------------------------------------------------------------------------------------------------------------------
		
		fileName = fd.getFile();
		fileDirectory = fd.getDirectory();
		filePath = fileDirectory + System.getProperty("file.separator") + fileName;
		
		//Si le chemin n'est pas compos� d'�l�ment null, on appelle la m�thode ouvrirFichier
		//----------------------------------------------------------------------------------------------------------------------------------
		
		if ((fileName!=null)&&(fileDirectory!=null)){
			hamecon.setTitle (fileName+" - NotePad");
			ouvrirFichier(filePath);}
			
		else System.out.println("Op�ration annul�");
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
			
			//On lit le fichier ligne par ligne � l'aide d'un BufferedReader
			//A la fin de chaque ligne, on ajoute le retour � la ligne
			//Le fichier est concat�n� dans une variable
			//---------------------------------------------------------------------------------------------------------------------------------
			
			while(buffer.ready()){
				
				content+=buffer.readLine()+"\r\n";
			}	
		
		//Avant toute chose, on purge la zone de texte
		//On envoie ensuite le texte r�cup�r� du fichier dans la zone de texte
		//Et on ferme les diff�rents flux utilis�s
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
