package modele.ecole;


import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Eleve extends  Utilisateur {
	private Classe maClasse;
	private ArrayList<Tentative> mesTentatives;
	
	public Eleve(String prenom, String nom){
		super(prenom,nom,"child_icon.png");
		this.mesTentatives= new ArrayList<Tentative>();
		


	}
	
	public Eleve(String nom, String prenom, String icone ){
		super(prenom,nom,icone);
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
	 * Methode pour récupérer les tentatives d'un élève selon un exercice
	 * @param exercice Exercice recherché
	 * @return ArrayList<Tentative> Liste des tentatives pour l'exercice demandé
	 */
	public ArrayList<Tentative> getListTentativeSelonExercice (Exercice exercice){
		return null;
	}
	
	



}
