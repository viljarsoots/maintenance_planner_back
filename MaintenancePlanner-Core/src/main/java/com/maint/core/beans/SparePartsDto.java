package com.maint.core.beans;

import lombok.Data;

@Data
public class SparePartsDto {
	
	private int id;
	private int partNumber;
	private String partName;
	private double quantity;
	private double minQuantity;
	private double maxQuantity;
	private int machineId;
	
}
