package vue;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreeSelectionModel;

import modele.Classe;
import modele.Eleve;

public class Menu_Lateral extends JPanel {
	private JTree arbre;
	private ClassTreeRenderer classTreeRenderer;
	private DefaultMutableTreeNode root;
	private JScrollPane jscroll;


	public Menu_Lateral(ArrayList<Classe> mesClasse){
		root = new DefaultMutableTreeNode("Ecole");
		DefaultMutableTreeNode cl ;
		for (Classe classe : mesClasse) {
			cl = new DefaultMutableTreeNode(classe);

			for (Eleve eleve : classe.getListeEleves()) {
				cl.add(new DefaultMutableTreeNode(eleve));
			}
			root.add(cl);

		}




		this.arbre = new JTree(root);
		this.arbre.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		for (int i = 0; i < this.arbre.getRowCount(); i++) {
			arbre.expandRow(i);
		}
		classTreeRenderer= new ClassTreeRenderer(null);

		this.arbre.setCellRenderer(classTreeRenderer);
		jscroll = new JScrollPane(arbre);
		this.setLayout(new BorderLayout());
		this.add(jscroll,BorderLayout.CENTER);
		this.add(jscroll.getVerticalScrollBar(),BorderLayout.WEST);
		this.add(jscroll.getHorizontalScrollBar(),BorderLayout.SOUTH);



	}

	public JTree getArbre(){
		return this.arbre;
	}

	public ClassTreeRenderer getModel(){
		return this.classTreeRenderer;
	}








}
