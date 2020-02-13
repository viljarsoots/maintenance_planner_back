package com.maint.core.beans;

import com.maint.core.model.Customer;
import lombok.Data;

@Data
public class MachineDto {

	private Long id;
	private String machineName;
	private String startupDate;
	//private Long customerId;
	private Long maintenancePlanId;
	private Long machineProducerId;
	
	private Customer customer;
	
}
