package CoBdd;

import java.sql.*;


public class CreationTablesBdd {
	
	public CreationTablesBdd(Connection co){
		System.out.println("Création des tables de la bdd");
		try {
			 Statement stm = co.createStatement();
			 String sql = "CREATE TABLE IF NOT EXISTS PROFESSEUR " +
		                   "(ID_PROF integer PRIMARY KEY," +
		                   " loginProf TEXT not null, " + 
		                   " passwd TEXT not null, " + 
		                   " nomProf TEXT not null, " + 
		                   " prenomProf TEXT not null)"; 
		      stm.executeUpdate(sql);
		      stm.close();	 
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	    }
		System.out.println("Création tables réussie");
	  }
}
