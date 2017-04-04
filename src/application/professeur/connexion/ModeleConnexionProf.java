package application.professeur.connexion;

public class ModeleConnexionProf {
	
	private String login, mdp;
	
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
	


}
