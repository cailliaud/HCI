package main;

import java.util.ArrayList;

import application.Navigation;
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


