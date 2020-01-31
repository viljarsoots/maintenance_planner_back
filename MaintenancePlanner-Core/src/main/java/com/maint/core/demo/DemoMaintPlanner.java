package com.maint.core.demo;

import com.maint.core.config.AppConfig;
import com.maint.core.machinedao.MachineDao;
import com.maint.core.machinemodel.Machine;
import com.maint.core.utils.Mocks;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


@Slf4j
public class DemoMaintPlanner {

	public static void main(String[] args) {



		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MachineDao machineDao= context.getBean(MachineDao.class);
//		Machine machine= machineDao.findById(1l);
//		System.out.println("Found "+machine.toString());
		Long newId = machineDao.save(Mocks.mockMachine());
		System.out.println("New Id: " + newId );
//		List<Machine> machines = machineDao.findByName("Juno");
//		System.out.println("Junos found " + machines.toString());
		//machineDao.update(Mocks.updateMachine());
		machineDao.delete(Mocks.updateMachine());


//		ApplicationContext context = new AnnotationConfigApplicationContext(MaintAppConfig.class);
//		UserService userService =context.getBean(UserService.class);
//		User user = userService.getUserById(10L);
//		System.out.println("User returned "+ user.toString());
//		List<MaintenanceHistory> history = userService.maintenanceHistoryList(10L);
//		System.out.println("Getting History "+ history.toString());
		//userService.registerUser(Mocks.mockUser());
		//userService.updateUser(Mocks.mockUserUpdate());
		//userService.removeUser(4);
//		List<User> workHistory = userService.userWorkHistory(10L);
//		System.out.println("Getting History "+ workHistory.toString());


	}
	

}
