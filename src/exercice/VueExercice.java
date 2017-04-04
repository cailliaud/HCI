package exercice;

import javax.swing.JFrame;

import application.general.VueConnexion;
import modele.tortue.*;

public class VueExercice extends JFrame {
	
	
	public VueExercice() {
		
		
		this.add(new VueConnexion());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setUndecorated (true);
		this.setResizable(false);
		this.setVisible (true);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 

		
		CanvasTortue.reset();
		
		
		
	}
	
	
}
