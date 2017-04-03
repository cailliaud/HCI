package Main;

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
	private  Navigation navigation;

	public Main(){
		navigation = new Navigation();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main main = new Main();
	}
	
	public static ArrayList<Professeur> getListProf(){
		return listProf;
	}
	


	
}


