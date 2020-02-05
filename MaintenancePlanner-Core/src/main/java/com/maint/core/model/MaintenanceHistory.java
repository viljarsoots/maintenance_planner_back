package com.maint.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class MaintenanceHistory {



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long machineId;
	private Long technicianId;
	private Long maintenaceId;
	private String lastMaintenanceDate;
	
}
