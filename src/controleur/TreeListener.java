package controleur;

import vue.*;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

import modele.*;

public class TreeListener {

	private Menu_Lateral menu;
	private VueInfo vue;
	private VueClasse vueClasse;

	public TreeListener (Fenetre f){
		this.menu=f.getMenuLat();
		this.vue=f.getVueInfo();
		this.vueClasse=f.getVueClasse();
		this.menu.getArbre().addTreeSelectionListener(
				e ->{ updateVueInfo(e);
				updateVueClasse(e);		
				});
	}


	private void updateVueClasse (TreeSelectionEvent e ){
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) this.menu.getArbre().getLastSelectedPathComponent();


		if (node.getUserObject() instanceof Classe) {
			Classe c1 = (Classe)node.getUserObject();
			this.vueClasse.setData(c1);

		} else if (node.getUserObject() instanceof Eleve){
			Eleve el = (Eleve)node.getUserObject();
			this.vueClasse.setData(el.getClasse());
			JTable maTable = this.vueClasse.getTable();

			for (int i = 0; i< maTable.getModel().getRowCount() ; i++){
				if (maTable.getModel().getValueAt(i, 10)==el) {
					this.vueClasse.getTable().getSelectionModel().addSelectionInterval(i, i);
				}

			}



		}

	}

	private void updateVueInfo(TreeSelectionEvent e){
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) this.menu.getArbre().getLastSelectedPathComponent();



		if (node.getUserObject() instanceof Eleve){
			Eleve eleve = (Eleve)node.getUserObject();
			this.vue.setInfo(eleve);
			this.vue.setInfoG("INFORMATIONS : ELEVE");
			this.vue.setImage(eleve.getIcone());
			this.vue.revalidate();

		}else if (node.getUserObject() instanceof Classe) {
			Classe classe = (Classe)node.getUserObject();
			this.vue.setInfo(classe);
			this.vue.setInfoG("INFORMATIONS : PROFESSEUR");
			this.vue.setImage();	
			this.vue.revalidate();

		}else {
			this.vue.setInfo(null);
			this.vue.setInfoG("INFORMATIONS : ECOLE");
			this.vue.setImage();
			this.vue.revalidate();

		}
	}


}
