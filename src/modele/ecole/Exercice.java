package modele.ecole;

import java.util.ArrayList;

import javax.swing.ImageIcon;

/**
 * Classe définissant un exercice caractérisé par :
 * 	- Un numéro unique qui permet de l'identifier
 *  - Un nom 
 *  - Une image
 *  - Une tortue ("normale","rapide", "couleur")
 * @author Groupe 4
 * @version 29/03/2017
 */

public class Exercice {


	private String nom;
	private ImageIcon image; 
	private String tortue;
	
	
    /**
     * Constructeur, initialisation d'un exercice
     * @param nom : Le nom de l'exercice
     */
	public Exercice(String nom, String typeTortue){
		this.nom=nom;
		this.tortue=controlTypeTortue(typeTortue);
		
		
		
	}
	
	private String controlTypeTortue(String tortue){
		tortue = tortue.toLowerCase();
		if (tortue.equals("normale") || tortue.equals("rapide") || tortue.equals("couleur")){
			return  tortue;
		}
		else {
			return "normale";
		}

	}

    /**
     * Accésseur du nom de l'exercice
     * @return le nom d'exercice
     */
	public String getNom() {
		return nom;
	}

    /**
     * Changement du nom de l'exercice
     * @param  nom   nouveau nom d'exercice
     */
	public void setNom(String nom) {
		this.nom = nom;
	}

    /**
     * Accésseur de l'image de l'exercice
     * @return l'image associée à l'exercice
     */
	public ImageIcon getImage() {
		return image;
	}

    /**
     * Changement de l'image associée à l'exercice
     * @param  image   nouvelle image d'exercice
     */
	public void setImage(ImageIcon image) {
		this.image = image;
	}

    /**
     * Accessor de la tortue associée à l'exercice
     * @return la tortue associée à l'exercice
     */
	public String getTortue() {
		return tortue;
	}
	
   
}
