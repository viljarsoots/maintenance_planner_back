package com.maint.core.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class MaintenanceHistory {



	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private Long machineId;
	private Long technicianId;
	private Long maintenaceId;
	private String lastMaintenanceDate;

//	@ManyToOne
//	private User user;
}
