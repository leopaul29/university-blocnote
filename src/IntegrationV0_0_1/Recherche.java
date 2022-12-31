package IntegrationV0_0_1;
import java.util.*;
import java.awt.*;

public class Recherche {
	private FenetreSaisieTexte hamecon;
	private TextArea texte;
	private String pattern;
	private int textelen;
	private int patternlen;
	private int count;
	
	public Recherche(FenetreSaisieTexte p_hamecon){
		FenetreSaisieTexte hamecon=p_hamecon;
		texte=hamecon.getZoneAffichage();		textelen=texte.getText().length();
		pattern=null;
		count=0;
		
	}
	
	public TextArea getTexte(){
		return this.texte;
	}
	
	public String getPattern(){
		return this.pattern;
	}
	
	public void setPattern(TextField text){
		pattern=text.getText();
	}
	
	public int getTextelen(){
		return this.textelen;
	}
	
	public int getPatternlen(){
		return this.pattern.length();
	}
	
	public int getCount(){
		return this.count;
	}
	
	public void setCount(int x){
		this.count=x;
	}
	
	public void incCount(){
		this.setCount(this.getCount()+1);
	}
	
	public FenetreSaisieTexte getFenetreSaisieTexte(){
		return this.hamecon;
	}
	
	public boolean trouve(){
		int occurences;
		occurences=this.getTexte().getText().indexOf(this.getPattern());
		if(occurences==0) return false;
		else return true;
	}
	
	public int[] find(){
		int pos[]=new int[500];
		int last;
		pos[0]=this.getTexte().getText().indexOf(this.getPattern());
		last=this.getTexte().getText().lastIndexOf(this.getPattern());
		if (pos[0]==last) return pos;

		
		int i=1;
		while(true){
			pos[i]= this.getTexte().getText().indexOf(this.getPattern(), pos[i-1]+1);
			if (pos[i]==last){
				pos[i+1]=-1;
				return pos;
			}
			i++;
		}
	}
	
}
