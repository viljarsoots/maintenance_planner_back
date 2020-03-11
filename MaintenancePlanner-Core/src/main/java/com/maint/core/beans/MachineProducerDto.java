package com.maint.core.beans;

import com.maint.core.model.Machine;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class MachineProducerDto {

	private Long id;
	private String producerName;
	private String producerAddress;

	@Setter(value= AccessLevel.NONE)
	private List<Machine> machines = new ArrayList<>();
}
