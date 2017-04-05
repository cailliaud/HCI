package widget.boutons;

import javax.swing.JButton;

import application.ControleurApplication;
import main.Main;

public class HomeButton extends JButton {
	public HomeButton(){
		super("Retour Accueil");
		
		this.addActionListener(
				ae -> {
					Main.getNavigation().goHome();
				});
	}

}
