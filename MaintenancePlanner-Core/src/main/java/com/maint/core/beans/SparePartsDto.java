package com.maint.core.beans;

import lombok.Data;

@Data
public class SparePartsDto {
	
	private Long id;
	private Long partNumber;
	private String partName;
	private double quantity;
	private double minQuantity;
	private double maxQuantity;
	private Long machineId;
	
}
