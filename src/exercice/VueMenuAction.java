package exercice;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.Main;
import modele.tortue.CanvasTortue;

public class VueMenuAction extends JPanel {
	
	private JButton avancer, tourner, reset, ecrire;
	private VueExercice vue;
	
	public VueMenuAction(VueExercice vue) {
		
		this.vue = vue;
		
		avancer = new JButton("Avancer");
		tourner = new JButton("Tourner");
		reset = new JButton("Tout effacer");
		ecrire = new JButton("Ecrire");
		
		
		this.add(avancer);
		this.add(tourner);
		this.add(reset);
		this.add(ecrire);
		this.addListener();
		
	}
	
	
	public void avancer() {
		switch (vue.getDirection()) {
		case "nord" : 
			vue.setPosY(vue.getPosY() - 1);
			if (vue.getEcris()) {
				CanvasTortue.ecrisVertical(vue.getPosX(), vue.getPosY(), "black");
			}
			CanvasTortue.tortueNord(vue.getPosX(), vue.getPosY());
			break;
		case "sud" :
			vue.setPosY(vue.getPosY() + 1);
			if (vue.getEcris()) {
				CanvasTortue.ecrisVertical(vue.getPosX(), vue.getPosY() - 1, "black");
			}
			CanvasTortue.tortueSud(vue.getPosX(), vue.getPosY());
			break;
		case "est" :
			vue.setPosX(vue.getPosX() + 1);
			if (vue.getEcris()) {
				CanvasTortue.ecrisHorizontal(vue.getPosX() - 1, vue.getPosY(), "black");
			}
			CanvasTortue.tortueEst(vue.getPosX(), vue.getPosY());
			break;
		case "ouest" :
			vue.setPosX(vue.getPosX() - 1);
			if (vue.getEcris()) {
				CanvasTortue.ecrisHorizontal(vue.getPosX(), vue.getPosY(), "black");
			}
			CanvasTortue.tortueOuest(vue.getPosX(), vue.getPosY());
			break;
			
		}
		
	}
	
	public void tourner() {
		switch (vue.getDirection()) {
		case "nord" : 
			vue.setDirection("est");
			CanvasTortue.tortueEst(vue.getPosX(), vue.getPosY());
			break;
		case "sud" :
			vue.setDirection("ouest");
			CanvasTortue.tortueOuest(vue.getPosX(), vue.getPosY());
			break;
		case "est" :
			vue.setDirection("sud");
			CanvasTortue.tortueSud(vue.getPosX(), vue.getPosY());
			break;
		case "ouest" :
			vue.setDirection("nord");
			CanvasTortue.tortueNord(vue.getPosX(), vue.getPosY());
			break;
			
		}
	}
	
	public void reset() {
		CanvasTortue.reset();
		vue.setPosX(0);
		vue.setPosY(0);
		vue.setDirection("nord");
		CanvasTortue.tortueNord(vue.getPosX(), vue.getPosY());
	}
	
	public void ecrire() {
		if (vue.getEcris()) {
			vue.setEcris(false);
		} else {
			vue.setEcris(true);
		}
		
		
	}
	
	
	private void addListener(){
		this.avancer.addActionListener(new MenuExoListener(this, "avancer"));
		this.tourner.addActionListener(new MenuExoListener(this, "tourner"));
		this.reset.addActionListener(new MenuExoListener(this,"reset"));
		this.ecrire.addActionListener(new MenuExoListener(this, "ecrire"));
	
	}

}
