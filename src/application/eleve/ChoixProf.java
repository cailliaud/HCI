package application.eleve;


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
	private JLabel logo;
	private ControleurTab controleurTab;
	

	public ChoixProf () {
		
		JPanel entete = new JPanel();
		entete.setLayout(new BorderLayout());
		JLabel connect = new JLabel("Eleve");
		this.logo = new JLabel("Choisis ton Professeur !",SwingConstants.CENTER);
		entete.add(connect, BorderLayout.WEST);
		entete.add(logo, BorderLayout.CENTER);
		RetourButton exit = new RetourButton();
		entete.add(exit, BorderLayout.EAST);
		

		
		this.setLayout(new BorderLayout());
		
		this.add(entete, BorderLayout.NORTH);
		this.add(new JPanel(), BorderLayout.EAST);
		this.add(new JPanel(), BorderLayout.WEST);
		this.add(new JPanel(), BorderLayout.SOUTH);
		
		
		tabUtil = new TabUtil(Main.getListProf());
		this.add(tabUtil,BorderLayout.CENTER);
		controleurTab= new ControleurTab(tabUtil);
		
		
	    
	}

	
}


