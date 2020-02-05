package com.maint.core.service;


import com.maint.core.dao.UserDao;
import com.maint.core.exceptions.UserException;
import com.maint.core.model.MaintenanceHistory;
import com.maint.core.model.User;
import com.maint.core.beans.UserDto;
import com.maint.core.utils.BeanUtils;
import com.maint.core.utils.Mocks;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class UserService {


    @Autowired
    private UserDao userDao;


    public UserDto findById(Long id) {
        if (!(userDao.findById(id).isPresent())){
            throw new UserException("Course was not found!");
        } else {
            User user = userDao.findById(id).get();
            UserDto userDto = BeanUtils.model2Dto(user);
            return userDto;
        }
    }

}
