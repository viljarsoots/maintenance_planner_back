package com.maint.core.service;


import com.maint.core.dao.UserDao;
import com.maint.core.maitenancehistory.MaintenanceHistory;
import com.maint.core.model.User;
import com.maint.core.userdto.UserDto;
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


    public User getUserById(Long id){
        User user = userDao.searchUserById(id);
        log.info("User returned ", user.toString());
        return user;
    }

    public void registerUser(UserDto userDto){
        log.info("Starting Saving ", userDto.toString());
        userDao.saveUser(Mocks.mockUser());
    }
    public void updateUser(UserDto userDto){
        log.info("Starting Update ", userDto.toString());
        userDao.updateUser(Mocks.mockUserUpdate());
    }
    public void removeUser(int id){
        log.info("Starting Deleting User", id);
        userDao.deleteUser(4L);
        log.info("User deleted ", id);
    }
    public List <MaintenanceHistory> maintenanceHistoryList(Long id){
        List<MaintenanceHistory> history = userDao.getUserWork(id);
        return history;
    }
    public List<User> userWorkHistory(Long id){
        List<User> workHistory = userDao.getUserMaintenances(id);
        return workHistory;
    }

}
