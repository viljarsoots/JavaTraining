package maintenance.modal;

import lombok.Data;

@Data
public class Maintenances {

	private int id;
	private String name;
	private int maintenancePlanId;
	private int maintenancePackageId;
	private double timeConsumption;
}
