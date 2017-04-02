

import javax.swing.JFrame;

import modele.ecole.*;
import modele.tortue.Canvas;
import modele.tortue.CanvasTortue;
import modele.tortue.TortueG;


/**
 * 
 */

/**
 * @author caill
 *
 */
public class Main {

	private Exercice test ;
	private Tentative tentative;

	
	public  Main(){
		JFrame fen = new JFrame();
		fen.add(Canvas.getCanvasPanel());
		fen.setVisible(true);
		fen.pack();
		this.test = new Exercice("test","Couleur");
		this.tentative = new Tentative(test);
		for (int i = 0; i < 3; i++) {
			this.tentative.ajoutAction(1,false);
			this.tentative.ajoutAction(6,false);
		}
		this.tentative.rejouerTentative();
		
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main main = new Main();
	}

}
