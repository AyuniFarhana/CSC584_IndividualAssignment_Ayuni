import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
     private static final String DB_URL  = "jdbc:derby://localhost:1527/StudentProfilesDB";
     private static final String DB_USER = "student";
     private static final String DB_PASS = "student123";
 
     public static Connection getConnection() throws SQLException {
         try {
             Class.forName("org.apache.derby.jdbc.ClientDriver");
         } catch (ClassNotFoundException e) {
             throw new SQLException("Derby Driver not found.", e);
         }
         return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
     }
}
