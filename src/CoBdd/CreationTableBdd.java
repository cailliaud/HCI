package CoBdd;

import java.sql.*;


public class CreationTableBdd {

	Connection co = null;
	Statement stm =null;
	
	public CreationTableBdd(){
		try {
			Class.forName("org.sqlite.JDBC");
		
			 this.co = DriverManager.getConnection("jdbc:sqlite:test.db");
			 System.out.println("Opened database successfully");
			 this.stm = co.createStatement();
			 
		      String sql = "CREATE TABLE PROFESSEUR " +
		                   "(ID_PROF integer PRIMARY KEY," +
		                   " loginProf TEXT not null, " + 
		                   " passwd TEXT not null, " + 
		                   " nomProf TEXT not null, " + 
		                   " prenomProf TEXT not null)"; 
		      stm.executeUpdate(sql);
		      stm.close();
		      co.close();
			 
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Table created successfully");
	  }
}