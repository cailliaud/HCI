package widget.boutons;

import javax.swing.JButton;

import main.Main;

public class ExitButton extends JButton {
	public ExitButton(){
		super("Quitter");
		
		this.addActionListener(
				ae -> {
					Main.getNavigation().dispose();
					System.exit(0);

				});
	}

}
