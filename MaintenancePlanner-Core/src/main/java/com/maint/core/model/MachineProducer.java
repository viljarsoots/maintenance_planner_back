package com.maint.core.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class MachineProducer {



	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String producerName;
	private String producerAddress;


	@OneToMany(fetch=FetchType.LAZY,  mappedBy= "machineProducer")
	@Setter(value = AccessLevel.NONE)
	private List<Machine> machines = new ArrayList<>();

}
