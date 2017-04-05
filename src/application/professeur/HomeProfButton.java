package application.professeur;

import application.eleve.ControleurAppEleve;
import widget.InfoUtil;

public class HomeProfButton extends InfoUtil {
	public HomeProfButton() {
		super("Professeur");
		// TODO Auto-generated constructor stub
	}
	public HomeProfButton(ControleurAppProf controleur) {
		super(controleur.getProfesseur());
		this.logo.addActionListener(
				l->{
					controleur.goMenu();
				});
		
		
	}
}
