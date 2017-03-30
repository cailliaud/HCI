package modele.ecole;
import java.util.ArrayList; 


/**
 * <b>Description des tentatives d'un eleve pour un exercice</b>
 * <p>Plusieurs statuts possible pour une tentative :
 * <ol>
 * <li>tentative pas encore faite</li>
 * <li>tentative en attente de correction</li>
 * <li>tentative a refaire</li>
 * <li>tentative validé</li>
 * </ol>
 * </p>
 */

public class Tentative {

	private ArrayList<Action> action;
	private Exercice exercice;
	private int statut;
	private String note;
	private String commentaire;
	
	    
	public Tentative(Exercice exercice) {
		super();
		this.exercice = exercice;
		this.statut = 0;
	}
	
	
	/**
	 * Ajout de l'action à la tentative. 
	 */
	public void ajoutAction( int code, int ordre){
		
	}
	
	/**
	 * Suppression de l'action de la tentative 
	 */
	public void supprimeAction( int code, int ordre){
	}
	


	/**
	 * @return
	 * getAction permet de retourner les actions
	 */
	
	public ArrayList<int[]> getActions() {
		return null;
	}
	
	/**
	 * setAction permet de rentrer une nouvelle action 
	 */
	public void setActions(ArrayList<int[]> actions) {
		
	}
	
	/**
	 * getAction permet de retourner l'exercice
	 */
	
	public Exercice getExercice() {
		return exercice;
	}
	
	/**
	 * setExercice permet de rentrer un nouveau exercice
	 */
	
	public void setExercice(Exercice exercice) {
		this.exercice = exercice;
	}
	
	/**
	 * getStatut permet de retourner le statut de l'exercice 
	 */
	public int getStatut() {
		return statut;
	}
	
	public void setStatut(int statut) {
		this.statut = statut;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public String getCommentaire() {
		return commentaire;
	}
	
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
}
