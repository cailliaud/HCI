package controleur;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;

import modele.*;
import vue.*;

public class TableListener {

	private Menu_Lateral menu;
	private VueClasse vueClasse;
	private VueInfo vueInfo;

	public TableListener (Fenetre f){
		this.menu=f.getMenuLat();
		this.vueClasse=f.getVueClasse();
		this.vueInfo = f.getVueInfo();


		ListSelectionModel listSelectionModel = this.vueClasse.getTable().getSelectionModel();        
		listSelectionModel.addListSelectionListener(
				e -> {updateVueInfo(e);

				});


	}
	private void updateVueInfo(ListSelectionEvent  le){

		ListSelectionModel lsm = (ListSelectionModel)le.getSource();
		if (!lsm.isSelectionEmpty()) {
			int selectedRow = lsm.getMinSelectionIndex();
			Eleve eleve = (Eleve) this.vueClasse.getTable().getModel().getValueAt(selectedRow, 10);
			ClassTreeRenderer newRender = new ClassTreeRenderer(eleve);
			this.menu.getArbre().setCellRenderer(newRender);


			this.vueInfo.setInfo(eleve);
			this.vueInfo.setInfoG("INFORMATIONS : ELEVE");
			this.vueInfo.setImage(eleve.getIcone());
			this.vueInfo.revalidate();

		}

	}

}
