package modele;


import java.net.URL;

import javax.swing.ImageIcon;

public class Eleve {
	private int id;
	private ImageIcon icone;
	private String nom;
	private String prenom;
	private String sexe;
	private int age;
	private int idClasse;
	private Classe maClasse;
	
	public Eleve(int id, String nom, String prenom, String sexe, int age ){
		this.id =id;
		this.nom=nom;
		this.prenom=prenom;
		this.sexe = sexe;
		this.age=age;
		URL urlimage = Eleve.class.getResource(
                "/resources/child_icon.png");
		this.icone = new ImageIcon(urlimage);


	}
	
	public Eleve(int id, String nom, String prenom, String sexe,int age, String icone ){
		this.id =id;
		this.nom=nom;
		this.prenom=prenom;
		this.sexe = sexe;
		this.age=age;
		URL urlimage = Eleve.class.getResource(
                "/resources/"+icone);
		this.icone = new ImageIcon(urlimage);
	

	}
	
	public void setClasse(Classe c){
		this.maClasse=c;
	}
	

	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNom() {
		return this.nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return this.prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String toString(){
		return this.prenom;
	}
	
	public Classe getClasse(){
		return this.maClasse;
	}
	
	public String getSexe() { 
		return this.sexe;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public ImageIcon getIcone(){
		return this.icone;
	}
	
	public void setSexe(String newS) {
		this.sexe=newS;
	}
	
	public void setAge(int newA){
		this.age=newA;
	}

}
