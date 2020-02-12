package com.maint.core.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Machine {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String machineName;
	private String startupDate;
	private Long customerId;
	private Long maintenancePlanId;
	private Long machineProducerId;
	
	@ManyToOne()
	@JoinTable(name = "customerMachines",
			joinColumns = @JoinColumn(name = "customerId"), inverseJoinColumns = @JoinColumn(name = "machineId")
	)
	@Getter
	private Customer customer;
}
