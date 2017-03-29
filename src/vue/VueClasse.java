package vue;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modele.*;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;


/**
 * Class VueClasse
 * CLass allowing to generate the JPanel with all the information about a Class
 * Information are displayed and stored in a JTable
 * @author caill
 *
 */
public class VueClasse extends JPanel {
	/**
	 * JTable 
	 */
	private JTable tableau;
	private JButton change = new JButton("Changer la taille");
	private String[] comboData = {"Très bien", "Bien", "Mal"};
	private String supp = "Supprimer la ligne";
	private JComboBox combo;
	private ClassTable modele;
	public VueClasse(ArrayList<Classe> mesClasses){
		createContent(mesClasses);

	}
	private void createContent(ArrayList<Classe> mesClasses){

		modele = new ClassTable(mesClasses.get(1));
		tableau = new JTable(modele);
		tableau.setAutoCreateRowSorter(true);

		tableau.setRowHeight(100);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		for (int i = 1; i < tableau.getColumnModel().getColumnCount(); i++) {
			tableau.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );

		}	
		JScrollPane jScrollPane = new JScrollPane(tableau);

		this.setLayout(new BorderLayout());
		this.add((new JLabel("Tableau Récapitulatif de la Classe", SwingConstants.CENTER)), BorderLayout.NORTH);
		this.add(jScrollPane,BorderLayout.CENTER);
		this.add(jScrollPane.getVerticalScrollBar(),BorderLayout.EAST);
		this.add(jScrollPane.getHorizontalScrollBar(),BorderLayout.SOUTH);




	}


	public void setData(Classe newClasse){
		modele.setClasse(newClasse);
		modele.fireTableDataChanged();
	}

	public JTable getTable(){
		return this.tableau;
	}


}