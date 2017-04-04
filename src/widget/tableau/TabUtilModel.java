package widget.tableau;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

import modele.ecole.Classe;
import modele.ecole.Eleve;
import modele.ecole.Professeur;
import modele.ecole.Utilisateur;

public class TabUtilModel extends AbstractTableModel {

	private String[] columnNames = { "icone",  "Prenom", "Nom" };
	private ArrayList<Eleve> listEleve;
	private ArrayList<Professeur> listProfesseur;
	private boolean isListofProf;
	
	public  TabUtilModel(Classe classe) {
		super();
		this.listEleve = classe.getListeEleves();
		isListofProf = false;
	}
	
	public  TabUtilModel(ArrayList<Professeur> listProf) {
		this.listProfesseur=listProf;
		isListofProf = true;
	}
	
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		if (isListofProf){
			return this.listProfesseur.size();
		}else {
			return this.listEleve.size();
		}
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {

		case 0:
			return ((this.isListofProf) ? this.listProfesseur.get(rowIndex).getIcone() : this.listEleve.get(rowIndex).getIcone() );

		case 1:
			return ((this.isListofProf) ? this.listProfesseur.get(rowIndex).getPrenom() : this.listEleve.get(rowIndex).getPrenom());

		case 2:
			return ((this.isListofProf) ? this.listProfesseur.get(rowIndex).getNom() : this.listEleve.get(rowIndex).getNom());

		default:
			return ((this.isListofProf) ? this.listProfesseur.get(rowIndex) : this.listEleve.get(rowIndex));
		}
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 0: return ImageIcon.class;
		case 1: 
		case 2:

			return String.class;

		default:
			return Object.class;
		}
	}
	
	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}
}
