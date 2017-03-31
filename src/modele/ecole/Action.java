package modele.ecole;

import modele.tortue.TortueG;

/**
 * @author Anatole
 * Stockage des actions avec  leur code, la tortue utilisée et l'ordre dans la tentative
 */
public class Action {	
	

	/**
	 * <b>codeAction int représente les différentes actions possibles :</b>
	 * <ul>
	 * <li>1. avancer,</li>
	 * <li>2. tourner,</li>
	 * <li>3. ecrire,</li>
	 * <li>4. arreter d'écrire,</li>
	 * <li>5. changer de couleur : rouge</li>
	 * <li>6. changer de couleur : vert</li>
	 * <li>7. changer de couleur : bleu</li>
	 * <li>8. changer de couleur : jaune</li>
	 * <li>9. changer de couleur : noir</li>
	 * <li>10. changer de vitesse : lent</li>
	 * <li>11. changer de vitesse : normal</li>
	 * <li>12. changer de vitesse : rapide</li>
	 * </ul>
	 */
	private int codeAction;

	/**
	 * Paramètre de l'action
	 * La couleur choisie ou la vitesse
	 */
	
	private String parametre;
	/**
	 * tortue TortueG tortue utilisée dans la tentative --> inutile : index arraylist
	 */
	
	private TortueG tortue;
	
	
	
	/**
	 * Creation d'une action
	 * @param codeAction
	 * @param ordreAction
	 * @param tortue
	 */
	public Action(int codeAction,  TortueG tortue) {
		this.codeAction = codeAction;
		this.tortue = tortue;
	}
	
	/**
	 * Permet d'executer une action selon la tortue
	 */
	public void faireAction() {
		
	}
	


	public int getCodeAction() {
		return codeAction;
	}


	
	public TortueG getTortue() {
		return tortue;
	}
}
