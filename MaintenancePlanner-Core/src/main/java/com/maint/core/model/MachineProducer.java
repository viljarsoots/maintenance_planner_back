package com.maint.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class MachineProducer {



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String producerName;
	private String producerAddress;
	
}
