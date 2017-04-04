package application.eleve;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import widget.boutons.RetourButton;

public class VueAppEleve extends JPanel {
	private JLabel logo;
	private JPanel center;

	
	public VueAppEleve(){
		JPanel entete = new JPanel();
		entete.setLayout(new BorderLayout());
		JLabel connect = new JLabel("Eleve");
		this.logo = new JLabel("Choix Professeur",SwingConstants.CENTER);
		entete.add(connect, BorderLayout.WEST);
		entete.add(logo, BorderLayout.CENTER);
		RetourButton exit = new RetourButton();
		entete.add(exit, BorderLayout.EAST);
		

		
		this.setLayout(new BorderLayout());
		this.center = new JPanel();
		this.add(entete, BorderLayout.NORTH);
		this.add(new JPanel(), BorderLayout.EAST);
		this.add(new JPanel(), BorderLayout.WEST);
		this.add(new JPanel(), BorderLayout.SOUTH);
		this.add(this.center, BorderLayout.CENTER);
		
	}
	
	public void setCenter(JPanel newCenter){
		
		this.remove(this.center);
		this.center= newCenter;
		this.add(this.center, BorderLayout.CENTER);
	
		
		
	}
	
	public void setTitle(String title){
		this.logo.setText(title);
	}
	
}
