package CoBdd;

import java.sql.*;

public class Peuplement {
	
	private BaseDonnees bdd;
	
	public Peuplement(BaseDonnees bdd){
		this.bdd = bdd;
	    insertClasse(1, "CP");
	    insertClasse(2, "CE1");
	    
	    insertEleve(1, 1, "Jean", "Clode","lienIcone");
	    insertEleve(2, 1, "Michel", "Henri","lienIcone");
	    insertEleve(3, 1, "Michel", "Henri","lienIcone");
	    insertEleve(4, 1, "Michel", "Henri","lienIcone");
	    insertEleve(5, 1, "Michel", "Henri","lienIcone");
	    insertEleve(6, 1, "Michel", "Henri","lienIcone");
	    insertEleve(7, 2, "Michel", "Henri","lienIcone");
	    insertEleve(8, 2, "Michel", "Henri","lienIcone");
	    insertEleve(9, 2, "Michel", "Henri","lienIcone");
	    insertEleve(10, 2, "Michel", "Henri","lienIcone");
	    insertEleve(11, 2, "Michel", "Henri","lienIcone");
	    insertEleve(12, 2, "Michel", "Henri","lienIcone");
	    
	    insertProf("michel", "azerty", 1, "Michel", "Henri","lienIcone");
	    insertProf("jean", "azerty", 2, "Jean", "Petit","lienIcone");
	}
	
	/**
     * Insertion d'une classe dans la base de données
     */
    public void insertClasse(int idClasse, String niveau) {
        //Ignore pour ignorer les erreurs de constraintes primary key 
    	String sql = "INSERT OR IGNORE INTO CLASSE (idClasse, niveau) values (?,?)";
        try (
            PreparedStatement pstmt = this.bdd.getConnexion().prepareStatement(sql)) {
            pstmt.setInt(1, idClasse);
            pstmt.setString(2, niveau);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Insertion classe");
    }
    
	/**
     * Insertion d'un professeur dans la base de données
     */
    public void insertProf(String login, String mdp, int idClasse, String nom,String prenom, String url) {
        //Ignore pour ignorer les erreurs de constraintes primary key 
    	String sql = "INSERT OR IGNORE INTO PROFESSEUR (login,password,idClasse, nom,prenom,icone) values (?,?,?,?,?,?)";
        try (
            PreparedStatement pstmt = this.bdd.getConnexion().prepareStatement(sql)) {
            pstmt.setString(1, login);
            pstmt.setString(2, mdp);
            pstmt.setInt(3, idClasse);
            pstmt.setString(4, nom);
            pstmt.setString(5, prenom);
            pstmt.setString(6, url);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Insertion professeur");
    }
    
	/**
     * Insertion d'un élève dans la base de données
     */
    public void insertEleve(int idEleve, int idClasse, String nom,String prenom, String url) {
        //Ignore pour ignorer les erreurs de constraintes primary key 
    	String sql = "INSERT OR IGNORE INTO ELEVE (idEleve,idClasse,nom,prenom,icone) values (?,?,?,?,?)";
        try (
            PreparedStatement pstmt = this.bdd.getConnexion().prepareStatement(sql)) {
        	pstmt.setInt(1, idEleve);
        	pstmt.setInt(2, idClasse);
            pstmt.setString(3, nom);
            pstmt.setString(4, prenom);
            pstmt.setString(5, url);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Insertion élève");
    }

}
