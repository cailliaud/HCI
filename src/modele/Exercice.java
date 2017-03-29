package modele;

import java.util.List;

import javax.swing.ImageIcon;

public class Exercice {

	private int nombre;
	private String nom;
	private ImageIcon image; 
	private List<Integer> actions;
	private TortueG tortue;
	
	public Exercice(){
		
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ImageIcon getImage() {
		return image;
	}

	public void setImage(ImageIcon image) {
		this.image = image;
	}

	public List<Integer> getActions() {
		return actions;
	}

	public void setActions(List<Integer> actions) {
		this.actions = actions;
	}
	
	
	
}
