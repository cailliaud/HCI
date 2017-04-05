package application.eleve.menu;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import modele.ecole.Eleve;

public class MenuEleve extends JPanel{
	private JButton test;
	private Eleve eleve;
	
	public MenuEleve(Eleve eleve){
		this.eleve = eleve;
		this.test = new JButton("Go voir exercice");
		this.add(test);
		this.addListener();
	}
	
	
	private void addListener(){
		
	}
}
