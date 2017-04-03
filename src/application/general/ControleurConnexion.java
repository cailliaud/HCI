package application.general;

import javax.swing.JFrame;

public class ControleurConnexion {
	private JFrame fen;
	
	public ControleurConnexion(JFrame fenetre){
		this.fen = fenetre;
	}
	
	public void goApplicationEleve(){
		this.fen.removeAll();
	}
	
	public void goApplicationProf(){
		this.fen.removeAll();
		
	}
	

}
