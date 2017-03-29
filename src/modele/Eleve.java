package modele;


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
	 * Methode pour ajouter une tentative à l'élève
	 * @param newTentative
	 */
	public addTentative(Tentative newTentative){
		this.mesTentatives.add(newTentative);
	}
	
	



}
