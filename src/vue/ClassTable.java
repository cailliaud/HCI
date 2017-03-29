package vue;




import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

import modele.*;

public class ClassTable extends AbstractTableModel {
	private String[] columnNames = { "icone",  "Prenom", "Nom","garçon/fille","âge" };
	private Classe classe;


	public ClassTable(Classe classe){
		super();
		this.classe=classe;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {

		case 0:
			return classe.getListeEleves().get(rowIndex).getIcone();

		case 1:
			return classe.getListeEleves().get(rowIndex).getPrenom();

		case 2:
			return classe.getListeEleves().get(rowIndex).getNom();

		case 3:
			return classe.getListeEleves().get(rowIndex).getSexe();

		case 4:
			return classe.getListeEleves().get(rowIndex).getAge();
		default:
			return classe.getListeEleves().get(rowIndex);
		}
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 0: return ImageIcon.class;
		case 1: 
		case 2:
		case 3:

			return String.class;
		case 4 :
			return Integer.class;

		default:
			return Object.class;
		}
	}


	public void setClasse(Classe newClasse) {
		this.classe=newClasse;
	}
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	@Override
	public int getRowCount() {
		return classe.getListeEleves().size();
	}
	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public int getIndexOfPerson(Eleve eleve) {
		return classe.getListeEleves().indexOf(eleve);
	}



}
