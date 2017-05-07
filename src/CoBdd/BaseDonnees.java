package CoBdd;
import java.sql.*;

public class BaseDonnees
{
		private Connection connexion = null;
		
		public boolean connexionBDD(){
	        try {
	        	Class.forName("org.sqlite.JDBC");
		        String url = "jdbc:sqlite:test.db";
	        	this.connexion = DriverManager.getConnection(url);
	        	return true;
		        } 
	        catch (SQLException e) {
	        	System.out.println(e.getMessage());
	        	return false;
		        } 
	        catch (ClassNotFoundException e) {
	        	System.out.println(e.getMessage());
	        	return false;
			}   
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
	        System.out.println("Information created successfully");
	    }
	 
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	 
	    	BaseDonnees app = new BaseDonnees();
	        //Si la base existe déjà, on se connecte
	    	if(app.connexionBDD() == true){
	    		System.out.println("Connexion à la BDD réussie");
	        }
	    	//Sinon on crée les tables et on implémente les données
	        else{
	        	new CreationTableBdd();
	        	app.insertProf(1, "abc", "abc", "abc", "abc");
	        	app.insertProf(1, "def", "def", "def", "def");
	        	app.insertProf(1, "ghi", "ghi", "ghi", "ghi");
	        }
	    }
}