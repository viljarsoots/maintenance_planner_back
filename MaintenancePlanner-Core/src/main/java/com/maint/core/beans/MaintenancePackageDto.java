package com.maint.core.beans;

import lombok.Data;

@Data
public class MaintenancePackageDto {

	private Long id;
	private Long maintenanceId;
	private Long sparePartId;
}
