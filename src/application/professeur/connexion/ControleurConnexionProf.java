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
	
	public void submitFormulaire(String login, String mdp){
		this.modeleCoProf = new ModeleConnexionProf(login, mdp);
		this.controlerApp.goMenu();
	}
	
	public void testConnexion(){
		String login = this.vueCoProf.getChampLogin();
		String mdp = this.vueCoProf.getChampMdp();
	}
	public JPanel getVue(){
		return this.vueCoProf;
	}
	
}
