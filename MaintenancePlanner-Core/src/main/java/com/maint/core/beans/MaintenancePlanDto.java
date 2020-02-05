package com.maint.core.beans;

import lombok.Data;

@Data
public class MaintenancePlanDto {
	
	private Long id;
	private String name;
	private Long machineId;
}
