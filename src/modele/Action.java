package modele;

public class Action {
	
	private int idAction;
	private int codeAction;
	private int ordreAction;
	
	public Action(int codeAction, int ordreAction) {
		this.codeAction = codeAction;
		this.ordreAction = ordreAction;
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
}