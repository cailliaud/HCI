package application.general;


import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import application.ControleurApplication;
import main.Main;


public class VueConnexion extends JPanel {
	private JLabel logo;
	private JButton eleveChoix, profChoix;
	private JButton exit;
	
	public VueConnexion ( ){
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
		exit = new JButton("Quitter");
		this.add(exit,BorderLayout.EAST);
		this.addListener();
	}
	
	private void addListener(){
		this.eleveChoix.addActionListener(
				ae ->{
					 Main.getNavigation().getControleurApp().goApplicationEleve();
				});
		this.profChoix.addActionListener(
				ae ->{
					 Main.getNavigation().getControleurApp().goApplicationProf();
				});
		
		this.exit.addActionListener(
				ae ->{
					 Main.getNavigation().getControleurApp().quitter();
				});
	}
}
