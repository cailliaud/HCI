package modele;
import java.util.ArrayList;


/**
 * <p> Cette classe repr�sente toute les classes qui sont pr�sentents dans l'�cole.</p>
 * <p> Chaque classe est r�pr�sent� par un id, un niveau et une liste d'exercice.</p>
 * 
 * @author Group 4
 * @version 2017-03-29
 */
public class Classe {
	private int id; 
	private String nom;
	private ArrayList<Eleve> listeEleves;
	private ArrayList<Exercice> listeExercice;

	
	/**
	 * Constructeur de la classe Classe
	 * @param id Le num�ro d'identification de la classe.
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
	 * Cette m�thode permet de retourner l'identifiant de la classe.
	 * @return L'identifiant de la classe est retourn�.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Cette m�thode permet de retourner le niveau de la classe.
	 * @return Le nom du niveau de la classe
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * Cette m�thode permet de changer le niveau de la classe.
	 * @param Le nouveau nom du niveau de la classe
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * Cette m�thode permet de retourner les informations du professeur en charge de la classe en appelant la classe Professeur.
	 * @return L'identifiant et le nom du professeur.
	 */
	public Professeur getProf(){
		return this.prof;
	}
	/**
	 * Cette m�thode permet de changer les informations du professeur en charge de la classe en appelant la classe Professeur.
	 * @return prof Nouveau professeur en charge de la classe.
	 */
	public void setProf(Professeur prof){
		this.prof=prof;
	}
	/**
	 * Cette m�thode permet de retourner la liste d'�l�ves de la classe.
	 * @return L'ensemble des �l�ves �tant dans la classe.
	 */
	public ArrayList<Eleve> getListeEleves() {
		return listeEleves;
	}
	
	/**
	 * Cette m�thode permet d'ajouter des �l�ves dans la classe.
	 * @param eleve Un �l�ve doit �tre dans les param�tres afin de l'ins�rer dans la liste de la classe.
	 */
	public void addEleve (Eleve eleve){
		this.listeEleves.add(eleve);
		eleve.setClasse(this);
	}
	
	/**
	 * Cette m�thode permet de retourner la liste d'exercices disponible pour la classe.
	 * @return L'ensemble des exercices �tant dans la classe.
	 */
	public ArrayList<Exercice> getListeExercice() {
		return listeExercice;
	}
	
	/**
	 * Cette m�thode permet d'ajouter des exercices dans la liste.
	 * @param exercice Un exercice doit �tre dans les param�tres afin de l'ins�rer dans la liste des exercices.
	 */
	public void addExercice (Exercice exercice){
		this.listeExercice.add(exercice);
	}

}
