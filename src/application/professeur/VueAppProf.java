package application.professeur;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import application.general.ExitButton;

public class VueAppProf extends JPanel {
	private JLabel logo;

	
	public VueAppProf(){
		JPanel entete = new JPanel();
		entete.setLayout(new BorderLayout());
		JLabel connect = new JLabel("PROFESSEUR");
		this.logo = new JLabel("Connexion à un Compte Professeur",SwingConstants.CENTER);
		entete.add(connect, BorderLayout.WEST);
		entete.add(logo, BorderLayout.CENTER);
		ExitButton exit = new ExitButton();
		entete.add(exit, BorderLayout.EAST);
		

		
		this.setLayout(new BorderLayout());
		
		this.add(entete, BorderLayout.NORTH);
		this.add(new JPanel(), BorderLayout.EAST);
		this.add(new JPanel(), BorderLayout.WEST);
		this.add(new JPanel(), BorderLayout.SOUTH);
		
	}
	
	public void setCenter(JPanel center){
		this.add(center, BorderLayout.CENTER);
	
		
		
	}
	
	public void setTitle(String title){
		this.logo.setText(title);
	}
	
	
}
