package modele;
import java.util.ArrayList; 


public class Tentative {

	private int idTentative;
	//hello


	private ArrayList<Action> action;
	private Exercice exercice;
	/*
	 * Difference between each statute
	 * 0 -> la tentative n'a pas encore été faite
	 * 1 -> la tentative a été faite par l'élève, en attente de correction
	 * 2 -> tentative validé
	 * 3 -> tentative a refaire
	 */
	private int statut;
	private String note;
	private String commentaire;
	
	    

	public Tentative(int idTentative, Exercice exercice) {
		super();
		this.idTentative = idTentative;
		this.exercice = exercice;
		this.statut = 0;
	}
	
	
	/*
	 * Ajout de l'action à la tentative. 
	 */
	public void ajoutAction( int code, int ordre){
		
	}
	
	/*
	 * Suppression de l'action de la tentative 
	 */
	public void supprimeAction( int code, int ordre){
	}
	
	

	
	
	
	
	public int getIdTentative() {
		return idTentative;
	}

	public ArrayList<int[]> getActions() {
		return null;
	}
	
	public void setActions(ArrayList<int[]> actions) {
		
	}
	
	public Exercice getExercice() {
		return exercice;
	}
	
	public void setExercice(Exercice exercice) {
		this.exercice = exercice;
	}
	
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
