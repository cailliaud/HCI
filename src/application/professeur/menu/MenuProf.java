package application.professeur.menu;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuProf extends JPanel {
	
	private JButton creerExer, visuCl, modifExer, corrExer;
	
	public MenuProf(){
		this.setLayout( new GridLayout(2,2));
		creerExer = new JButton("Créer Exercice");
		visuCl = new JButton("Visualiser Classe");
		modifExer = new JButton("Modifier Exercice");
		corrExer = new JButton("Corriger Tentatives");
		this.add(creerExer);
		this.add(visuCl);
		this.add(modifExer);
		this.add(corrExer);
		this.addListener();
	}
	
	
	private void addListener(){
		
	}

}
