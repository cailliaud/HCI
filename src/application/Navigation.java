package application;

import javax.swing.JFrame;

import application.general.VueConnexion;
import application.professeur.connexion.VueConnexionProf;

public class Navigation extends JFrame {
	private ControleurApplication controleur;
	
	public  Navigation(){
		super();
		this.controleur= new ControleurApplication(this);
		this.add(new VueConnexion(this.controleur));
		
		this.setVisible(true);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		fen.add(Canvas.getCanvasPanel());
//		
//		this.test = new Exercice("test","Couleur");
//		this.tentative = new Tentative(test);
//		for (int i = 0; i < 3; i++) {
//			this.tentative.ajoutAction(1,false);
//			this.tentative.ajoutAction(6,false);
//		}
//		this.tentative.rejouerTentative();
		
		
		
	}
	
	
	private void cleanFenetre(){
		this.getContentPane().removeAll();
		this.repaint();
		this.revalidate();
	}
	
	public void goAppProf(){
		this.getContentPane().removeAll();
		this.add(new VueConnexionProf());
		this.repaint();
		this.revalidate();
	}
}
