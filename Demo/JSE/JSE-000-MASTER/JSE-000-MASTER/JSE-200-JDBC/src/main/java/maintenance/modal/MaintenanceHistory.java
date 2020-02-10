package maintenance.modal;

import lombok.Data;

@Data
public class MaintenanceHistory {

	private int id;
	private int machineId;
	private int technicianId;
	private int maintenaceId;
	private String lastMaintenanceDate;
	
}
