package application.professeur;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import application.general.ExitButton;
import application.professeur.connexion.ControleurConnexionProf;
import application.professeur.connexion.ModeleConnexionProf;
import application.professeur.connexion.VueConnexionProf;
import application.professeur.menu.MenuProf;
import modele.ecole.Professeur;

public class AppProf {
	private Professeur prof;
	private ControleurAppProf controleur;

	public AppProf(ControleurAppProf controleur ){
		this.controleur = controleur;	
	}
	
	
	public JPanel getConnexionProf(){
		ControleurConnexionProf coProf = new ControleurConnexionProf(this.controleur);
		return coProf.getVue();		
	}
	
	public JPanel getMenu(){
		MenuProf menu = new MenuProf();
		return menu;

	}
	

	

}
