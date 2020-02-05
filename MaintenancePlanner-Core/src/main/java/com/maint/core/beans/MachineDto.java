package com.maint.core.beans;

import lombok.Data;

@Data
public class MachineDto {

	private int id;
	private String machineName;
	private String startupDate;
	private int locationId;
	private int maintenancePlanId;
	private int machineProducerId;
	
	
	
}
