package com.maint.core.beans;

import lombok.Data;

@Data
public class MaintenancesDto {

	private Long id;
	private String name;
	private Long maintenancePlanId;
	private Long maintenancePackageId;
	private double timeConsumption;
}
