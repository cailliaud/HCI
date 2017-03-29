package modele;

import java.net.URL;

import javax.swing.ImageIcon;

public class Utilisateur {
	protected String prenom,nom;
	protected boolean homme;
	protected ImageIcon icone;
	protected int id;
	
	public Utilisateur (String prenom, String nom, boolean homme){
		this.prenom=prenom;
		this.nom=nom;
		this.homme = homme;
	}
	
	public Utilisateur (String prenom, String nom, boolean homme, String icone ){
		this.prenom=prenom;
		this.nom=nom;
		this.homme = homme;
		URL urlimage = Eleve.class.getResource(
                "/resources/"+icone);
		this.icone = new ImageIcon(urlimage);
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isHomme() {
		return homme;
	}

	public void setSexe(boolean homme) {
		this.homme = homme;
	}

	public ImageIcon getIcone() {
		return icone;
	}

	public void setIcone(String urlImage) {
		URL urlimage = Eleve.class.getResource(
                "/resources/"+icone);
		this.icone = new ImageIcon(urlimage);
		
	}

	

}
