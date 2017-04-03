package application;

import javax.swing.JFrame;

import application.general.VueConnexion;
import application.professeur.connexion.ModeleConnexionProf;
import application.professeur.connexion.VueConnexionProf;

public class Navigation extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6555169507835811820L;
	private ControleurApplication controleur= new ControleurApplication();

	public  Navigation(){
		super();

		this.add(new VueConnexion());
		this.setVisible(true);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	
	public void cleanFenetre(){
		this.getContentPane().removeAll();
		this.repaint();
		this.revalidate();
	}
	
	public ControleurApplication getControleurApp(){
		return this.controleur;
	}
	
	public void goAppProf(){
		this.getContentPane().removeAll();
		ModeleConnexionProf modelCoProf = new ModeleConnexionProf();
		VueConnexionProf vueCoProf = new VueConnexionProf(modelCoProf);
		this.add(vueCoProf);
		this.repaint();
		this.revalidate();
	}
	
	public void goAppEleve(){
		
	}
}