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
		Eleve babu = new Eleve("Babujhi", "Saspaanithy", true, 9);
		Classe cl = new Classe("Encule");
		cl.addEleve(babu);
		listProf.add(new Professeur("Alex", "thomas", true, "acaill", "a", cl));
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


