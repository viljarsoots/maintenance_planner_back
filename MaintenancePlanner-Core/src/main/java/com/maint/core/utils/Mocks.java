package com.maint.core.utils;

import com.maint.core.machinemodel.Machine;
import com.maint.core.userdto.UserDto;

public class Mocks {

	public static UserDto mockUser(){
		UserDto mock = new UserDto();
		mock.setFirstName("Stefano");
		mock.setLastName("Fiorenza");
		mock.setEmail("stefanofiorenza@email.com");
		mock.setStartDate("2014-12-11");
		mock.setUserRoleId(4L);
		return mock;
	}

	public static UserDto mockUserUpdate(){
		UserDto mockUpdate = new UserDto();
		mockUpdate.setId(10L);
		mockUpdate.setFirstName("Fjodor");
		mockUpdate.setLastName("Stahhanov");
		mockUpdate.setEmail("stahhanov@email.com");
		mockUpdate.setStartDate("2014-12-11");
		mockUpdate.setUserRoleId(5L);
		return mockUpdate;
	}

	public static Machine mockMachine(){
		Machine newMachine = new Machine();
		newMachine.setMachineName("Juno");
		newMachine.setStartupDate("2019-05-25");
		newMachine.setMachineProducerId(12L);
		newMachine.setLocationId(3L);
		newMachine.setMaintenancePlanId(4L);
		return newMachine;

	}


}
