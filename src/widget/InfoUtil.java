package widget;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import modele.ecole.Utilisateur;

public class InfoUtil extends JPanel{
	
	protected JButton logo = new JButton();
	protected JLabel nomUtil = new JLabel();
	protected Utilisateur uti;
	
	
	public InfoUtil(String string){
		this.nomUtil = new JLabel(string, SwingConstants.CENTER);
	}
	public InfoUtil(Utilisateur uti){
		
		this.uti = uti;
		this.setLayout(new BorderLayout());
		this.logo.setIcon(uti.getIcone());
		this.nomUtil.setText(uti.getPrenom());
		
		this.add(logo, BorderLayout.WEST);
		this.add(nomUtil, BorderLayout.CENTER);
		
	}
	

	

}
