package maintenance.modal;

import lombok.Data;

@Data
public class User {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String startDate;
	private int userRoleId;
	
}
