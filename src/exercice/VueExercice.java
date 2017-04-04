package exercice;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import application.general.VueConnexion;
import modele.tortue.*;

public class VueExercice extends JPanel {
	
	
	private JPanel menu, canvas;
	private int posX, posY;
	private String direction;
	private boolean ecris;
	
	//reste a faire : eviter de sortir du canvas
	//enregistrer la liste d'actions
	//actualiser le bouton ecrire/pas ecrire
	
	public VueExercice() {

		//init panels
		canvas = Canvas.getCanvasPanel();
		menu = new VueMenuAction(this);
		
		this.setLayout(new BorderLayout());
		
		this.add(canvas, BorderLayout.CENTER);
		this.add(menu, BorderLayout.SOUTH);
		
		//dessine la tortue
		ecris = true;
		posX = 0;
		posY = 0;
		direction = "nord";
		CanvasTortue.reset();
		CanvasTortue.tortueNord(posX, posY);
		
	}
	

	
	
	public String getDirection() {
		return direction;
	}
	
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	//indique si on est en train d'ecrire ou pas
	public boolean getEcris() {
		return ecris;
	}
	
	public void setEcris(boolean ecris) {
		this.ecris = ecris;
	}
	
	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}


	public JPanel getExercice() {		
		return this;
	}
	
	
}
