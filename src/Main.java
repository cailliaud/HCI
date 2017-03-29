
import java.util.ArrayList;

import controleur.*;
import modele.*;
import vue.*;

/**
 * Project HCI : Understanding of JTree & JTable
 * 
 * Class Main of the Project
 * Instantiation of the model , the view and Controllers
 * @author alexandre cailliaud
 *
 */
public class Main {


	/**
	 * ArrayList of the classes
	 */
	private  ArrayList<Classe> mesClasses;
	
	/**
	 * Classes of the School 
	 */
	private  Classe classe1,classe2,classe3,classe4;
	
	/**
	 * Teachers of the school
	 */
	private  Professeur jacques,jeanne , nicole;
	
	/**
	 * Controller for the JTree
	 */
	private TreeListener treeListener;
	
	/**
	 * Controller for the JTable
	 */
	private TableListener tableListener;
	
	/**
	 * Controller for the form 
	 */
	private InfoListener infoListener;

	
	/**
	 * Main CLass Constructor
	 */
	public Main(){

		// Instantiation of the first class
		jacques = new Professeur(0,"Jacques");
		classe1 = new Classe(0, "CP", jacques);
		classe1.addEleve( new Eleve(0, "Morisset", "Clément","Garçon",6));
		classe1.addEleve( new Eleve(1, "Muller", "Hugo","Garçon",6));
		classe1.addEleve( new Eleve(2,"Agostini","Pierre","Garçon",6));
		classe1.addEleve( new Eleve(3, "Beaurin", "Gael","Garçon",5));
		classe2 = new Classe(1, "CE1", jacques);
		classe2.addEleve(new Eleve(4,"Arruebo","Alexia","Fille",7));
		classe2.addEleve(new Eleve(5,"Zouaoui","Cyprien","Garçon",7));
		classe2.addEleve(new Eleve(6,"Saspaanithy","Babujhi","Garçon",8));
		classe2.addEleve(new Eleve(7,"Gilet","Anatole","Garçon",7));
		
		// Instantiation of the second class
		jeanne = new Professeur(1,"Jeanne");
		classe3 = new Classe(3, "CE2", jeanne);
		classe3.addEleve(new Eleve(8,"Bekanov","Astemir","Garçon",9));
		classe3.addEleve(new Eleve(9,"Dieuaide","Willy","Garçon",10));
		classe3.addEleve(new Eleve(10,"Ambhiel","Augustin","Garçon",9));
		classe3.addEleve(new Eleve(11,"Bonnet","Caroline","Fille",11));
		
		// Instantiation of the third class
		nicole = new Professeur(2, "Nicole");
		classe4 = new Classe(4, "CM1", nicole);
		classe4.addEleve(new Eleve(12,"Noyon","Laurent","Garçon",10));
		classe4.addEleve(new Eleve(13,"Pera","Berengere","Fille",10));
		classe4.addEleve(new Eleve(14,"Sousa Da Silva","Claire","Fille",10));
		classe4.addEleve(new Eleve(15,"Jouannet","Pierre","Garçon",10));
		
		// Instantiation of the ArrayList of the School
		mesClasses= new ArrayList<Classe>();
		mesClasses.add(classe1);
		mesClasses.add(classe2);
		mesClasses.add(classe3);
		mesClasses.add(classe4);
		
		// Instantiation of the Window
		Fenetre fenetre = new Fenetre(mesClasses);
	    fenetre.setVisible(true);
	    
	    // Instantiation of Controllers
	    treeListener = new TreeListener(fenetre);
		tableListener = new TableListener(fenetre);
		infoListener = new InfoListener(fenetre);
	}
	
	/**
	 * Main of the project
	 * @param args arguments for the main (unused here)
	 */
	public static void main(String[] args) {
		Main main = new Main();

	}
	
	
	

}
