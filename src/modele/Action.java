package modele;

public class Action {
	
	//Declaration des variables
	private int idAction;
	private int codeAction;
	private int ordreAction;
	private TortueG tortue;
	
	//Constructeur
	public Action(int codeAction, int ordreAction, TortueG tortue) {
		this.codeAction = codeAction;
		this.ordreAction = ordreAction;
		this.tortue = tortue;
	}
	
	
	
	
	//Getters
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