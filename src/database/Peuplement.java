package database;

import java.sql.*;

public class Peuplement {
	
	private BaseDonnees bdd;
	
	public Peuplement(BaseDonnees bdd){
		
		this.bdd = bdd;
	    
		insertClasse(1, "CP");
	    insertClasse(2, "CE1");
	    
	    insertEleve(1, 1, "Jean", "Clode","lienIcone");
	    insertEleve(2, 1, "Ryan", "Phelps","lienIcone");
	    insertEleve(3, 1, "Hedley", "Blair","lienIcone");
	    insertEleve(4, 1, "Colorado", "Floyd","lienIcone");
	    insertEleve(5, 1, "Eaton", "Calderon","lienIcone");
	    insertEleve(6, 1, "Caryn", "Hickman","lienIcone");
	    insertEleve(7, 2, "Ralph", "Battle","lienIcone");
	    insertEleve(8, 2, "Hilary", "Mooney","lienIcone");
	    insertEleve(9, 2, "Lars", "Mooney","lienIcone");
	    insertEleve(10, 2, "Carla", "Ford","lienIcone");
	    insertEleve(11, 2, "Porter", "Mcknight","lienIcone");
	    insertEleve(12, 2, "Irma", "Burns","lienIcone");
	    
	    insertProf("michel", "azerty", 1, "Michel", "Henri","lienIcone");
	    insertProf("jean", "azerty", 2, "Jean", "Petit","lienIcone");
	    
	    insertExercice(1, 1, "Exercice 1", "lienImage", "rapide");
	    insertExercice(2, 1, "Exercice 2", "lienImage", "couleur");
	    insertExercice(3, 1, "Exercice 3", "lienImage", "normale");
	    insertExercice(4, 2, "Exercice 1", "lienImage", "rapide");
	    insertExercice(5, 2, "Exercice 2", "lienImage", "couleur");
	    insertExercice(6, 2, "Exercice 3", "lienImage", "normale");
	    
	    insertTentative(1, 1, 1, 0, null, 1);
	    insertTentative(2, 3, 2, 8, "Good work", 4);
	    insertTentative(3, 10, 5, 2, "Bad work", 3);
	    
	    insertAction(1, 1, 3);
	    insertAction(2, 1, 1);
	    insertAction(3, 1, 2);
	    insertAction(4, 1, 1);
	    
	    insertAction(5, 2, 3);
	    insertAction(6, 2, 1);
	    insertAction(7, 2, 5);
	    insertAction(8, 2, 1);
	    
	    insertAction(9, 3, 3);
	    insertAction(10, 3, 1);
	    insertAction(11, 3, 10);
	    insertAction(12, 3, 1);  
	}
	
	/**
     * Insertion d'une classe dans la base de données
     */
    public void insertClasse(int idClasse, String niveau) {
        //Ignore pour ne pas afficher message erreur duplicats primary key
    	String sql = "INSERT OR IGNORE INTO CLASSE (idClasse, niveau) values (?,?)";
        try (
            PreparedStatement pstmt = this.bdd.getConnexion().prepareStatement(sql)) {
            pstmt.setInt(1, idClasse);
            pstmt.setString(2, niveau);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Insertion classe");
    }
    
	/**
     * Insertion d'un professeur dans la base de données
     */
    public void insertProf(String login, String mdp, int idClasse, String nom,String prenom, String url) {
    	String sql = "INSERT OR IGNORE INTO PROFESSEUR (login,password,idClasse, nom,prenom,icone) values (?,?,?,?,?,?)";
        try (
            PreparedStatement pstmt = this.bdd.getConnexion().prepareStatement(sql)) {
            pstmt.setString(1, login);
            pstmt.setString(2, mdp);
            pstmt.setInt(3, idClasse);
            pstmt.setString(4, nom);
            pstmt.setString(5, prenom);
            pstmt.setString(6, url);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Insertion professeur");
    }
    
	/**
     * Insertion d'un élève dans la base de données
     */
    public void insertEleve(int idEleve, int idClasse, String nom,String prenom, String url) { 
    	String sql = "INSERT OR IGNORE INTO ELEVE (idEleve,idClasse,nom,prenom,icone) values (?,?,?,?,?)";
        try (
            PreparedStatement pstmt = this.bdd.getConnexion().prepareStatement(sql)) {
        	pstmt.setInt(1, idEleve);
        	pstmt.setInt(2, idClasse);
            pstmt.setString(3, nom);
            pstmt.setString(4, prenom);
            pstmt.setString(5, url);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Insertion élève");
    }
    
	/**
     * Insertion d'un exercice dans la base de données
     */
    public void insertExercice(int num, int idClasse, String nom, String url, String tortue) {
    	String sql = "INSERT OR IGNORE INTO EXERCICE (numero,idClasse,nom,image,tortue) values (?,?,?,?,?)";
        try (
            PreparedStatement pstmt = this.bdd.getConnexion().prepareStatement(sql)) {
        	pstmt.setInt(1, num);
        	pstmt.setInt(2, idClasse);
            pstmt.setString(3, nom);
            pstmt.setString(4, url);
            pstmt.setString(5, tortue);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Insertion exercice");
    }
    
	/**
     * Insertion d'une tentative dans la base de données
     */
    public void insertTentative(int idTentative, int idEleve, int num, int note, String com, int statut) {
    	String sql = "INSERT OR IGNORE INTO TENTATIVE (idTentative,idEleve,numero,note,commentaire,statut) values (?,?,?,?,?,?)";
        try (
            PreparedStatement pstmt = this.bdd.getConnexion().prepareStatement(sql)) {
        	pstmt.setInt(1, idTentative);
        	pstmt.setInt(2, idEleve);
            pstmt.setInt(3, num);
            pstmt.setInt(4, note);
            pstmt.setString(5, com);
            pstmt.setInt(6, statut);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Insertion tentative");
    }
    
	/**
     * Insertion d'une action dans la base de données
     */
    public void insertAction(int idAction, int idTentative, int code) {
        //Ignore pour ignorer les erreurs de constraintes primary key 
    	String sql = "INSERT OR IGNORE INTO ACTION (idAction,idTentative,codeAction) values (?,?,?)";
        try (
            PreparedStatement pstmt = this.bdd.getConnexion().prepareStatement(sql)) {
        	pstmt.setInt(1, idAction);
        	pstmt.setInt(2, idTentative);
            pstmt.setInt(3, code);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Insertion action");
    }

}
