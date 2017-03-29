package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import modele.Classe;
import modele.Eleve;

public class VueInfo extends JPanel {


	private JLabel info;
	private JLabel icon;
	private JLabel infoG;
	private ImageIcon defaultImage;
	private JTextField prenomF, nomF, ageF, sexeF;
	private JButton envoi;
	private Eleve eleve;
	private Classe classe;
	public VueInfo(){
		this.setLayout(new BorderLayout());

		// INITIALISATION des informations générales
		infoG = new JLabel("INFORMATIONS");
		infoG.setForeground(Color.RED);
		infoG.setBackground(Color.WHITE);
		this.add(infoG,BorderLayout.NORTH);


		// INITIALISATION de l'icone
		URL urlimage = VueInfo.class.getResource(
				"/resources/default.png");
		defaultImage= new ImageIcon(urlimage);
		icon = new JLabel(defaultImage);
		this.add(icon,  BorderLayout.WEST);

		// INITIRALISATION du prof

		envoi = new JButton("Aucunes Modifications  possibles de l'école!");
		envoi.setEnabled(false);
		this.add(envoi, BorderLayout.SOUTH);

		// INITIALISATION des info de l'eleve
		info = new JLabel();
		info.setBackground(Color.WHITE);
		this.add(info, BorderLayout.CENTER);


	}

	public void setInfo(Object o){

		if (o instanceof Eleve) {
			Eleve e = (Eleve) o;
			this.classe = null;
			info.removeAll();
			info.setLayout(new GridLayout(6, 2));

			info.add(new JLabel("ID : "+e.getId()));
			info.add(new JLabel());

			prenomF = new JTextField((e.getPrenom()));
			info.add(new JLabel("Prenom : "));
			info.add(prenomF);

			nomF = new JTextField(e.getNom());
			info.add(new JLabel("Nom : "));
			info.add(nomF);

			sexeF = new JTextField(e.getSexe());
			info.add(new JLabel("Sexe : "));
			info.add(sexeF);

			ageF = new JTextField(String.valueOf(e.getAge()));
			info.add(new JLabel("Age : "));
			info.add(ageF);



			this.eleve =e;
			envoi.setText("Appliquer Changement !");
			envoi.setEnabled(true);
			info.repaint();

		}else if (o instanceof Classe){

			info.setLayout(new GridLayout(3, 1));
			Classe c = (Classe) o;
			this.classe = c;
			this.eleve = null;
			info.removeAll();
			info.add(new JLabel("ID : "+c.getId(), SwingConstants.CENTER));
			info.add(new JLabel("Nom : "+c.getNom(), SwingConstants.CENTER));
			info.add(new JLabel("Nombre d'eleves : "+c.getListeEleves().size(), SwingConstants.CENTER));
			envoi.setText("Aucune Modifications possibles de la Classe");
			envoi.setEnabled(false);
			info.repaint();


		}else {
			this.classe =null;
			this.eleve = null;
			info.removeAll();
			envoi.setEnabled(false);
			envoi.setText("Aucune Modifications possibles de l'école");
			info.repaint();

		}




	}

	public void setInfoG(String info){
		this.infoG.setText(info);
	}

	public void setImage(){
		this.icon.setIcon(this.defaultImage);

	}

	public void setImage(ImageIcon img){
		this.icon.setIcon(img);

	}

	public JButton getEnvoi(){
		return this.envoi;
	}

	public void UpdateEleve(){
		this.eleve.setNom(nomF.getText());
		this.eleve.setPrenom(prenomF.getText());
		this.eleve.setSexe(sexeF.getText());
		this.eleve.setAge(Integer.valueOf(ageF.getText()));

	}
}
