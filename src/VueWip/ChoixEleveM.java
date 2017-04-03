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
public class ChoixEleveM {
	
	private Vector vector;
	private ArrayList<Eleve> eleves;
	private ChoixEleveV choixEleve;
	
	public ChoixEleveM (ArrayList<Eleve> eleves) {
		
		vector = new Vector(10, 10);
		
		this.eleves = eleves;	
		for (Eleve eleve : eleves) {
			vector.addElement(eleve);
		}
		
		
		
	}
	
	public Vector getVector(){
		return this.vector;
	}
	
}
