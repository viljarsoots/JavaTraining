package course.jse.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtilsPro {

	
	public static Connection createConnectionPro() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		 String userName = "root";
         String password = "tere";
         String url = "jdbc:mysql://localhost:3306/maintenanceplanner";
         Class.forName ("com.mysql.jdbc.Driver").newInstance ();
         return  DriverManager.getConnection (url, userName, password);
	}
	
	
	public static void closeConnectionPro(Connection connection){
		
		 if (connection != null){
             try   {
            	 connection.close ();
                 System.out.println ("connection closed");
             }
             catch (Exception e) { 
            	e.printStackTrace();
            }
         }
	}
}
