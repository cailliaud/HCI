package application.professeur.connexion;

import main.Main;
import modele.ecole.Professeur;

public class ModeleConnexionProf {
	
	private String login, mdp;
	private Professeur prof;
	
	public ModeleConnexionProf(){
	}

	public String getLogin() {
		return login;
	}
	
	public String getMdp() {
		return mdp;
	}
	
	public boolean testConnexion(){
		for (Professeur p : Main.getListProf()) {
			if (this.login.equals(p.getLogin()) && this.mdp.equals(p.getPassword())){
				this.prof = p;
				return true;
			}
		}
		return false;
	}

	public Professeur getProf() {
		return this.prof;
	}

	public void setIdentifiants(String champLogin, String champMdp) {
		this.login = champLogin;
		this.mdp = champMdp;
	}

}
