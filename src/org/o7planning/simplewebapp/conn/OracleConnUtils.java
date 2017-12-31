package org.o7planning.simplewebapp.conn;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
  
public class OracleConnUtils {
  
   public static Connection getOracleConnection()
           throws ClassNotFoundException, SQLException {
        
       // Note: Change the connection parameters accordingly.
       String hostName = "db-treina-oracle.cfjmox99qzpa.us-east-1.rds.amazonaws.com";
       String sid = "ORCL";
       String userName = "master";
       String password = "Secret123";
  
       return getOracleConnection(hostName, sid, userName, password);
   }
  
   public static Connection getOracleConnection(String hostName, String sid,
           String userName, String password) throws ClassNotFoundException,
           SQLException {
   
       Class.forName("oracle.jdbc.driver.OracleDriver");
  
       // URL Connection for Oracle
       // Example: 
       // jdbc:oracle:thin:@localhost:1521:db11g
       // jdbc:oracle:thin:@//HOSTNAME:PORT/SERVICENAME
       String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521:" + sid;
  
       Connection conn = DriverManager.getConnection(connectionURL, userName,
               password);
       return conn;
   }
}