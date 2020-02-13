package com.maint.core.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Customer {



	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private String address;
	private String location;
	


	@OneToMany(fetch=FetchType.LAZY,  mappedBy= "customer")
	@Setter(value = AccessLevel.NONE)
	private List<Machine> machineSet = new ArrayList<>();
}
