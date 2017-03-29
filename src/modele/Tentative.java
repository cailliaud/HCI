package modele;
import java.util.ArrayList; 


/**
 * Difference between each statute
 * 0 -> la tentative n'a pas encore été faite
 * 1 -> la tentative a été faite par l'élève, en attente de correction
 * 2 -> tentative validé
 * 3 -> tentative a refaire
 */

public class Tentative {

	private int idTentative;
	private ArrayList<Action> action;
	private Exercice exercice;
	private int statut;
	private String note;
	private String commentaire;
	
	    

	public Tentative(int idTentative, Exercice exercice) {
		super();
		this.idTentative = idTentative;
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
	 * getIdTentative permet de retourner l'id de la tentative
	 */
	
	public int getIdTentative() {
		return idTentative;
	}

	/**
	 * @return
	 * getAction permet de retourner les actions
	 */
	
	public ArrayList<int[]> getActions() {
		return actions;
	}
	
	/**
	 * setAction permet de rentrer une nouvelle action 
	 */
	public void setActions(ArrayList<int[]> actions) {
		this.actions = actions;
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
