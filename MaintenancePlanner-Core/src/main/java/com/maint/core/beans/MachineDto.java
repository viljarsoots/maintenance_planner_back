package com.maint.core.beans;

import lombok.Data;

@Data
public class MachineDto {

	private Long id;
	private String machineName;
	private String startupDate;
	private Long locationId;
	private Long maintenancePlanId;
	private Long machineProducerId;
	
	
	
}
