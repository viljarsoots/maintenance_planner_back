package com.maint.core.utils;

import com.maint.core.model.Machine;
import com.maint.core.beans.UserDto;

public class Mocks {

	public static UserDto mockUser(){
		UserDto mock = new UserDto();
		mock.setFirstName("Jüri");
		mock.setLastName("Juurikas");
		mock.setEmail("jyrijuurikas@email.com");
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
		newMachine.setCustomerId(3L);
		newMachine.setMaintenancePlanId(4L);
		newMachine.setMachineProducerId(12L);

		return newMachine;

	}

	public static Machine updateMachine(){
		Machine newMachine = new Machine();
		newMachine.setId(9L);
		newMachine.setMachineName("juku");
		newMachine.setStartupDate("2019-06-25");
		newMachine.setCustomerId(7L);
		newMachine.setMaintenancePlanId(4L);
		newMachine.setMachineProducerId(12L);

		return newMachine;

	}


}
