package CoBdd;

import java.sql.*;

public class Peuplement {
	
	private BaseDonnees bdd;
	
	public Peuplement(BaseDonnees bdd){
		this.bdd = bdd;
	    insertProf(9, "abc", "abc", "abc", "abc");
	    insertProf(10, "def", "def", "def", "def");
	    insertProf(11, "ghi", "ghi", "ghi", "ghi");
	}
	
	/**
     * Insertion d'un professeur dans la base de données
     */
    public void insertProf(int id, String login, String mdp, String nom,String prenom) {
        //Ignore pour ignorer les erreurs de constraintes primary key 
    	String sql = "INSERT OR IGNORE INTO PROFESSEUR (ID_PROF,loginProf,passwd,nomProf,prenomProf) values (?,?,?,?,?)";
        try (
            PreparedStatement pstmt = this.bdd.getConnexion().prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, login);
            pstmt.setString(3, mdp);
            pstmt.setString(4, nom);
            pstmt.setString(5, prenom);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Insertions réussies");
    }

}
