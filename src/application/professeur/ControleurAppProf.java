package application.professeur;

import javax.swing.JPanel;

import modele.ecole.Professeur;
import widget.InfoUtil;

public class ControleurAppProf {
	
	private VueAppProf vue;
	private AppProf modele;
	
	public   ControleurAppProf( ){
		this.modele = new AppProf(this);
		this.vue= new VueAppProf();
		goConnexionProf();
	}
	
	public void goConnexionProf(){
		this.vue.setTitle("Connexion à un Compte Professeur");
		this.vue.setCenter(this.modele.getConnexionProf());
		
	}
	
	public void goMenu(){
		this.vue.setTitle("Menu");
		this.vue.setConnect(new InfoUtil(this.modele.getProf()));
		this.vue.setCenter(this.modele.getMenu());
	}
	
	public JPanel getvueAppliProf(){
		return this.vue;
	}
	
	
	public void setProfesseur(Professeur newProf){
		this.modele.setProf(newProf);
	}
	
	public Professeur getProfesseur(){
		return this.modele.getProf();
	}
}
