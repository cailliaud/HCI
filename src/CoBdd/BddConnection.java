package CoBdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
/**
 *
 * @author
 */
public class BddConnection {
	
	private Connection co = null;
     /**
     *
     */
	public BddConnection(){
        //paramètres bdd
        String url = "jdbc:sqlite:test.db";
        try {
        	this.co = DriverManager.getConnection(url);
	        } catch (SQLException e) {
	          System.out.println(e.getMessage());
	        }  
            System.out.println("Connection to SQLite has been established.");    
    }
}