package CoBdd;
import java.sql.*;

public class CreationInfoBdd
{
//  public static void main( String args[] )
//  {
//    Connection cn = null;
//    Statement stm = null;
//    try {
//      Class.forName("org.sqlite.JDBC");
//      cn = DriverManager.getConnection("jdbc:sqlite:test.db");
//      cn.setAutoCommit(false);
//      System.out.println("Opened database successfully");
//
//      stm = cn.createStatement();
//      String sql = "INSERT INTO PROFESSEUR (ID_PROF,loginProf,passwd,nomProf,prenomProf) " +
//                   "VALUES (1, 'l1', 'm1', 'aze', 'aze' );"; 
//      stm.executeUpdate(sql);
//
//      sql = "INSERT INTO PROFESSEUR (ID_PROF,loginProf,passwd,nomProf,prenomProf) " +
//            "VALUES (2, 'l2', 'm2', 'qsd', 'qsd' );"; 
//      stm.executeUpdate(sql);
//
//      sql = "INSERT INTO PROFESSEUR (ID_PROF,loginProf,passwd,nomProf,prenomProf) " +
//            "VALUES (3, 'l3', 'm3', 'poi', 'poi' );"; 
//      stm.executeUpdate(sql);
//
//      stm.close();
//      cn.commit();
//      cn.close();
//    } catch ( Exception e ) {
//      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
//      System.exit(0);
//    }
//    System.out.println("Records created successfully");
//  }
	
	 private Connection connect() {
	        // SQLite connection string
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
	    }
	 
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	 
	    	CreationInfoBdd app = new CreationInfoBdd();
	        // insert three new rows
	        app.insert(1, "l1", "m1", "aze", "aze");
	        app.insert(2, "l2", "m2", "qsd", "qsd" );
	        app.insert(3, "l3", "m3", "poi", "poi" );
	    }
}