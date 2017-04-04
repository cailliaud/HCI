package widget.boutons;

import javax.swing.JButton;

import application.ControleurApplication;
import main.Main;

public class RetourButton extends JButton {
	public RetourButton(){
		super("Retour");
		
		this.addActionListener(
				ae -> {
					Main.getNavigation().goHome();
				});
	}

}
