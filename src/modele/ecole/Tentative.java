package modele.ecole;
import java.util.ArrayList;

import modele.tortue.TortueCouleur;
import modele.tortue.TortueG;
import modele.tortue.TortueRapide; 


/**
 * <b>Description des tentatives d'un eleve pour un exercice</b>
 * <p>Plusieurs statuts possible pour une tentative :
 * <ul>
 * <li>1. tentative pas encore faite</li>
 * <li>2. tentative en attente de correction</li>
 * <li>3. tentative a refaire</li>
 * <li>4. tentative validé</li>
 * </ul>
 * </p>
 */

public class Tentative {

	private ArrayList<Action> listAction;
	private Exercice exercice;
	private int statut;
	private int note;
	private boolean corrige;
	private String commentaire;
	private TortueG tortueG;
	private TortueCouleur tortueC;
	private TortueRapide tortueR;

	
	    
	public Tentative(Exercice exercice) {
		this.exercice = exercice;
		this.statut = 1;
		this.corrige = false;
		listAction = new ArrayList<Action>();
	
	}
	

	/**
	 * Ajout de l'action à la tentative et réalisation de l'action 
	 * @param int code : code de l'action à faire 
	 * @see modele.ecole.Action
	 */
	public void ajoutAction(int code){
		switch (this.exercice.getTortue()) {
		case "normale":
			this.listAction.add(new Action(code, this.tortueG,true));
			break;
		case "rapide":
			this.listAction.add(new Action(code, this.tortueR,true));
			break;
		case "couleur":
			this.listAction.add(new Action(code, this.tortueC,true));
			break;
		default:
			break;
		}
		
	}
	
	/**
	 * Ajout de l'action à la tentative avec boolean pour savoir si l'action est faite ou non. 
	 * Fonction permettant de remplir la liste d'actions sans réaliser le dessin
	 * @param int code : code de l'action à faire 
	 * @param boolean doAction : True si on souhaite réaliser l'action sinon false
	 * @see modele.ecole.Action
	 */
	public void ajoutAction(int code, boolean doAction){
		switch (this.exercice.getTortue()) {
		case "normale":
			this.listAction.add(new Action(code, this.tortueG, doAction));
			break;
		case "rapide":
			this.listAction.add(new Action(code, this.tortueR, doAction));
			break;
		case "couleur":
			this.listAction.add(new Action(code, this.tortueC, doAction));
			break;
		default:
			break;
		}
		
	}
	
	/**
	 * Fonction pour recommencer la tentative
	 */
	public void resetTentative(){
		switch (this.exercice.getTortue()) {
		case "normale":
			this.tortueG.reset();
			break;
		case "rapide":
			this.tortueR.reset();
			break;
		case "couleur":
			this.tortueC.reset();
			break;
		default:
			break;
		}
		this.listAction = new ArrayList<Action>();
	}
	


	/**
	 * getAction permet de retourner la liste des  actions
	 * @return ArrayList<Action> liste des actions
	 * 
	 */
	
	public ArrayList<Action> getActions() {
		return this.listAction;
	}
	

	
	/**
	 * getAction permet de retourner l'exercice
	 */
	
	public Exercice getExercice() {
		return exercice;
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
	
	public int getNote() {
		return note;
	}
	
	/**
	 * Setter pour la note et le commentaire
	 * La correction ne peut être faite qu'une seule fois
	 * @param int note 
	 * @param String commentaire
	 */
	public void setCorrection(int note , String commentaire) {
		if (!this.corrige){
			this.note = note;
			this.commentaire = commentaire;
			this.corrige = true;
		}
	}
	
	public String getCommentaire() {
		return commentaire;
	}

	
	/**
	 * Methode pour initialialiser la tortue de l'exercice.
	 */
	public void initTortue(){
		switch (this.exercice.getTortue()) {
		case "normale":
			this.tortueG = new TortueG();
			break;
		case "rapide":
			this.tortueR= new TortueRapide();	
			break;
		case "couleur":
			this.tortueC = new TortueCouleur();
			break;
		default:
			break;
		}

	
	}
}
