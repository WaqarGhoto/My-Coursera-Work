
package DBCONNECT;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DatabaseAccess {
    
    public Connection getConnection(){
        try {
            java.sql.Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Coursera","Saud","123456");
            return (Connection) con;
        } catch (SQLException sQLException) {
            return null;

        }
    }

}
