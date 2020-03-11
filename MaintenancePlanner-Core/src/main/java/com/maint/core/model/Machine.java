package com.maint.core.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Machine {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String machineName;
	private String startupDate;
	private Long maintenancePlanId;
	private Long machineProducerId;
	
	@ManyToOne
	@JsonIgnore
	@JoinTable(name="machineCustomer",
		joinColumns = @JoinColumn(name= "machineId"),
			inverseJoinColumns = @JoinColumn(name="customerId")
	)
	private Customer customer;

	@ManyToOne
	@JsonIgnore
	@JoinTable(name="machineProducerJoin",
			joinColumns = @JoinColumn(name= "machineId"),
			inverseJoinColumns = @JoinColumn(name="machineProducerId")
	)
	private MachineProducer machineProducer;

}
