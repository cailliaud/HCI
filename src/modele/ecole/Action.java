package modele.ecole;

import modele.tortue.TortueG;

/**
 * @author Anatole
 * Stockage des actions avec  leur code, la tortue utilisée et l'ordre dans la tentative
 */
public class Action {	
	

	/**
	 * codeAction int représente les différentes actions possibles :
	 * 1 -> avancer,
	 * 2 -> tourner,
	 * 3 -> ecrire,
	 * 4 -> arreter d'écrire,
	 * 5 -> changer de couleur : un id par couleur
	 * 6 -> changer de vitesse : un id par vitesse
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
	
	//rejouer une action
	


	public int getCodeAction() {
		return codeAction;
	}


	
	public TortueG getTortue() {
		return tortue;
	}
}
