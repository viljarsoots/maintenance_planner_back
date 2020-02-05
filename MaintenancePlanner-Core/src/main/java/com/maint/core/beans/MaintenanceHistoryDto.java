package com.maint.core.beans;

import lombok.Data;

@Data
public class MaintenanceHistoryDto {

	private Long id;
	private Long machineId;
	private Long technicianId;
	private Long maintenaceId;
	private String lastMaintenanceDate;
	
}
