package vue.navigation;




import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

import modele.*;


/**
 * <b>ModelTableauChoixEleve est le modele pour générer un JTable contenant des élèves </b>
 * 
 * <p>
 * Ce tableau contiendra :
 * <ul>
 * 	<li>Icone de l'élève </li>
 *  <li>Prénom de l'élève</li>
 * </ul>
 * </p>
 * <p>
 * Le ModelTableauChoixEleve prendra en paramètre un professeur afin de récupérer sa Classe.
 * A partir de cette classe il sera possible de récupérer la liste des élèves.
 * </p>
 * @author Groupe 4 
 *
 */
public class ModelTableauChoixEleve extends AbstractTableModel {

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
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	

}