package CoBdd;

import java.sql.*;


public class CreationTableBdd {

	public static void main( String args[] )
	  {
		Connection cn = null;
		Statement stm =null;
		try {
			Class.forName("org.sqlite.JDBC");
		
			 cn = DriverManager.getConnection("jdbc:sqlite:test.db");
			 System.out.println("Opened database successfully");
			 
			 stm = cn.createStatement();
			 
		      String sql = "CREATE TABLE PROFESSEUR " +
		                   "(ID_PROF integer PRIMARY KEY," +
		                   " loginProf TEXT not null, " + 
		                   " passwd TEXT not null, " + 
		                   " nomProf TEXT not null, " + 
		                   " prenomProf TEXT not null)"; 
		      stm.executeUpdate(sql);
		      stm.close();
		      cn.close();
			 
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Table created successfully");
	  }
	

	public void chargeeData(){
		
	}
}