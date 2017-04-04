package application;

import javax.swing.JFrame;

import application.eleve.AppEleve;
import application.general.VueConnexion;
import application.professeur.AppProf;
import application.professeur.ControleurAppProf;
import application.professeur.connexion.ModeleConnexionProf;
import application.professeur.connexion.VueConnexionProf;
import exercice.VueExercice;

public class Navigation extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6555169507835811820L;
	private ControleurApplication controleur= new ControleurApplication();

	public  Navigation(){
		super("Navigation");

		this.add(new VueConnexion());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setUndecorated (true);
		this.setResizable(false);
		this.setVisible (true);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 

		
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
		ControleurAppProf applicationProf = new ControleurAppProf();
		this.add(applicationProf.getvueAppliProf());
		this.repaint();
		this.revalidate();
	}
	
	public void goAppEleve(){
		this.getContentPane().removeAll();
		AppEleve applicationEleve = new AppEleve();
		this.add(applicationEleve.getChoixEleveV());
		//VueExercice exercice = new VueExercice();
		//this.add(exercice.getExercice());
		this.repaint();
		this.revalidate();
		
		
	}
}
