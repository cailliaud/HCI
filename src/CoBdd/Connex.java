package CoBdd;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
import javax.swing.JOptionPane;
 
public class Connex{
 

  private static String url = "jdbc:sqlite:test.db";
  /**
  * Objet Connection
  */
  private static Connection connect = null;
 
  /**
  * Méthode qui va retourner notre instance
  * et la créer si elle n'existe pas...
  * @return
  */
  public static Connection getInstance(){
    if(connect == null){
      try {
        connect = DriverManager.getConnection(url);
      } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "ERREUR DE CONNEXION ! ", JOptionPane.ERROR_MESSAGE);
      }
      System.out.println("Opened database successfully");
    }      
    return connect;
  }
}