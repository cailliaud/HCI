package VueWip;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import modele.ecole.Eleve;
import modele.ecole.Utilisateur;

public class TabChoixUtil extends AbstractTableModel {

	private String[] colNames = { "Photo", "Prenom", "Nom" };
    private Class[] colTypes = { Integer.class, String.class, String.class };
    private Vector vector;
    private Utilisateur user;

    public TabChoixUtil(ChoixEleveM modele) {
    	super();
    	this.vector = modele.getVector();
    }
    
    public int getColumnCount() {
      return colNames.length;
    }
    
    public int getRowCount() {
      return vector.size();
    }
    
    public void setValueAt(Object value, int row, int col) {
    	user = (Utilisateur) (vector.elementAt(row));

      switch (col) {
      case 0:
        user.setIcone((String) value);
        break;
      case 1:
        user.setPrenom((String) value);
        break;
      case 2:
        user.setNom((String) value);
        break;
      }
    }

    public String getColumnName(int col) {
      return colNames[col];
    }

    public Class getColumnClass(int col) {
      return colTypes[col];
    }
    
    public Object getValueAt(int row, int col) {
      user = (Utilisateur) (vector.elementAt(row));

      switch (col) {
      case 0:
    	  return user;
      case 1:
    	  return user;
      case 2:
    	  return user;
      }

      return new String("Choisis quelqu'un");
      
    }
}
