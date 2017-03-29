package modele;

/**
 * Classe Professeur
 * Contient le pseudo, le mot de passe ainsi que le statut de sa connexion
 * Un professeur ne peut posséder qu'une seule classe
 * Le login ne peut être changé mais le mot de passe oui
 * 
 * @author caill
 *
 */
public class Professeur extends Utilisateur{
	/**
	 * Login du professeur
	 */
	private String login;
	/**
	 * password du professeur
	 */
	private String password;
	/**
	 * statut de connexion du professeur.
	 */
	private boolean connecte;
	
	/**
	 * Classe du professeur
	 */
	private Classe classe;
	
	/**
	 * Constructeur de l'objet Professeur sans image
	 * @param prenom Prenom du Professeur
	 * @param nom Nom du professeur
	 * @param homme sexe du Professeur (true = homme,false = femme)
	 * @param login login du professeur
	 * @param password mot de passe du professeur
	 */
	public Professeur (String prenom, String nom, boolean homme, String login, String password, Classe classe){
		super( prenom,  nom,  homme);
		this.login=login;
		this.password=password;
		this.connecte = false;
		this.classe=classe;
		
	}
	
	/**
	 * Constructeur de l'objet Professeur avec image
	 * @param prenom Prenom du Professeur
	 * @param nom Nom du professeur
	 * @param homme sexe du Professeur (true = homme,false = femme)
	 * @param login login du professeur
	 * @param password mot de passe du professeur
	 * @parem urlImage lien string de l'image du professeur dans le package ressources
	 */
	public Professeur (String prenom, String nom, boolean homme, String login, String password, String urlImage){
		super( prenom,  nom,  homme, urlImage);
		this.login=login;
		this.password=password;
		this.connecte = false;
		
	}
	
	/**
	 * Methode pour que le professeur se connecte
	 * @param login Login du professeur
	 * @param pass mot de passe � tester
	 * @return
	 */
	public boolean seConnecter(String login ,String pass){
		return false;
	}
	
	/**
	 * Methode pour deconnecter le professeur
	 */
	public void seDeconnecter(){
		this.connecte=false;
	}

	/**
	 * Getter pour l'etat de connexion du profresseur
	 * @return
	 */
	public boolean isConnected(){
		return this.connecte;
	}
	
	/**
	 * Getter pour la classe du professeur
	 * @return Classe classe du professeur
	 */
	public Classe getClasse(){
		return this.classe;
	}
	
	/**
	 * Method pour changer le mot de pass
	 * 
	 */
	public void setNewPass( String password){
		// check connecte
	}
}
