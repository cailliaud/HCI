package widget.tableau;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;

import modele.ecole.Eleve;
import modele.ecole.Professeur;

public class ControleurTab {
	private JTable tableau ;
	private Eleve eleve;
	private Professeur prof;
	
	public ControleurTab(TabUtil tab){
		
		this.tableau=tab.getTable();

		ListSelectionModel listSelectionModel = this.tableau.getSelectionModel();        
		listSelectionModel.addListSelectionListener(
				e -> { updateVueInfo(e);

				});
	}
	
	protected void updateVueInfo(ListSelectionEvent  le){

		ListSelectionModel lsm = (ListSelectionModel)le.getSource();
		if (!lsm.isSelectionEmpty()) {
			int selectedRow = lsm.getMinSelectionIndex();
			TabUtilModel modele = (TabUtilModel)this.tableau.getModel();
			Object obj = modele.getValueAt(selectedRow, 10);
			if (obj instanceof Eleve) {
				this.eleve = (Eleve) obj;
				
			}  else if (obj instanceof Professeur){
				this.prof = (Professeur) obj;
			}
			



		}

	}
	
	public Eleve getEleve(){
		return this.eleve;
	}

	public Professeur getProfesseur(){
		return this.prof;
	}

}
