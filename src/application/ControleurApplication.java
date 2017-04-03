package application;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import application.professeur.connexion.VueConnexionProf;

public class ControleurApplication {
	private Navigation nav;
	
	public ControleurApplication(Navigation nav){
		this.nav = nav;
	}
	

	public void quitter(){
		this.nav.dispose();
		System.exit(0);
	}
	
	public void goApplicationEleve(){
		
	}
	
	public void goApplicationProf(){
		this.nav.goAppProf();
	}
	

	

}
