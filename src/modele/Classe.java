package modele;

import java.util.ArrayList;

public class Classe {
	private int id;
	private String nom;
	private ArrayList<Eleve> listeEleves;
	private Professeur prof;

	public Classe (int id, String nom, Professeur prof ){
		listeEleves = new ArrayList<Eleve>();
		this.id=id;
		this.nom=nom;
		this.prof = prof;
		
		
	}
	
	public void addEleve (Eleve eleve){
		this.listeEleves.add(eleve);
		eleve.setClasse(this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Eleve> getListeEleves() {
		return listeEleves;
	}

	public void setListeEleves(ArrayList<Eleve> listeEleves) {
		this.listeEleves = listeEleves;
	}
	
	public Professeur getProf(){
		return this.prof;
	}
	

}
