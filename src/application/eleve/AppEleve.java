package application.eleve;


import java.util.ArrayList;


import modele.ecole.Eleve;
import modele.ecole.Professeur;

public class AppEleve {

	private ChoixProf choixProf;
	private Eleve eleve;
	private Professeur prof;

	public AppEleve() {

		choixProf = new ChoixProf();

		

	}
	
	public ChoixProf getChoixEleveV(){
		return this.choixProf;
	}

	public void setEleve(Eleve el){
		this.eleve = el;
		
	}
	
	public void setProf(Professeur prof){
		this.prof = prof;
	}
	
}


