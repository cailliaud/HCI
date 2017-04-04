package application.eleve.choixprof;

import javax.swing.ListSelectionModel;

import application.eleve.AppEleve;
import application.eleve.ControleurAppEleve;
import widget.tableau.ControleurTab;
import widget.tableau.TabUtil;

public class ControlerChoixProf extends ControleurTab {
	
	private ControleurAppEleve controleurApp ;
	
	
	
	public ControlerChoixProf(TabUtil tab, ControleurAppEleve app) {
		super(tab);
		this.controleurApp = app;
		ListSelectionModel listSelectionModel = this.tableau.getSelectionModel();        
		listSelectionModel.addListSelectionListener(
				e -> { updateVueInfo(e);
				this.controleurApp.setProf(this.prof);
				this.controleurApp.goChoixEleve();
				

				});
	}

}
