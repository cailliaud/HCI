package Main;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import application.professeur.connexion.VueConnexionProf;

public class ControleurMain {
	private JFrame fen;
	
	public ControleurMain(JFrame fenetre){
		this.fen = fenetre;
	}
	
	public void goApplicationEleve(){
		this.fen.getContentPane().removeAll();
		this.fen.repaint();
		this.fen.revalidate();
	}
	
	public void goApplicationProf(){
		this.fen.getContentPane().removeAll();
		VueConnexionProf coProf = new VueConnexionProf(this.fen, this);
		this.fen.repaint();
		this.fen.revalidate();
	}
	
	public void quitter(){
		this.fen.dispose();
		System.exit(0);
	}
	
	
	

}
