package main;

import java.util.ArrayList;

import application.Navigation;
import modele.ecole.Classe;
import modele.ecole.Eleve;
import modele.ecole.Professeur;


/**
 * 
 */

/**
 * @author caill
 *
 */
public class Main {

	private static ArrayList<Professeur> listProf= new ArrayList<Professeur>();
	private static Navigation navigation = new Navigation();

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Eleve e1 = new Eleve("Azer", "ty");
		Eleve e2 = new Eleve("Babujhi", "Saspaanithy");
		Eleve e3 = new Eleve("Yoto", "Koitu");
		Eleve e4 = new Eleve("Huijo", "Huetr");
		Eleve e5 = new Eleve("Herman", "Kolu");
		Eleve e6 = new Eleve("Derolo", "Hdfue");
		Eleve e7 = new Eleve("Jueozeo", "Jeflelcy");
		Eleve e8 = new Eleve("Olckece", "Lzcoclz");
		Eleve e9 = new Eleve("Poclz", "Pooecec");
		Eleve e10 = new Eleve("Asadps", "Jeflelcy");
		Eleve e11 = new Eleve("Olckece", "Lzlxol");
		Eleve e12 = new Eleve("Lcoecl", "Dkzlc");
		
		Classe cl = new Classe("CE2");
		cl.addEleve(e1);
		cl.addEleve(e2);
		cl.addEleve(e3);
		Classe c2 = new Classe("CM1");
		c2.addEleve(e4);
		c2.addEleve(e5);
		c2.addEleve(e6);
		Classe c3 = new Classe("CM2");
		c3.addEleve(e7);
		c3.addEleve(e8);
		c3.addEleve(e9);
		Classe c4 = new Classe("CP");
		c4.addEleve(e10);
		c4.addEleve(e11);
		c4.addEleve(e12);

		listProf.add(new Professeur("Alex", "andre", "a", "a", cl));
		listProf.add(new Professeur("Babu", "jhi", "c", "c", c2));
		listProf.add(new Professeur("Alex", "ia", "d", "d", c3));
		listProf.add(new Professeur("Anat", "ole", "e", "e", c4));
	
	}
	
	public static ArrayList<Professeur> getListProf(){
		return listProf;
	}

	public static Navigation getNavigation() {
		return navigation;
	}

	public static void setNavigation(Navigation navigation) {
		Main.navigation = navigation;
	}
	


	
}


