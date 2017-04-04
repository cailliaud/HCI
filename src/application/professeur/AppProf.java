package application.professeur;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import application.general.ExitButton;
import application.professeur.connexion.ModeleConnexionProf;
import application.professeur.connexion.VueConnexionProf;
import application.professeur.menu.MenuProf;
import modele.ecole.Professeur;

public class AppProf {
	private Professeur prof;
	private JPanel vueAppliProf = new JPanel();
	private JLabel logo;
	private ControleurAppProf controleur;
	
	public AppProf(){
		JPanel entete = new JPanel();
		entete.setLayout(new BorderLayout());
		JLabel connect = new JLabel("PROFESSEUR");
		this.logo = new JLabel("Connexion à un Compte Professeur",SwingConstants.CENTER);
		entete.add(connect, BorderLayout.WEST);
		entete.add(logo, BorderLayout.CENTER);
		ExitButton exit = new ExitButton();
		entete.add(exit, BorderLayout.EAST);
		
	
		
		this.vueAppliProf.setLayout(new BorderLayout());
		
		this.vueAppliProf.add(entete, BorderLayout.NORTH);
		this.vueAppliProf.add(new JPanel(), BorderLayout.EAST);
		this.vueAppliProf.add(new JPanel(), BorderLayout.WEST);
		this.vueAppliProf.add(new JPanel(), BorderLayout.SOUTH);
		
		ModeleConnexionProf modelCoProf = new ModeleConnexionProf();
		VueConnexionProf vueCoProf = new VueConnexionProf(modelCoProf);
		this.vueAppliProf.add(vueCoProf, BorderLayout.CENTER);

		controleur = new ControleurAppProf(this);
		
		
	}
	
	public void setCenter(JPanel center){
		this.vueAppliProf.add(center, BorderLayout.CENTER);
		
	}
	
	public JPanel getvueAppliProf(){
		return this.vueAppliProf;
	}
	
	public void goConnexionProf(){
		ModeleConnexionProf modelCoProf = new ModeleConnexionProf();
		VueConnexionProf vueCoProf = new VueConnexionProf(modelCoProf);
		this.logo.setText("Connexion à un Compte Professeur");
		this.vueAppliProf.add(vueCoProf, BorderLayout.CENTER);
		this.vueAppliProf.repaint();
		this.vueAppliProf.revalidate();
		
	}
	
	public void goMenu(){
		MenuProf menu = new MenuProf();
		this.logo.setText("Menu");
		this.vueAppliProf.add(menu, BorderLayout.CENTER);
		this.vueAppliProf.repaint();
		this.vueAppliProf.revalidate();
	}
	

	

}
