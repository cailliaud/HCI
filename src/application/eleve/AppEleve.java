package application.eleve;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import VueWip.ChoixEleveM;
import application.ControleurApplication;
import modele.ecole.Eleve;
import modele.ecole.Professeur;

public class AppEleve {

	private ChoixEleveM choixElevePan;
	private ArrayList<Eleve> eleves;
	private ArrayList<Professeur> professeurs;

	public AppEleve(ArrayList<Professeur> professeurs) {

		this.professeurs = professeurs;
		//eleves.add(new Eleve("Jean", "Pauls", true, 12));
		
		choixElevePan = new ChoixEleveM(eleves);

	}

	
}


