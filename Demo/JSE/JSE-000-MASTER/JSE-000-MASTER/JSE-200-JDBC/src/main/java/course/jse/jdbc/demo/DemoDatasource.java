package course.jse.jdbc.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

public class DemoDatasource {

	public static void main(String[] args) {
		BasicDataSource datasource = getDataSource();
		
		
		Connection conn = null;
		try
        {
           
            conn = datasource.getConnection();
            
            
            System.out.println ("Connected to Database...");
            
            Statement cmd = conn.createStatement ();
		 	
	 		
	        String query = "SELECT * FROM user";
	        
	        ResultSet res = cmd.executeQuery(query);
	 	
	 		
	        while (res.next()) {
	        	
	        	// from position
		        //System.out.print("\t"+res.getString(3));
		        //System.out.print("\t"+res.getString(4));
	        	
	        	//from column name
	        	System.out.print("\t"+res.getString("firstName"));
	        	System.out.print("\t"+res.getString("lastName"));
		        System.out.println();
	      	}
            
            
        }
        catch (Exception e)
        {
           
        	System.err.println ("Impossible to connect to Database");
        	 e.printStackTrace();
            
        }
        finally 
        {
            if (conn != null)
            {
                try
                {
                    conn.close ();
                    System.out.println ("connection closed");
                }
                catch (Exception e) { /* ignore close errors */ }
            }
        }

	}

	
	private static BasicDataSource getDataSource() {
		
		    BasicDataSource ds = new BasicDataSource();
		    ds.setDriverClassName("com.mysql.jdbc.Driver");
            ds.setUrl("jdbc:mysql://localhost:3306/maintenanceplanner");
            ds.setUsername("root");
            ds.setPassword("tere");  
            ds.setMinIdle(5);
            ds.setMaxIdle(10);
            ds.setMaxOpenPreparedStatements(100); 
            return ds;      
    }
	
	
}

