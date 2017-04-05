package application.eleve;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import widget.boutons.HomeButton;

public class VueAppEleve extends JPanel {
	private JLabel logo;
	private JPanel center;
    private JPanel connect;
    private JPanel entete;

	
	public VueAppEleve(){
		this.entete = new JPanel();
		this.entete.setLayout(new BorderLayout());
		this.connect = new JPanel();
		this.connect.add(new JLabel("Eleve"));
		this.logo = new JLabel("Choix Professeur",SwingConstants.CENTER);
		this.entete.add(connect, BorderLayout.WEST);
		this.entete.add(logo, BorderLayout.CENTER);
		HomeButton exit = new HomeButton();
		this.entete.add(exit, BorderLayout.EAST);
		

		
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
	
	public void setConnect(JPanel newConnect){
		this.entete.remove(this.connect);
		this.connect=newConnect;
		this.entete.add(this.connect, BorderLayout.WEST);
	}
}
