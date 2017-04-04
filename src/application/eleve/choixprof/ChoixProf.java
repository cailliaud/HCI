package application.eleve.choixprof;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import main.Main;
import modele.ecole.Classe;
import modele.ecole.Eleve;
import modele.ecole.Professeur;
import widget.boutons.ExitButton;
import widget.boutons.RetourButton;
import widget.tableau.ControleurTab;
import widget.tableau.TabUtil;

public class ChoixProf extends JPanel {
		
	private TabUtil tabUtil;

	private ControleurTab controleurTab;
	

	public ChoixProf () {
		

		

		
		this.setLayout(new BorderLayout());
		

		
		
		tabUtil = new TabUtil(Main.getListProf());
		this.add(tabUtil,BorderLayout.CENTER);
		controleurTab= new ControleurTab(tabUtil);
		
		
	    
	}

	
}


