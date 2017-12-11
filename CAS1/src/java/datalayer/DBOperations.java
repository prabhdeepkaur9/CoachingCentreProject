
package datalayer;
import java.sql.*;
public class DBOperations {
    
    private static Connection con;
    
     public static Connection getConnection()
     {
      try
      {
          if(con==null)
          {
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          con=DriverManager.getConnection("jdbc:sqlserver://ARPANHANJRA\\\\ARPANHANJRA:50105;databaseName=SPICData;userName=sa;password=arpan");
          }//if
      }//try
      catch(Exception ex)
      {   
    
        System.out.println(ex);
      }//catch
     return con;
    }//function
    
}//class
