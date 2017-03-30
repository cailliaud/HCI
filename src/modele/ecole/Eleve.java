package modele.ecole;


import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Eleve extends  Utilisateur {
	private int age;
	private Classe maClasse;
	private ArrayList<Tentative> mesTentatives;
	
	public Eleve(String prenom, String nom, boolean homme, int age){
		super(prenom,nom,homme,"child_icon.png");
		this.age=age;
		this.mesTentatives= new ArrayList<Tentative>();
		


	}
	
	public Eleve(String nom, String prenom, boolean homme,int age, String icone ){
		super(prenom,nom,homme,icone);
		this.age=age;

	}
	
	public void setClasse(Classe c){
		this.maClasse=c;
	}
	
	public Classe getClasse(){
		return this.maClasse;
	}
	

	public String toString(){
		return this.prenom;
	}
	
	/**
	 * Methode pour ajouter une tentative � l'�l�ve
	 * @param newTentative
	 */
	public void addTentative(Tentative newTentative){
		this.mesTentatives.add(newTentative);
	}
	
	/**
	 * Methode pour obtenir toutes les tentatives d'un eleve quelque soit l'exercice
	 * @return ArrayList<Tentative> Liste des tentatives
	 */
	public ArrayList<Tentative> getTentatives(){
		return this.mesTentatives;
	}
	
	
	/**
	 * Methode pour r�cup�rer les tentatives d'un �l�ve selon un exercice
	 * @param exercice Exercice recherch�
	 * @return ArrayList<Tentative> Liste des tentatives pour l'exercice demand�
	 */
	public ArrayList<Tentative> getListTentativeSelonExercice (Exercice exercice){
		return null;
	}
	
	



}
