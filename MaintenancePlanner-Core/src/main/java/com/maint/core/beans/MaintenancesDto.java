package com.maint.core.beans;

import lombok.Data;

@Data
public class MaintenancesDto {

	private int id;
	private String name;
	private int maintenancePlanId;
	private int maintenancePackageId;
	private double timeConsumption;
}
