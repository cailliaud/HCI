package application.eleve;


import java.util.ArrayList;


import modele.ecole.Eleve;

public class AppEleve {

	private ChoixProf choixProf;
	private ArrayList<Eleve> eleves = new ArrayList<Eleve>();


	public AppEleve() {

		choixProf = new ChoixProf();

		

	}
	
	public ChoixProf getChoixEleveV(){
		return this.choixProf;
	}

	
}


