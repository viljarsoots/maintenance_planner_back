package com.maint.core.service;


import com.maint.core.beans.UserRoleTableDto;
import com.maint.core.dao.UserRoleTableDao;
import com.maint.core.model.UserRoleTable;
import com.maint.core.utils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Transactional(propagation = Propagation.REQUIRED)
@Service
public class UserRoleTableService {
	
	@Autowired
	private UserRoleTableDao userRoleTableDao;
		
	public void save(UserRoleTableDto userRoleTableDto) {
		UserRoleTable userRoleTable = BeanUtils.dto2Model(userRoleTableDto);
		userRoleTableDao.save(userRoleTable);
	}


//	public UserRoleTable findById(Long id) {
//		return userRoleTableDao.findById(id);
//	}

	public Set<UserRoleTable> saveAll(List<UserRoleTableDto> userRoleTableDtos) {

		if(userRoleTableDtos == null || CollectionUtils.isEmpty(userRoleTableDtos)){
			return new HashSet<>();
		}

		List<Long> userRolesFromInput = new ArrayList<>();
		userRoleTableDtos.forEach(userRole -> userRolesFromInput.add(userRole.getUserRoleId()));

		Set<Long> existingUserRoles = userRoleTableDao.findExistingUserRoles(userRolesFromInput);
		for (Long userRole : userRolesFromInput) {
			if (!existingUserRoles.contains(userRole)) {
				UserRoleTable newUserRole = new UserRoleTable();
				newUserRole.setUserId(userRole);
				userRoleTableDao.save(newUserRole);
			}
		}

		return  userRoleTableDao.findByUserRoleId(userRolesFromInput);
	}
}
