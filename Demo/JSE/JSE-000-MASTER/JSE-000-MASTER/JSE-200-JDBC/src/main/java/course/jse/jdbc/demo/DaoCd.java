package course.jse.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import course.jse.jdbc.utils.DbUtils;

public class DaoCd {

	
	public void saveCd (CD newCd) {
	
        Connection conn =null;
        			
		try{
			conn =DbUtils.createConnection();
            
         
            Statement cmd = conn.createStatement ();	 		
	        String sql = "INSERT INTO `cd`  "
	        		+ "( `Artist`, " 
	        		+ "`Company`, "
	        		+ "`Price`, "
	        		+ "`Title`, "
	        		+ "`Country`, "
	        		+ "`Year`, "
	        		+ "`Quantity`, "
	        		+ "`Version`) "
	        		+ "VALUES("
	        		+ "'"+newCd.getArtist()+"', "
	        		+ "'"+newCd.getCompany()+"', "
	        		+ newCd.getPrice()+", "	        		
					+ "'"+newCd.getTitle()+"', "				
					+ "'"+newCd.getCountry()+"', "
					+ newCd.getYear()+", "
					+ newCd.getQuantity()+", "		
					+ newCd.getVersion()+") "	;	
	        
	        System.out.println(sql);
	        	        
	        int rowsUpdated =cmd.executeUpdate(sql);
	        
	        System.out.println("Updated "+rowsUpdated+ "rows in Cd Table");
            
        }
        catch (Exception e){
           
        	System.err.println ("Impossible to connect to Database");
        	 e.printStackTrace();            
        }
        finally {
           DbUtils.closeConnection(conn);         
        }

	}
	
	
	
	public CD findById (Long id) {
		Connection conn = null;
		CD found = null;
		
		try{
				
			conn =DbUtils.createConnection();
			
			Statement cmd = conn.createStatement();
			String sql = "select * from cd where id= " + id;

			ResultSet res = cmd.executeQuery(sql);

			if (res.next()) {
				
				found = new CD();
				found.setArtist(res.getString("Artist"));
				found.setCompany(res.getString("company"));
				found.setCountry(res.getString("country"));
				found.setId(res.getLong("id"));
				found.setPrice(res.getDouble("price"));
				found.setQuantity(res.getInt("quantity"));
				found.setTitle(res.getString("title"));
				found.setVersion(res.getLong("version"));
				found.setYear(res.getInt("year"));
			}
			
		}

		catch (Exception e) {

			System.err.println("Impossible to connect to Database");
			e.printStackTrace();

		} finally {
			 DbUtils.closeConnection(conn);    
		}
		return found;
	}
	
	
	public void updateCD (String artist, Long id) {
		
		Connection conn =null;
		
		try{
			
			conn =DbUtils.createConnection();
            Statement cmd = conn.createStatement ();	
            
	        String sql ="UPDATE cd SET artist =" + artist + " WHERE id =" +id;     
	        	        
	        cmd.executeUpdate(sql);
	           
        }
        catch (Exception e){
           
        	System.err.println ("Impossible to connect to Database");
        	 e.printStackTrace();            
        }
        finally {
           DbUtils.closeConnection(conn);         
        }
	}
	
	
	
	public List<CD> findByPrice (double price) {
		return null;
	}
	public void findById2 () {
		 System.out.println("landed");
	}
	public void delete (CD todelete) {
	}
	
	
	
	
	
	
	
	
}
