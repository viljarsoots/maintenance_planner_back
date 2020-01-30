package com.maint.core.model;

import com.maint.core.maitenancehistory.MaintenanceHistory;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Data

public class User {


	private Long id;

	private String firstName;
	private String lastName;
	private String email;
	private String startDate;
	private Long userRoleId;
	private List<MaintenanceHistory> maintenanceHistoryList =new ArrayList<>();
	
}
