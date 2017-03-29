package controleur;

import java.awt.event.ActionEvent;


import vue.*;

public class InfoListener {
	private Menu_Lateral menu_Lat;
	private VueInfo vueInfo;
	private VueClasse vueClasse;
	public InfoListener(Fenetre f){
		this.menu_Lat = f.getMenuLat();
		this.vueClasse = f.getVueClasse();
		this.vueInfo = f.getVueInfo();

		this.vueInfo.getEnvoi().addActionListener(
				ae -> {update(ae);

				});
	}

	private void update (ActionEvent ae){
		this.vueInfo.UpdateEleve();
		this.menu_Lat.repaint();
		this.vueClasse.repaint();
		this.vueInfo.repaint();
	}

}
