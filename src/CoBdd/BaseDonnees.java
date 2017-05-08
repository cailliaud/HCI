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
		
		public void creationTables(){
			try {
				 Statement stm = this.connexion.createStatement();
				 String sql = "CREATE TABLE IF NOT EXISTS CLASSE " +
			                   "(idClasse integer PRIMARY KEY," +
			                   " niveau TEXT not null)"; 
			      stm.executeUpdate(sql);
			      stm.close();	 
		    } catch (Exception e) {
		      System.err.println(e.getMessage());
		    }
			try {
				 Statement stm = this.connexion.createStatement();
				 String sql = "CREATE TABLE IF NOT EXISTS PROFESSEUR " +
			                   "(login TEXT PRIMARY KEY not null, " + 
			                   " password TEXT not null, " + 
			                   " nom TEXT not null, " + 
			                   " prenom TEXT not null)"; 
			      stm.executeUpdate(sql);
			      stm.close();	 
		    } catch (Exception e) {
		      System.err.println(e.getMessage());
		    }
			System.out.println("Création tables");
		}
	 
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	    	BaseDonnees bdd = new BaseDonnees();
	    	bdd.connexionBDD();
	        bdd.creationTables();
	        new Peuplement(bdd);
	        }
	    }
