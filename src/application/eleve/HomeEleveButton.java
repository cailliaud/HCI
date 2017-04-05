package application.eleve;

import modele.ecole.Eleve;
import widget.InfoUtil;

public class HomeEleveButton extends InfoUtil {

	public HomeEleveButton() {
		super("Eleve");
		// TODO Auto-generated constructor stub
	}
	public HomeEleveButton(ControleurAppEleve controleur) {
		super(controleur.getEleve());
		this.logo.addActionListener(
				l->{
					controleur.goMenuEleve();
				});
		
		
	}

}
