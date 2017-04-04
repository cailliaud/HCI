package application.general;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


import modele.ecole.Classe;
import modele.ecole.Professeur;

public class TabUtil extends JScrollPane{
	private JTable tableau;
	private TabUtilModel modele;
	
	public TabUtil (ArrayList<Professeur> listProf){
	    modele= new TabUtilModel(listProf);
		tableau = new JTable(modele);
		tableau.setAutoCreateRowSorter(true);
	
		tableau.setRowHeight(100);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		for (int i = 1; i < tableau.getColumnModel().getColumnCount(); i++) {
			tableau.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
	
		}	
		this.add(tableau);
	}
	
	public TabUtil (Classe classe){
	    modele= new TabUtilModel(classe);
		tableau = new JTable(modele);
		tableau.setAutoCreateRowSorter(true);

		tableau.setRowHeight(100);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		for (int i = 1; i < tableau.getColumnModel().getColumnCount(); i++) {
			tableau.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );

		}	
		this.add(tableau);
	}

}
