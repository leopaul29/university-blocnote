package IntegrationV0_0_1;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Alert extends Frame{
	private Panel	support;
	private Button	boutonok;
	
	public Alert(String s){
		setSize(200, 90);
		setTitle("Attention");
		setResizable(false);
		
		
		support = new Panel();
		add(support);
		support.setLayout(new FlowLayout());
		
		boutonok = new Button("OK");
		
		support.add( new Label(s));
		support.add(boutonok, "OK");
		setVisible(true);
		
		boutonok.addActionListener(new EcouteurBoutonok());
		
		addWindowListener (new WindowAdapter () {	
		      public void windowClosing (WindowEvent e) {setVisible(false);}
		   });
		
		
	}
	
	private class EcouteurBoutonok implements ActionListener {
		public void actionPerformed (ActionEvent e){
			setVisible(false);
		}
	}
	
}