package VueWip;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import modele.ecole.Eleve;

public class ChoixEleveV extends JPanel {
	
	private JTable table;
	private TabChoixUtil tableModel;
	private ChoixEleveM modele;

	public ChoixEleveV (ChoixEleveM modele) {
		this.modele = modele;

	
	    tableModel = new TabChoixUtil(modele);
	    table = new JTable(tableModel);
	    JScrollPane scrollPane = new JScrollPane(table);
	    this.add(scrollPane);
	    
	}
	
}
