package database;
import java.sql.*;

public class BaseDonnees {
	
	private Connection connexion = null;
	
	public BaseDonnees(){
		this.connexionBDD();
	    this.creationTables();
	    new Peuplement(this);
	}
		
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
		// Table CLASSE
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
			// Table PROFESSEUR
		try {
			Statement stm = this.connexion.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS PROFESSEUR " +
			             "(login TEXT PRIMARY KEY, " +
			             " password TEXT not null, " + 
			             " idClasse integer not null, " + 
			             " nom TEXT not null, " + 
			             " prenom TEXT not null, " +
			             " icone TEXT not null, " +
			             " FOREIGN KEY (idClasse) REFERENCES CLASSE(idClasse))"; 
			stm.executeUpdate(sql);
			stm.close();	 
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		// Table ELEVE
		try {
			Statement stm = this.connexion.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS ELEVE " +
			             "(idEleve integer PRIMARY KEY, " +
			             " idClasse integer not null, " + 
			             " nom TEXT not null, " + 
			             " prenom TEXT not null, " +
			             " icone TEXT not null, " +
			             " FOREIGN KEY (idClasse) REFERENCES CLASSE(idClasse))"; 
			stm.executeUpdate(sql);
			stm.close();	 
			} catch (Exception e) {
				System.err.println(e.getMessage());
		    }
		// Table EXERCICE
		try {
			Statement stm = this.connexion.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS EXERCICE " +
			             "(numero integer PRIMARY KEY, " +
			             " idClasse integer not null, " + 
			             " nom TEXT not null, " + 
			             " image TEXT not null, " +
			             " tortue TEXT not null, " +
			             " FOREIGN KEY (idClasse) REFERENCES CLASSE(idClasse))"; 
			stm.executeUpdate(sql);
			stm.close();	 
			} catch (Exception e) {
				System.err.println(e.getMessage());
		    }
		// Table TENTATIVE
		try {
			Statement stm = this.connexion.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS TENTATIVE " +
			             "(idTentative integer PRIMARY KEY, " +
			             " idEleve integer not null, " + 
			             " numero integer not null, " +
			             " note integer null, " + 
			             " commentaire TEXT null, " + 
			             " statut integer null, " +
			             " FOREIGN KEY (idEleve) REFERENCES ELEVE(idEleve), " +
			             " FOREIGN KEY (numero) REFERENCES EXERCICE(numero))"; 
			stm.executeUpdate(sql);
			stm.close();	 
		    } catch (Exception e) {
		    	System.err.println(e.getMessage());
		    }
		// Table ACTION
		try {
			Statement stm = this.connexion.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS ACTION " +
			             "(idAction integer PRIMARY KEY, " +
			             " idTentative integer not null, " + 
			             " codeAction integer not null, " +
			             " FOREIGN KEY (idTentative) REFERENCES TENTATIVE(idTentative))"; 
			stm.executeUpdate(sql);
			stm.close();	 
		    } catch (Exception e) {
		    	System.err.println(e.getMessage());
		    }
		System.out.println("Création tables");
	}
}
