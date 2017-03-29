package modele;

/**
 * Classe Professeur
 * Contient le pseudo, le mot de passe ainsi que le statut de sa connexion
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
	 * Constructeur de l'objet Professeur sans image
	 * @param prenom Prenom du Professeur
	 * @param nom Nom du professeur
	 * @param homme sexe du Professeur (true = homme,false = femme)
	 * @param login login du professeur
	 * @param password mot de passe du professeur
	 */
	public Professeur (String prenom, String nom, boolean homme, String login, String password){
		super( prenom,  nom,  homme);
		this.login=login;
		this.password=password;
		this.connecte = false;
		
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
	
	public boolean seConnecter(String pass){
		if (pass==this.password) {
			this.connecte=true;
			return true;
		}else{
			return false;
		}
	}
	
	public void seDeconnecter(){
		this.connecte=false;
	}

}
