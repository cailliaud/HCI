package application.professeur.connexion;

import main.Main;
import modele.ecole.Professeur;

public class ModeleConnexionProf {
	
	private String login, mdp;
	private Professeur prof = null;
	
	public ModeleConnexionProf(String login, String mdp){
		this.login= login;
		this.mdp=mdp;
		this.testConnexion();
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getMdp() {
		return mdp;
	}
	
	public void testConnexion(){
		for (Professeur prof : Main.getListProf()) {
			if (this.login == prof.getLogin() && this.mdp == prof.getPassword())
				this.prof = prof;
				break;
		}
	}

	public Professeur getProf() {
		return prof;
	}

}
