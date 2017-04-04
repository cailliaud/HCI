package application.professeur.connexion;

import javax.swing.JPanel;

import application.professeur.ControleurAppProf;

public class ControleurConnexionProf {
	
	private VueConnexionProf vueCoProf;
	private ModeleConnexionProf modeleCoProf;
	private ControleurAppProf controlerApp;
	
	public ControleurConnexionProf(ControleurAppProf controlerApp){
		this.controlerApp=controlerApp;
		this.vueCoProf = new VueConnexionProf(this);
	}
	
	public void submitFormulaire(){
		this.modeleCoProf = new ModeleConnexionProf(this.vueCoProf.getChampLogin(), this.vueCoProf.getChampMdp());
		this.controlerApp.goMenu();
	}
	
	public JPanel getVue(){
		return this.vueCoProf;
	}
	
}
