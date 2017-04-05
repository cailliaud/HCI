package widget;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import modele.ecole.Utilisateur;

public class InfoUtil extends JPanel{
	
	private JLabel logo = new JLabel();
	private JLabel nomUtil = new JLabel();
	
	public InfoUtil(Utilisateur uti){
		
		this.setLayout(new BorderLayout());
		this.logo.setIcon(uti.getIcone());
		this.nomUtil.setText(uti.getPrenom());
		
		this.add(logo, BorderLayout.WEST);
		this.add(nomUtil, BorderLayout.CENTER);
		
	}
}
