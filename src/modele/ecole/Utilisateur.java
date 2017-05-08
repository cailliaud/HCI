package modele.ecole;

import java.net.URL;

import javax.swing.ImageIcon;

/**
 * Classe Utilisateur
 * Classe contenant un prenom, un nom , une image comme icone et un id
 * @author caill
 *
 */
public class Utilisateur {
	/**
	 * Prenom de l'utilisateur
	 */
	protected String prenom;
	
	/**
	 * Nom de l'utilisateur
	 */
	protected String nom;
	
	/**
	 * Image de l'utilisateur
	 */
	protected ImageIcon icone;
	
	/**
	 * Id de l'utilisateur
	 */
	protected int id;
	
	/**
	 * Constructeur de la classe utilisateur sans icone par defaut
	 * @param prenom Prenom utilisateur
 	 * @param nom Nom utilisateur
	 * @param homme sexe utilisateur (true : homme sinon femme)
	 */
	public Utilisateur (String prenom, String nom){
		this.prenom=prenom;
		this.nom=nom;
	}
	
	
	/**
	 * Constructeur de la classe utilisateur sans icone par defaut
	 * @param prenom Prenom utilisateur
 	 * @param nom Nom utilisateur
	 * @param icone string contenant le nom du fichier avec l'icone dans le package ressources
	 */
	public Utilisateur (String prenom, String nom, String icone ){
		this.prenom=prenom;
		this.nom=nom;
		URL urlimage = Eleve.class.getResource(
                "/ressources/"+icone);
		this.icone = new ImageIcon(urlimage);
	}
	
	/**
	 * Getter Prenom
	 * @return String 
	 */
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ImageIcon getIcone() {
		return icone;
	}

	public void setIcone(String urlImage) {
		URL urlimage = Eleve.class.getResource(
                "/ressources/"+icone);
		this.icone = new ImageIcon(urlimage);
		
	}

	

}
