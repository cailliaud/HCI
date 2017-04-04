package application.eleve;


import java.util.ArrayList;

import javax.swing.JPanel;

import application.eleve.choixprof.ChoixProf;
import application.professeur.ControleurAppProf;
import application.professeur.connexion.ControleurConnexionProf;
import application.professeur.menu.MenuProf;
import modele.ecole.Eleve;
import modele.ecole.Professeur;

public class AppEleve {

	private Eleve eleve;
	private Professeur prof;
	private ChoixProf choixProf;
	private ControleurAppEleve controleur;

	public AppEleve(ControleurAppEleve controleur) {
		this.controleur = controleur;
		

		

	}
	
	public ChoixProf getChoixProf(){
		ChoixProf choixProf = new ChoixProf();
		return choixProf;
	}

	public void setEleve(Eleve el){
		this.eleve = el;
		
	}
	
	public void setProf(Professeur prof){
		this.prof = prof;
	}
	
	public Eleve getEleve(){
		return this.eleve;
	}
	
	public Professeur getProfesseur(){
		return this.prof;
	}
	
	
	
}


