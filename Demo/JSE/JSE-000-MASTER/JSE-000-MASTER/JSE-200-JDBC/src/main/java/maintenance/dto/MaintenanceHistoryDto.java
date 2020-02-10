package maintenance.dto;

import lombok.Data;

@Data
public class MaintenanceHistoryDto {

	private int id;
	private int machineId;
	private int technicianId;
	private int maintenaceId;
	private String lastMaintenanceDate;
	
}
