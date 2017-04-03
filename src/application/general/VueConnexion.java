package application.general;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VueConnexion extends JPanel {
	private JFrame fenetre;
	private JLabel logo;
	private JButton eleveChoix, profChoix;
	private ControleurConnexion controleur;
	
	public VueConnexion (JFrame fenetre){
		
		this.fenetre=fenetre;
		this.logo = new JLabel("TEST");
		this.eleveChoix = new JButton("Je suis un eleve");
		this.profChoix = new JButton("Je suis un professeur");
		this.setLayout(new BorderLayout());
		this.add(logo, BorderLayout.NORTH);
		JPanel choix = new JPanel();
		choix.setLayout(new GridLayout(1,2));
		this.add(logo, BorderLayout.NORTH);
		choix.add(eleveChoix);
		choix.add(profChoix);
		this.add(choix, BorderLayout.CENTER);
		this.addListener();
	}
	
	private void addListener(){
		controleur = new ControleurConnexion(this.fenetre);
		this.eleveChoix.addActionListener(
				ae ->{
					controleur.goApplicationEleve();
				});
		this.profChoix.addActionListener(
				ae ->{
					controleur.goApplicationProf();
				});
	}
}
