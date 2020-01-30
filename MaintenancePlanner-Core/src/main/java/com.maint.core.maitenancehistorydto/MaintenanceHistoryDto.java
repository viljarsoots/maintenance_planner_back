package com.maint.core.maitenancehistorydto;

import com.maint.core.userdto.UserDto;
import lombok.Data;

@Data
public class MaintenanceHistoryDto {

	private Long id;
	private Long machineId;
	private Long technicianId;
	private Long maintenanceId;
	private String lastMaintenanceDate;
	private UserDto userDto;
}
