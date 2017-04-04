package CoBdd;
import java.sql.*;

public class CreationInfoBdd
{
	
	private Connection connect() 
		{
	        String url = "jdbc:sqlite:test.db";
	        Connection conn = null;
	        try {
	            conn = DriverManager.getConnection(url);
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	        return conn;
	    }
	 
	    /**
	     * Insert a new row into the warehouses table
	     *
	     * @param name
	     * @param capacity
	     */
	    public void insert(int id, String login, String mdp, String nom,String prenom) {
	        String sql = "INSERT INTO PROFESSEUR (ID_PROF,loginProf,passwd,nomProf,prenomProf) values (?,?,?,?,?)";
	 
	        try (Connection conn = this.connect();
	                PreparedStatement pstmt = conn.prepareStatement(sql)) {
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
	 
	    	CreationInfoBdd app = new CreationInfoBdd();
	    	CreationTableBdd table = new CreationTableBdd();
	    	
	        // insert three new rows
	        app.insert(1, "l1", "m1", "aze", "aze");
	        app.insert(2, "l2", "m2", "qsd", "qsd" );
	        app.insert(3, "l3", "m3", "poi", "poi" );
	    }
}