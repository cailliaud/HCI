package application.eleve.choixeleve;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import main.Main;
import modele.ecole.Professeur;
import widget.tableau.ControleurTab;
import widget.tableau.TabUtil;

public class ChoixEleve extends JPanel{
	
	private TabUtil tabUtil;
	private ControleurTab controleurTab;
	private Professeur prof;
	
	public ChoixEleve(Professeur prof){
		this.setLayout(new BorderLayout());
		this.prof = prof;
		tabUtil = new TabUtil(this.prof.getClasse());
		this.add(tabUtil,BorderLayout.CENTER);
		controleurTab= new ControleurTab(tabUtil);
	}
}
