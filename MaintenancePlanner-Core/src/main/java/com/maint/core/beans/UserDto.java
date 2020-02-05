package com.maint.core.beans;

import lombok.Data;

@Data
public class UserDto {

	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String startDate;
	private Long UserRoleId;
	
}
