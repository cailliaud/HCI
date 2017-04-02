package modele.ecole;

import modele.tortue.TortueCouleur;
import modele.tortue.TortueG;
import modele.tortue.TortueRapide;

/**
 * @author Anatole
 * Stockage des actions avec  leur code, la tortue utilisée
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
	 * <li>10. changer de couleur : magenta</li>
	 * <li>11. accélerer Tortue</li>
	 * <li>12. ralentir la Tortue</li>
	 * </ul>
	 */
	private int codeAction;


	/**
	 * tortue TortueG tortue utilisée dans la tentative 
	 */
	private TortueG tortue;
	
	
	
	/**
	 * Creation d'une action
	 * Si le code de l'action n'est pas correcte, il est défini à 1 (avancer).
	 * @param codeAction Code de l'action de la Tortue
	 * @param tortue Tortue utilisée
	 * @param boolean doAction true si on veut réaliser l'action
	 */
	public Action(int codeAction,  TortueG tortue , boolean doAction) {
		if (codeAction <1 || codeAction >12){
			codeAction = 1;
		}
		this.codeAction = codeAction;
		this.tortue = tortue;
		if (doAction){
			faireAction();
		}
	}
	
	/**
	 * Permet d'executer une action selon la tortue
	 */
	public void faireAction() {
		switch (this.codeAction) {
		// Tortue avance
		case 1:
			this.tortue.avancer();
			break;
			
		// Tortue tourne
		case 2:
			this.tortue.tourner();	
			break;
			
		// Tortue trace
		case 3:
			this.tortue.tracer(true);
			break;
			
		// Tortue arrête de tracer
		case 4:
			this.tortue.tracer(false);
			break;
			
		// Tortue change de couleur : Rouge
		case 5:
			if (tortue instanceof TortueCouleur) {
				TortueCouleur tortueC = (TortueCouleur) tortue;
				tortueC.setCouleur("red");
			}
			break;
			
		// Tortue change de couleur : Verte
		case 6:
			if (tortue instanceof TortueCouleur) {
				TortueCouleur tortueC = (TortueCouleur) tortue;
				tortueC.setCouleur("green");
			}
			break;
			
		// Tortue change de couleur : Bleue
		case 7:
			if (tortue instanceof TortueCouleur) {
				TortueCouleur tortueC = (TortueCouleur) tortue;
				tortueC.setCouleur("blue");
			}
			break;
			
		// Tortue change de couleur : Jaune
		case 8:
			if (tortue instanceof TortueCouleur) {
				TortueCouleur tortueC = (TortueCouleur) tortue;
				tortueC.setCouleur("yellow");
			}
			break;
			
		// Tortue change de couleur : Noire
		case 9:
			if (tortue instanceof TortueCouleur) {
				TortueCouleur tortueC = (TortueCouleur) tortue;
				tortueC.setCouleur("black");
			}
			break;
			
		// Tortue change de couleur : Magenta
		case 10:
			if (tortue instanceof TortueCouleur) {
				TortueCouleur tortueC = (TortueCouleur) tortue;
				tortueC.setCouleur("magenta");
			}
			break;
			
		// Accélerer la Tortue
		case 11:
			if (tortue instanceof TortueRapide) {
				TortueRapide tortueR = (TortueRapide) tortue;
				tortueR.accelerer();
			}
			break;
			
		// Ralentir la Tortue
		case 12:
			if (tortue instanceof TortueRapide) {
				TortueRapide tortueR = (TortueRapide) tortue;
				tortueR.ralentir();
			}
			break;


		default:
			break;
		}
	}
	

	public void setTortue(TortueG tortueG){
		this.tortue = tortueG;
	}
	
	public int getCodeAction() {
		return codeAction;
	}


	
	public TortueG getTortue() {
		return tortue;
	}
}
