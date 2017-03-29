package modele;
import java.util.ArrayList;


/**
 * <p> Cette classe représente toute les classes qui sont présentents dans l'école.</p>
 * <p> Chaque classe est réprésenté par un id, un niveau, un professeur et une liste d'exercice.</p>
 * 
 * @author Group 4
 * @version 2017-03-29
 */
public class Classe {
	private int id; 
	private String nom;
	private ArrayList<Eleve> listeEleves;
	private Professeur prof;
	private ArrayList<Exercice> listeExercice;

	
	/**
	 * Constructeur de la classe Classe
	 * @param id Le numéro d'identification de la classe.
	 * @param nom Le nom de la classe (CP, CE1, ...).
	 * @param Professeur Le professeur en charge de la classe.
	 */
	public Classe (int id, String nom, Professeur prof ){
		listeEleves = new ArrayList<Eleve>();
		this.id=id;
		this.nom=nom;
		this.prof = prof;
		this.listeExercice = null;
	}
	
	/**
	 * Cette méthode permet de retourner l'identifiant de la classe.
	 * @return L'identifiant de la classe est retourné.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Cette méthode permet de retourner le niveau de la classe.
	 * @return Le nom du niveau de la classe
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * Cette méthode permet de changer le niveau de la classe.
	 * @param Le nouveau nom du niveau de la classe
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * Cette méthode permet de retourner les informations du professeur en charge de la classe en appelant la classe Professeur.
	 * @return L'identifiant et le nom du professeur.
	 */
	public Professeur getProf(){
		return this.prof;
	}
	/**
	 * Cette méthode permet de changer les informations du professeur en charge de la classe en appelant la classe Professeur.
	 * @return prof Nouveau professeur en charge de la classe.
	 */
	public void setProf(Professeur prof){
		this.prof=prof;
	}
	/**
	 * Cette méthode permet de retourner la liste d'élèves de la classe.
	 * @return L'ensemble des élèves étant dans la classe.
	 */
	public ArrayList<Eleve> getListeEleves() {
		return listeEleves;
	}
	
	/**
	 * Cette méthode permet d'ajouter des élèves dans la classe.
	 * @param eleve Un élève doit être dans les paramètres afin de l'insérer dans la liste de la classe.
	 */
	public void addEleve (Eleve eleve){
		this.listeEleves.add(eleve);
		eleve.setClasse(this);
	}
	
	/**
	 * Cette méthode permet de retourner la liste d'exercices disponible pour la classe.
	 * @return L'ensemble des exercices étant dans la classe.
	 */
	public ArrayList<Exercice> getListeExercice() {
		return listeExercice;
	}
	
	/**
	 * Cette méthode permet d'ajouter des exercices dans la liste.
	 * @param exercice Un exercice doit être dans les paramètres afin de l'insérer dans la liste des exercices.
	 */
	public void addExercice (Exercice exercice){
		this.listeExercice.add(exercice);
	}

}
