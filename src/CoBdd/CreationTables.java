package CoBdd;

import java.sql.*;


public class CreationTables {
	
	public CreationTables(BaseDonnees bdd){
		try {
			 Statement stm = bdd.getConnexion().createStatement();
			 String sql = "CREATE TABLE IF NOT EXISTS PROFESSEUR " +
		                   "(idProf integer PRIMARY KEY," +
		                   " login TEXT not null, " + 
		                   " password TEXT not null, " + 
		                   " nomProf TEXT not null, " + 
		                   " prenomProf TEXT not null)"; 
		      stm.executeUpdate(sql);
		      stm.close();	 
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	    }
		System.out.println("Création tables");
	  }
}
