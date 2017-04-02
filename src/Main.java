

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
		this.tentative.initTortue();
		for (int i = 0; i < 3; i++) {
			this.tentative.ajoutAction(1);
			this.tentative.ajoutAction(6);
		}
		
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main main = new Main();
	}

}
