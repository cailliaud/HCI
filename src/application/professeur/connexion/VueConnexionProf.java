package application.professeur.connexion;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import application.ControleurApplication;


public class VueConnexionProf  extends JPanel{
	private JLabel titre, labLogin, labMdp;
	private JTextField champLogin, champMdp;
	private JPanel panelCo;
	private JButton submit;
	private ControleurConnexionProf controleur;

	public VueConnexionProf(ControleurConnexionProf controleur) {
		
		this.controleur=controleur;
		this.titre = new JLabel("Identifiez-vous");
		this.labLogin = new JLabel("Login :");
		this.champLogin = new JTextField();
		this.labMdp = new JLabel("Mot de passe :");
		this.champMdp = new JTextField();
		
		panelCo = new JPanel(new GridLayout(4,1));
		panelCo.add(labLogin);
		panelCo.add(champLogin);
		panelCo.add(labMdp);
		panelCo.add(champMdp);
		
		submit = new JButton("Connexion");
		this.add(titre, BorderLayout.NORTH);
		this.add(panelCo, BorderLayout.CENTER);
		this.add(submit, BorderLayout.SOUTH);
		
		this.addListener();

	}
	
	
	public String getChampLogin() {
		return champLogin.getText();
	}

	public String getChampMdp() {
		return champMdp.getText();
	}

	public void erreurConnexion(){
		JOptionPane.showMessageDialog(this, "Les identifiants sont incorrects", "Erreur", JOptionPane.ERROR_MESSAGE);
	}

	private void addListener(){
		this.submit.addActionListener(
				ae ->{
					this.controleur.submitFormulaire();
				});
	}
}
