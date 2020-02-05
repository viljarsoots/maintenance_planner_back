package com.maint.core.utils;

import com.maint.core.beans.UserDto;
import com.maint.core.beans.UserRoleTableDto;
import com.maint.core.model.User;
import com.maint.core.model.UserRoleTable;

public class BeanUtils {


	public static User dto2Model(UserDto dto){
		User user = new User();
		user.setFirstName(dto.getFirstName());
		user.setLastName(dto.getLastName());
		user.setEmail(dto.getEmail());
		user.setStartDate(dto.getStartDate());
		user.setUserRoleId((long) dto.getUserRoleId());
		return user;
	}

	public static UserDto model2Dto(User model){
		UserDto dto = new UserDto();
		dto.setFirstName(model.getFirstName());
		dto.setLastName(model.getLastName());
		dto.setEmail(model.getEmail());
		dto.setStartDate(model.getStartDate());
		dto.setUserRoleId((long) model.getUserRoleId());
		return dto;
	}
	public static UserRoleTable dto2Model(UserRoleTableDto userRoleTableDto){
		UserRoleTable userRoleTable = new UserRoleTable();
		userRoleTable.setUserId(userRoleTableDto.getUserId());
		userRoleTable.setUserRoleId(userRoleTableDto.getUserRoleId());
		return userRoleTable;
	}

	public static UserRoleTableDto model2Dto(UserRoleTable userRoleTable){
		UserRoleTableDto userRoleTableDto = new UserRoleTableDto();
		userRoleTableDto.setUserId(userRoleTable.getUserId());
		userRoleTableDto.setUserRoleId(userRoleTable.getUserRoleId());
		return userRoleTableDto;
	}

}
