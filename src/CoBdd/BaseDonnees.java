package CoBdd;
import java.sql.*;

public class BaseDonnees
{
		private Connection connexion = null;
		
		public void connexionBDD(){
	        try {
	        	Class.forName("org.sqlite.JDBC");
	        	this.connexion = DriverManager.getConnection("jdbc:sqlite:test.db");
		        } catch (SQLException e) {
		        	System.out.println(e.getMessage());
		        } catch (ClassNotFoundException e) {
		        	System.out.println(e.getMessage());
			}   
		}
		
		public Connection getConnexion(){
			return this.connexion;
		}
	 
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	    	BaseDonnees bdd = new BaseDonnees();
	    	bdd.connexionBDD();
	        new CreationTables(bdd);
	        new Peuplement(bdd);
	        }
	    }
