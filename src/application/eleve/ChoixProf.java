package application.eleve;


import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import application.general.tabutilisateur.TabUtil;
import main.Main;
import modele.ecole.Eleve;

public class ChoixProf extends JPanel {
		
	private TabUtil tabUtil;
	

	public ChoixProf () {
		tabUtil = new TabUtil(Main.getListProf());

	    this.add(tabUtil);
	    
	}
	
}


