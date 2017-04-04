package application.eleve;

import javax.swing.JPanel;

import application.eleve.choixeleve.ChoixEleve;
import application.eleve.choixprof.ChoixProf;
import application.professeur.AppProf;
import application.professeur.VueAppProf;
import modele.ecole.Eleve;
import modele.ecole.Professeur;

public class ControleurAppEleve {
	private VueAppEleve vue;
	private AppEleve modele;
	
	public   ControleurAppEleve( ){
		this.modele = new AppEleve(this);
		this.vue= new VueAppEleve();
		goChoixProf();
	}
	

	
	
	public void goChoixProf(){
		this.vue.setTitle("Choix de ton Professeur");
		ChoixProf choixProf = new ChoixProf(this);
		this.vue.setCenter(choixProf);
		
	}
	
	public void goChoixEleve(){
		this.vue.setTitle("Qui es tu?");
		ChoixEleve choixEleve = new ChoixEleve(this.modele.getProfesseur());
		this.vue.setCenter(choixEleve);
	}
	
	public JPanel getvueAppliEleve(){
		return this.vue;
	}
	
	public void setEleve(Eleve el){
		this.modele.setEleve(el);
		
	}
	
	public void setProf(Professeur prof){
		this.modele.setProf(prof);
	}
	
	public Eleve getEleve(){
		return this.modele.getEleve();
	}
	
	public Professeur getProfesseur(){
		return this.modele.getProfesseur();
	}

}
