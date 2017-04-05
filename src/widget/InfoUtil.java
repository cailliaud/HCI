package widget;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import modele.ecole.Utilisateur;

public class InfoUtil extends JPanel{
	
	private JLabel logo = new JLabel();
	private JLabel nomUtil;
	
	public InfoUtil(Utilisateur uti){
		
		this.setLayout(new BorderLayout());
		this.logo.setIcon(uti.getIcone());
		this.nomUtil = new JLabel(uti.getPrenom(), JLabel.CENTER);
		
		this.add(logo, BorderLayout.WEST);
		this.add(nomUtil, BorderLayout.CENTER);
		
	}
}
