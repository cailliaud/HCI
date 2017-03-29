package modele;

/**
 * @author Anatole
 * Stockage des actions avec leur id, leur code, la tortue utilisée et l'ordre dans la tentative
 */
public class Action {	
	
	/**
	 * idAction int identifiant de l'action, autoincrement
	 */
	private int idAction;
	/**
	 * codeAction int représente les différentes actions possibles :
	 * 1 -> avancer,
	 * 2 -> tourner,
	 * 3 -> ecrire,
	 * 4 -> arreter d'écrire,
	 * 5 -> changer de couleur,
	 * 6 -> changer de vitesse.
	 */
	private int codeAction;
	/**
	 * ordreAction int définit l'ordre de l'action dans la tentative
	 */
	private int ordreAction;
	/**
	 * tortue TortueG tortue utilisée dans la tentative
	 */
	private TortueG tortue;
	
	/**
	 * Creation d'une action
	 * @param codeAction
	 * @param ordreAction
	 * @param tortue
	 */
	public Action(int codeAction, int ordreAction, TortueG tortue) {
		this.codeAction = codeAction;
		this.ordreAction = ordreAction;
		this.tortue = tortue;
	}
	
	public int getIdAction() {
		return idAction;
	}

	public int getCodeAction() {
		return codeAction;
	}

	public int getOrdreAction() {
		return ordreAction;
	}
	
	public TortueG getTortue() {
		return tortue;
	}
}