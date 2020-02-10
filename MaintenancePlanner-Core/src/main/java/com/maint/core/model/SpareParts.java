package com.maint.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class SpareParts {



	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private Long partNumber;
	private String partName;
	private double quantity;
	private double minQuantity;
	private double maxQuantity;
	private Long machineId;
	
}
