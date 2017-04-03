package application;

import javax.swing.JFrame;

import application.general.VueConnexion;

public class Navigation extends JFrame {

	private ControleurApplication controleur;

	
	public  Navigation(){
		super();
		this.controleur = new ControleurApplication(this);
		
	
		this.add(new VueConnexion(this.controleur));

		
		this.setVisible(true);
		this.pack();
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
	
	
	public void cleanFenetre(){
		this.getContentPane().removeAll();
		this.repaint();
		this.revalidate();
	}
}
