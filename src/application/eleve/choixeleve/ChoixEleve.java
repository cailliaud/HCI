package application.eleve.choixeleve;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import application.eleve.ControleurAppEleve;
import main.Main;
import modele.ecole.Professeur;
import widget.tableau.ControleurTab;
import widget.tableau.TabUtil;

public class ChoixEleve extends JPanel{
	
	private TabUtil tabUtil;
	private ControlerChoixEleve controleurTab;
	private Professeur prof;
	
	public ChoixEleve(ControleurAppEleve controleur){
		this.setLayout(new BorderLayout());
		this.prof = controleur.getProfesseur();
		tabUtil = new TabUtil(this.prof.getClasse());
		this.add(tabUtil,BorderLayout.CENTER);
		this.controleurTab= new ControlerChoixEleve(this.tabUtil, controleur);
	}
}
