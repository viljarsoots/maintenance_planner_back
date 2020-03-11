package com.maint.core.model;

import lombok.Data;
import org.springframework.http.converter.json.GsonBuilderUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class MaintenancePlan {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private Long machineId;



}
