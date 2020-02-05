package com.maint.core.beans;

import lombok.Data;

@Data
public class UserDto {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String startDate;
	private int experienceLevelId;
	
}
