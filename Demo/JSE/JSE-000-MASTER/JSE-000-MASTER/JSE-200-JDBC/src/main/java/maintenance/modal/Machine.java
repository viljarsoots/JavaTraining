package maintenance.modal;

import lombok.Data;

@Data
public class Machine {

	private int id;
	private String machineName;
	private String startupDate;
	private int locationId;
	private int maintenancePlanId;
	private int machineProducerId;
	
	
	
}
