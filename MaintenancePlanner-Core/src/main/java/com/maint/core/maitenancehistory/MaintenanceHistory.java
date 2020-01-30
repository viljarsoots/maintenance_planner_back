package com.maint.core.maitenancehistory;

import com.maint.core.model.User;
import lombok.Data;

@Data
public class MaintenanceHistory {

	private Long id;
	private Long machineId;
	private Long technicianId;
	private Long maintenanceId;
	private String lastMaintenanceDate;
	private User user;




	
}
