package database;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.gjt.mm.mysql.Driver;

/**
 *
 * @author daoquyet
 */
public class Util {
    public static Connection connection;
    public static synchronized Connection getConnection() throws ClassNotFoundException{
        if(connection!=null){
            return connection;
        }else{
          Class.forName("com.mysql.jdbc.Driver");
          String url="jdbc:mysql://localhost:3306/ontaptv";
          String user="root";
          String pass="";
            try {
                connection=DriverManager.getConnection(url,user,pass);
            } catch (SQLException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }
    public static synchronized void closeConnection()  {
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                 connection=null;
            }
        }
        
    }
}
