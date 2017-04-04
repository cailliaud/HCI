package exercice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modele.tortue.CanvasTortue;

public class MenuExoListener implements ActionListener {

	private String action;
	private VueMenuAction vue;
	
	public MenuExoListener(VueMenuAction vue, String action) {
		this.vue = vue;
		this.action = action;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(action) {
		
			case "avancer": vue.avancer();
				break;
			case "tourner": vue.tourner();
				break;
				
			case "reset": vue.reset();
			break;
			case "ecrire": 
				vue.ecrire();
				break;
			default:System.out.println("erreur de saisie");
				break;
		
		}
		
	}

}
