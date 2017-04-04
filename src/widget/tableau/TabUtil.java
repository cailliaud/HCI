package widget.tableau;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


import modele.ecole.Classe;
import modele.ecole.Professeur;

public class TabUtil extends JPanel{
	private JTable tableau;
	private TabUtilModel modele;
	private JScrollPane scroll;
	
	public TabUtil (ArrayList<Professeur> listProf){
	    modele= new TabUtilModel(listProf);
	    createJScroll();
		
		
	}
	
	public TabUtil (Classe classe){
	    modele= new TabUtilModel(classe);
	    createJScroll();
		
	}
	
	private void createJScroll(){
		tableau = new JTable(modele);
		tableau.setAutoCreateRowSorter(true);

		tableau.setRowHeight(100);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		for (int i = 1; i < tableau.getColumnModel().getColumnCount(); i++) {
			tableau.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );

		}	
		scroll = new JScrollPane(tableau);
		
		this.setLayout(new BorderLayout());
		this.add(scroll,BorderLayout.CENTER);
		this.add(scroll.getVerticalScrollBar(),BorderLayout.EAST);
		this.add(scroll.getHorizontalScrollBar(),BorderLayout.SOUTH);
	}
	
	public JTable getTable(){
		return this.tableau;
	}

}
