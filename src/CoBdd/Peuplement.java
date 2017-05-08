package CoBdd;

import java.sql.*;

public class Peuplement {
	
	private BaseDonnees bdd;
	
	public Peuplement(BaseDonnees bdd){
		this.bdd = bdd;
	    insertProf("abc", "abc", "abc", "abc");
	    insertProf("def", "def", "def", "def");
	    insertProf("ghi", "ghi", "ghi", "ghi");
	}
	
	/**
     * Insertion d'un professeur dans la base de données
     */
    public void insertProf(String login, String mdp, String nom,String prenom) {
        //Ignore pour ignorer les erreurs de constraintes primary key 
    	String sql = "INSERT OR IGNORE INTO PROFESSEUR (login,password,nom,prenom) values (?,?,?,?)";
        try (
            PreparedStatement pstmt = this.bdd.getConnexion().prepareStatement(sql)) {
            pstmt.setString(1, login);
            pstmt.setString(2, mdp);
            pstmt.setString(3, nom);
            pstmt.setString(4, prenom);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Insertion professeur");
    }

}
