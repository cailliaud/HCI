package modele;
import java.util.ArrayList; 


public class Tentative {

	private int idTentative;
	//hello


	private ArrayList<Action> action;
	private Exercice exercice;
	/*
	 * Difference between each statute
	 * 0 -> the exercice have been not done yet. 
	 * 1 -> the exercice have been done. 
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
	 * 
	 */
	public addAction(){
	
	}
	
	
	
	
	public int getIdTentative() {
		return idTentative;
	}


	public ArrayList<int[]> getActions() {
		return actions;
	}
	
	public void setActions(ArrayList<int[]> actions) {
		this.actions = actions;
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
