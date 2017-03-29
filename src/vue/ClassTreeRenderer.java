package vue;

import java.awt.Color;
import java.awt.Component;
import java.util.Enumeration;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;

import modele.Classe;
import modele.Eleve;

public class ClassTreeRenderer implements TreeCellRenderer {

	private Eleve eleve;
	public ClassTreeRenderer(Eleve eleve) {
		super();
		this.eleve=eleve;
	}
	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected ,
			boolean expanded, boolean leaf, int row, boolean hasFocus){

		JLabel mylabel = new JLabel("");
		if (value instanceof DefaultMutableTreeNode){
			DefaultMutableTreeNode myNode = (DefaultMutableTreeNode) value;
			if (myNode.getUserObject() instanceof Eleve){
				Eleve e = (Eleve)myNode.getUserObject();
				if (e==this.eleve){
					mylabel.setForeground(Color.BLUE);
				}
				mylabel.setText(e.getPrenom());
			}else if (myNode.getUserObject() instanceof Classe) {
				Classe c1 = (Classe)myNode.getUserObject();
				mylabel.setText(c1.getNom());
			}else {
				mylabel.setText("Ecole");
				mylabel.setForeground(Color.red);
			}

		}
		JPanel pan = new JPanel();
		pan.add(mylabel);
		pan.setBackground(Color.WHITE);

		return pan;
	}



}
