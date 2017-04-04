package application.professeur.connexion;

import main.Main;
import modele.ecole.Professeur;

public class ModeleConnexionProf {
	
	private String login, mdp;
	private Professeur prof = null;
	
	public ModeleConnexionProf(String login, String mdp){
		this.login= login;
		this.mdp=mdp;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getMdp() {
		return mdp;
	}
	
	public Professeur testConnexion(){
		for (Professeur prof : Main.getListProf()) {
			
		}
		return null;
	}

}
