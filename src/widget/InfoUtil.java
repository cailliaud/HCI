package widget;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import modele.ecole.Utilisateur;

public class InfoUtil extends JPanel{
	
	private JLabel logo = new JLabel();
	private JLabel nomUtil = new JLabel();
	
	public InfoUtil(Utilisateur uti){
		
		this.setLayout(new BorderLayout());
		this.logo.setIcon(uti.getIcone());
		this.logo.setHorizontalAlignment(SwingConstants.LEFT);
		this.nomUtil.setText(uti.getPrenom());
		this.nomUtil.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		this.add(logo, BorderLayout.WEST);
		this.add(nomUtil, BorderLayout.CENTER);
		
	}
}
