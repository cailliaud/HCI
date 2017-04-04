package application.eleve;

import javax.swing.JPanel;

import application.professeur.AppProf;
import application.professeur.VueAppProf;

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
		this.vue.setCenter(this.modele.getChoixProf());
		
	}
	
	public JPanel getvueAppliEleve(){
		return this.vue;
	}

}
