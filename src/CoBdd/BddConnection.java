package CoBdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
/**
 *
 * @author
 */
public class BddConnection {
     /**
     *
     */
	public static void connect(){
        Connection conn = null;
        // db parameters
        String url = "jdbc:sqlite:test.db";
        try {
        	conn = DriverManager.getConnection(url);
	        } catch (SQLException e) {
	          System.out.println(e.getMessage());
	        }  
            System.out.println("Connection to SQLite has been established.");
            
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connect();
    }
}