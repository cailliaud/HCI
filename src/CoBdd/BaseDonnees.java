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
	     * Insertion
	     * @param name
	     * @param capacity
	     */
	    public void insertProf(int id, String login, String mdp, String nom,String prenom) {
	        //Ignore pour ignorer les erreurs de constraintes primary key 
	    	String sql = "INSERT OR IGNORE INTO PROFESSEUR (ID_PROF,loginProf,passwd,nomProf,prenomProf) values (?,?,?,?,?)";
	        try (
	            PreparedStatement pstmt = this.connexion.prepareStatement(sql)) {
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
	 
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	 
	    	BaseDonnees app = new BaseDonnees();
	    	app.connexionBDD();
	        new CreationTablesBdd(app.getConnexion());
	        app.insertProf(1, "abc", "abc", "abc", "abc");
	        app.insertProf(2, "def", "def", "def", "def");
	        app.insertProf(3, "ghi", "ghi", "ghi", "ghi");
	        }
	    }
