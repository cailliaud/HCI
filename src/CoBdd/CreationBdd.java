package CoBdd;
import java.sql.*;

public class CreationBdd
{
		private Connection co;
		
	 	public CreationBdd(BddConnexion bddCo){
	 		this.co = bddCo.getConnection();
	 	}
		/**
	     * Insert a new row into the warehouses table
	     *
	     * @param name
	     * @param capacity
	     */
	    public void insertProf(int id, String login, String mdp, String nom,String prenom) {
	        String sql = "INSERT INTO PROFESSEUR (ID_PROF,loginProf,passwd,nomProf,prenomProf) values (?,?,?,?,?)";
	 
	        try (
	            PreparedStatement pstmt = this.co.prepareStatement(sql)) {
	            pstmt.setInt(1, id);
	            pstmt.setString(2, login);
	            pstmt.setString(3, mdp);
	            pstmt.setString(4, nom);
	            pstmt.setString(5, prenom);
	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	        System.out.println("Information created successfully");
	    }
	 
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	 
	    	CreationBdd app = new CreationBdd(new BddConnexion());
	    	CreationTableBdd table = new CreationTableBdd();
	        // insert three new rows
	        app.insertProf(1, "l1", "m1", "aze", "aze");
	        app.insertProf(2, "l2", "m2", "qsd", "qsd" );
	        app.insertProf(3, "l3", "m3", "poi", "poi" );
	    }
}