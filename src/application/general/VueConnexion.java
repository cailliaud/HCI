package application.general;


import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import application.ControleurApplication;
import main.Main;


public class VueConnexion extends JPanel {
	private JLabel logo;
	private JButton eleveChoix, profChoix;
	private ExitButton exit;
	
	
	public VueConnexion ( ){
		JPanel entete = new JPanel();
		entete.setLayout(new BorderLayout());
		JLabel connect = new JLabel("Non Connecté");
		this.logo = new JLabel("TEST",SwingConstants.CENTER);
		entete.add(connect, BorderLayout.WEST);
		entete.add(logo, BorderLayout.CENTER);
		exit = new ExitButton();
		entete.add(exit, BorderLayout.EAST);
		
		// Panel des boutons 
		this.eleveChoix = new JButton(new ImageIcon("src/ressources/children.png"));
		this.profChoix = new JButton(new ImageIcon("src/ressources/teacher.png"));
		JPanel choix = new JPanel();
		choix.setLayout(new GridLayout(1,2));
		choix.add(eleveChoix);
		choix.add(profChoix);
		
		
		
		this.setLayout(new BorderLayout());
		
		this.add(entete, BorderLayout.NORTH);
		this.add(choix, BorderLayout.CENTER);
		this.add(new JPanel(), BorderLayout.EAST);
		this.add(new JPanel(), BorderLayout.WEST);
		this.add(new JPanel(), BorderLayout.SOUTH);
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
		
	
	}
}
