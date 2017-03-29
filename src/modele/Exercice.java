package modele;

import javax.swing.ImageIcon;

/**
 * Classe définissant un exercice caractérisé par :
 * 	- Un numéro unique qui permet de l'identifier
 *  - Un nom 
 *  - Une image
 *  - Une tortue 
 * @author Groupe 4
 * @version 29/03/2017
 */

public class Exercice {

	private int numero;
	private String nom;
	private ImageIcon image; 
	private TortueG tortue;
	
    /**
     * Constructeur, initialisation d'un exercice
     */
	public Exercice(String nom){
		
	}
	
    /**
     * Accésseur du numéro d'exercice
     * @return le numéro d'exercice
     */
	public int getNumero() {
		return numero;
	}

    /**
     * Changement du numéro d'exercice
     * @param  num   nouveau numéro d'exercice
     */
	public void setNumero(int num) {
		this.numero = num;
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
     * Accésseur de la tortue associée à l'exercice
     * @return la tortue associée à l'exercice
     */
	public TortueG getTortue() {
		return tortue;
	}
	
    /**
     * Changement de la tortue associée à l'exercice
     * @param  tortue   nouvelle tortue associée à l'exercice
     */
	public void setTortue(TortueG tortue) {
		this.tortue = tortue;
	}
}
