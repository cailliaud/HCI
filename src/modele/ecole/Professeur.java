package modele.ecole;

import java.util.ArrayList;

/**
 * <b>Classe Professeur</b>
 * 
 * Contient le pseudo, le mot de passe ainsi que le statut de sa connexion
 * <ul>
 * 	<li>Un professeur ne peut posséder qu'une seule classe.</li>
 *  <li>Le login ne peut être changé mais le mot de passe oui</li>
 *  <li>Un professeur peut récupérer la Liste des tentatives qu'il doit corriger.</li>
 * </ul>
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
	public Professeur (String prenom, String nom, String login, String password, Classe classe){
		super( prenom,  nom, "prof.png");
		this.login=login;
		this.password=password;
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
	public Professeur (String prenom, String nom, String login, String password, String urlImage){
		super( prenom,  nom, urlImage);
		this.login=login;
		this.password=password;
		
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
	
	/**
	 * 
	 */
	public boolean testMdp(String mdp){
		if (mdp.equals(this.password)) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Fonction pour récupérer la liste des tentatives des élèves d'un Professeur non corrigées.
	 * @return ArrayList<Tentative>
	 */
	public ArrayList<Tentative> getTentativesNonCorrigee(){
		return null;
	}

	public String getPassword() {
		return password;
	}

	public String getLogin() {
		return login;
	}
	
	
}
