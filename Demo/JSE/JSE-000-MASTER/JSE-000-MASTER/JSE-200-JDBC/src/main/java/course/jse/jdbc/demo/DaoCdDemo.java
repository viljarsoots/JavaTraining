package course.jse.jdbc.demo;

import maintenance.modal.User;

public class DaoCdDemo {

	public static void main(String[] args) {
		
				DaoUser userUpdate =new DaoUser();
				DaoUser userAdd = new DaoUser();
				DaoUser user2 = new DaoUser();

				DaoCd cdDao = new DaoCd();
			
			/*
				CD mockCd = new CD();
				mockCd.setArtist("random Artist");
				mockCd.setCompany("random company" );
				mockCd.setCountry("random country");
				mockCd.setPrice(100.0);
				mockCd.setQuantity(2);
				mockCd.setTitle("Some title");
				mockCd.setVersion(1L);
				mockCd.setYear(2000);		
				
				
				cdDao.saveCd(mockCd);
				
				
				
				
				CD foundCd = cdDao.findById(58L);
				System.out.println("Cd values: "+foundCd.toString());
			*/	
				//cdDao.updateCD("'John Lennon'", 10L);
				
				
				User user = new User();
				user.setFirstName("Vello");
				user.setLastName("Toome");
				user.setEmail("vello@toome.ee");
				user.setStartDate("2019-12-06");
				user.setUserRoleId(5);
				
				userAdd.saveUser(user);
				
				
				User userUpd = new User();
				userUpd.setId(3);
				userUpd.setFirstName("Veljo");
				userUpd.setLastName("Toome");
				userUpd.setEmail("vello@toome.ee");
				userUpd.setStartDate("2019-12-06");
				userUpd.setUserRoleId(5);
				
				userUpdate.updateUser(userUpd);
				
				
				User foundUser = user2.findUserById(5);
				System.out.println("User values: "+foundUser.toString());
				
				
			}

		

	}


