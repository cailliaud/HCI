package application.eleve.choixeleve;

import javax.swing.ListSelectionModel;

import application.eleve.AppEleve;
import application.eleve.ControleurAppEleve;
import widget.tableau.ControleurTab;
import widget.tableau.TabUtil;

public class ControlerChoixEleve extends ControleurTab {
	
	private ControleurAppEleve controleurApp ;
	
	
	
	public ControlerChoixEleve(TabUtil tab, ControleurAppEleve app) {
		super(tab);
		this.controleurApp = app;
		ListSelectionModel listSelectionModel = this.tableau.getSelectionModel();        
		listSelectionModel.addListSelectionListener(
				e -> { updateVueInfo(e);
				this.controleurApp.setEleve(this.eleve);
				this.controleurApp.goMenuEleve();
				

				});
	}

}
