package application.eleve;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import VueWip.ChoixEleveM;
import VueWip.ChoixEleveV;
import application.ControleurApplication;
import main.Main;
import modele.ecole.Eleve;
import modele.ecole.Professeur;

public class AppEleve {

	private ChoixEleveM choixEleveM;
	private ChoixEleveV choixEleveV;
	private ArrayList<Eleve> eleves = new ArrayList<Eleve>();


	public AppEleve() {

		
		eleves.add(new Eleve("Jean", "Pauls", true, 12));
		choixEleveM = new ChoixEleveM(eleves);
		choixEleveV = new ChoixEleveV(choixEleveM);
		

	}
	
	public ChoixEleveV getChoixEleveV(){
		return this.choixEleveV;
	}

	
}


