package application.eleve.choixprof;

import javax.swing.ListSelectionModel;

import application.eleve.AppEleve;
import widget.tableau.ControleurTab;
import widget.tableau.TabUtil;

public class ControlerChoixProf extends ControleurTab {
	private AppEleve app ;
	public ControlerChoixProf(TabUtil tab, AppEleve app) {
		super(tab);
		this.app = app;
		ListSelectionModel listSelectionModel = this.tableau.getSelectionModel();        
		listSelectionModel.addListSelectionListener(
				e -> { updateVueInfo(e);
				this.app.setEleve(this.eleve);

				});
	}

}
