package vue.navigation;

import javax.swing.table.AbstractTableModel;

/**
 * <b>ModelTableauTentative est le modèle pour générer un JTable contenant les Tentatives.
 * 
 * Il s'agit de la liste des Tentatives en attente de correction par un Professeur.
 *  </b>
 * 
 * <p>
 * Ce tableau contiendra :
 * <ul>
 * 	<li>Prenom de l'élève </li>
 *  <li>Nom de l'élève</li>
 *  <li>Numéro de L'exercice</li>
 *  <li>Numéro de de la tentative</li>
 * </ul>
 * </p>
 * <p>
 * Le ModelTableauTentative prendra en paramètre un professeur
 * </p>
 * @author Groupe 4 
 *
 */
public class ModelTableauTentative extends AbstractTableModel {

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
