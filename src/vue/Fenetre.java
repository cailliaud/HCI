package vue;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controleur.*;
import modele.Classe;

public class Fenetre extends JFrame {

	private Menu_Lateral menuLat;
	private VueClasse vueClasse;
	private VueInfo vueInfo;
	private JPanel droite = new JPanel();


	public Fenetre(ArrayList<Classe> mesClasse){



		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("JTree & JTable");    
		vueClasse= new VueClasse(mesClasse);
		vueInfo = new VueInfo();
		menuLat = new Menu_Lateral( mesClasse);



		this.setLayout(new BorderLayout());
		this.add(menuLat, BorderLayout.WEST);
		droite.setLayout( new GridLayout(2, 1));
		droite.add(vueInfo);
		droite.add(vueClasse);
		this.add(droite, BorderLayout.CENTER);

		this.setExtendedState(JFrame.MAXIMIZED_BOTH);		
		this.pack();
		this.setVisible(true);
		this.validate();
	}

	public Menu_Lateral getMenuLat(){
		return this.menuLat;
	}

	public VueClasse getVueClasse(){
		return this.vueClasse;
	}

	public VueInfo getVueInfo(){
		return this.vueInfo;
	}


}
