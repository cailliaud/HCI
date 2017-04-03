package application;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import application.professeur.connexion.VueConnexionProf;

public class ControleurApplication {
	private JFrame fen;
	
	public ControleurApplication(JFrame fenetre){
		this.fen = fenetre;
	}
	
	public void goApplicationEleve(){
		this.fen.getContentPane().removeAll();
		this.fen.repaint();
		this.fen.revalidate();
	}
	
	public void goApplicationProf(){
		this.fen.getContentPane().removeAll();
		this.fen.add(new VueConnexionProf());
		this.fen.repaint();
		this.fen.revalidate();
		
	}
	
	public void quitter(){
		this.fen.dispose();
		System.exit(0);
	}
	
	

	

}
