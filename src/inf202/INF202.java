package inf202;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class INF202 {

    public static void main(String[] args) {
       try {
	
            System.out.println("Connecting database...");
            Class.forName("org.hsqldb.jdbcDriver");
            String url = "jdbc:hsqldb:file:C:\\Users\\ninja\\Desktop\\se_datenbank\\;shutdown=true";
            Connection con = DriverManager.getConnection(url, "admin", "admin");
            
            System.out.println("Database connected!");

        } catch (ClassNotFoundException e) {
            System.out.println("Database connection error. ClassNotFoundException");
        } catch (SQLException ex) {
            Logger.getLogger(INF202.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }
    
}
