package application.professeur.connexion;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import application.ControleurApplication;

public class VueConnexionProf  extends JPanel{
	private JFrame fenetre;
	private JLabel logo;
	private JPanel coPanel;
	private JButton eleveChoix, profChoix;
	private ControleurApplication controleur;
	private JButton exit;
	
	public VueConnexionProf(JFrame fenetre, ControleurApplication controleur) {
		this.controleur=controleur;
		this.fenetre=fenetre;
		
		this.setLayout(new BorderLayout());
		this.logo = new JLabel("Connexion Professeur");
		this.add(logo,BorderLayout.NORTH);
		this.fenetre.add(this);
		
	}
}
