package com.maint.core.utils;

import com.maint.core.beans.CustomerDto;
import com.maint.core.beans.MachineDto;
import com.maint.core.beans.UserDto;
import com.maint.core.model.Customer;
import com.maint.core.model.Machine;
import com.maint.core.model.User;

public class BeanUtils {


	public static User dto2Model(UserDto dto){
		User user = new User();
		user.setId(dto.getId());
		user.setFirstName(dto.getFirstName());
		user.setLastName(dto.getLastName());
		user.setEmail(dto.getEmail());
		user.setStartDate(dto.getStartDate());
		user.setUserRoleId((long) dto.getUserRoleId());
		return user;
	}

	public static UserDto model2Dto(User model){
		UserDto dto = new UserDto();
		dto.setId(model.getId());
		dto.setFirstName(model.getFirstName());
		dto.setLastName(model.getLastName());
		dto.setEmail(model.getEmail());
		dto.setStartDate(model.getStartDate());
		dto.setUserRoleId((long) model.getUserRoleId());
		return dto;
	}

	public static Customer dto2Model(CustomerDto customerDto){
		Customer customer = new Customer();
		customer.setId(customerDto.getId());
		customer.setName(customerDto.getName());
		customer.setAddress(customerDto.getAddress());
		customer.setLocation(customerDto.getLocation());

		return customer;
	}

	public static CustomerDto model2Dto(Customer model){
		CustomerDto dto = new CustomerDto();
		dto.setId(model.getId());
		dto.setName(model.getName());
		dto.setAddress(model.getAddress());
		dto.setLocation(model.getLocation());

		return dto;
	}

	public static Machine dto2Model(MachineDto dto){
		Machine machine = new Machine();
		machine.setId(dto.getId());
		machine.setMachineName(dto.getMachineName());
		machine.setStartupDate(dto.getStartupDate());
		machine.setCustomerId(dto.getCustomerId());
		machine.setMaintenancePlanId(dto.getMaintenancePlanId());
		machine.setMachineProducerId(dto.getMachineProducerId());
		machine.setCustomer(dto.getCustomer());
		return machine;
	}

	public static MachineDto model2Dto(Machine model){
		MachineDto dto = new MachineDto();
		dto.setId(model.getId());
		dto.setMachineName(model.getMachineName());
		dto.setStartupDate(model.getStartupDate());
		dto.setCustomerId(model.getCustomerId());
		dto.setMaintenancePlanId(model.getMaintenancePlanId());
		dto.setMachineProducerId(model.getMachineProducerId());

		return dto;
	}

}
