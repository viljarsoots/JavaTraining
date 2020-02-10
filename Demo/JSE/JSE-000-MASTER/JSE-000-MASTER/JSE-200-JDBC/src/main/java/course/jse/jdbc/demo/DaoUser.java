package course.jse.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import course.jse.jdbc.utils.DbUtils;
import maintenance.modal.User;


public class DaoUser {
	
	public void saveUser(User newUser) {
		Connection conn =null;
		
		try{
			conn =DbUtils.createConnection();
            
         
            Statement cmd = conn.createStatement ();
            
            String sql = "INSERT INTO `user`  "
	        		+ "( `firstName`, " 
	        		+ "`lastName`, "
	        		+ "`email`, "
	        		+ "`startDate`, "
	        		+ "`userRoleId`) "
	        		+ "VALUES("
	        		+ "'"+newUser.getFirstName() +"', "
	        		+ "'"+newUser.getLastName() +"', "
	        		+ "'"+newUser.getEmail() +"', "	        		
					+ "'"+newUser.getStartDate() +"', "				
					+ newUser.getUserRoleId()+") "	;	
            
            
            System.out.println(sql);
	        
	        int rowsUpdated =cmd.executeUpdate(sql);
	        
	        System.out.println("Updated "+rowsUpdated+ "rows in User Table");
            
        }
        catch (Exception e){
           
        	System.err.println ("Impossible to connect to Database");
        	 e.printStackTrace();            
        }
        finally {
           DbUtils.closeConnection(conn);         
        }

	}
	public void updateUser(User updUser) {
		Connection conn =null;
		
		try{
			conn =DbUtils.createConnection();
            
         
            Statement cmd = conn.createStatement ();
            
            String sql = "UPDATE `user` SET  "
	        		+ " `firstName` = '"+updUser.getFirstName() +"', " 
	        		+ "`lastName`= '"+updUser.getLastName() +"', "
	        		+ "`email` = '"+updUser.getEmail() +"', "
	        		+ "`startDate` = '"+updUser.getStartDate() +"', "
	        		+ "`userRoleTableId`= "+ updUser.getUserRoleId() +" Where id = " + updUser.getId()
	        		;	
            
            
            System.out.println(sql);
	        
	        int rowsUpdated =cmd.executeUpdate(sql);
	        
	        System.out.println("Updated "+rowsUpdated+ "rows in User Table");
            
        }
        catch (Exception e){
           
        	System.err.println ("Impossible to connect to Database");
        	 e.printStackTrace();            
        }
        finally {
           DbUtils.closeConnection(conn);         
        }

	}
	
	public User findUserById (int id) {
		Connection conn = null;
		User found = null;
		
		try{
				
			conn =DbUtils.createConnection();
			
			Statement cmd = conn.createStatement();
			String sql = "select * from user where id= " + id;

			ResultSet res = cmd.executeQuery(sql);

			if (res.next()) {
				
				found = new User();
				found.setFirstName(res.getString("firstName"));
				found.setLastName(res.getString("lastName"));
				found.setEmail(res.getString("email"));
				found.setStartDate(res.getString("startDate"));
				found.setUserRoleId(res.getInt("userRoleId"));
				found.setId(res.getInt("id"));
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
	
	
	}
	


