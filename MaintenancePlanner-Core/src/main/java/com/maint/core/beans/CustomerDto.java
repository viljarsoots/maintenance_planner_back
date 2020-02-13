package com.maint.core.beans;

import com.maint.core.model.Machine;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Data
public class CustomerDto {

	private Long id;
	private String name;
	private String address;
	private String location;


	@Setter(value= AccessLevel.NONE)
	private List<Machine> machines = new ArrayList<>();
}
