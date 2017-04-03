package VueWip;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import modele.ecole.Eleve;
import modele.ecole.Utilisateur;


/**
 * <b> Affichage du panel contenant les eleves pour qu'ils puissent entrer dans leur compte.<b/>
 * <p>
 * Contient un JTable qui utilise le modèle ModelTableauEleve
 * Renvoie vers le panel ChoixExercice une fois le profil selectionné.
 * 
 * </p>
 *
 * @author Groupe 4
 */
public class ChoixEleve extends JPanel {
	
	private JTable table;
	private TabChoixUtil tableModel;
	private Vector vector;
	private ArrayList<Eleve> eleves;

	public ChoixEleve(ArrayList<Eleve> eleves) {
		this.eleves = eleves;
		vector = new Vector(10, 10);
		for (Eleve eleve : eleves) {
			vector.addElement(eleve);
		}
		
    tableModel = new TabChoixUtil(vector);
    table = new JTable(tableModel);
    JScrollPane scrollPane = new JScrollPane(table);
    this.add(scrollPane);
  }
	
}
