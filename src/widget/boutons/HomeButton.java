package widget.boutons;

import javax.swing.JButton;

import application.ControleurApplication;
import main.Main;

public class HomeButton extends JButton {
	public HomeButton(){
		super("Déconnexion");
		
		this.addActionListener(
				ae -> {
					Main.getNavigation().goHome();
				});
	}

}
