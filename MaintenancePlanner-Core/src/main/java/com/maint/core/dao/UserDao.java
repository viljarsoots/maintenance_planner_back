package com.maint.core.dao;

import com.maint.core.maitenancehistory.MaintenanceHistory;
import com.maint.core.model.User;
import com.maint.core.userdto.UserDto;

import java.util.List;

public interface UserDao {

    public User searchUserById(Long id);

    public void saveUser(UserDto userDto);

    public void updateUser(UserDto userDto);

    public void deleteUser(Long id);

   public List<MaintenanceHistory> getUserWork(Long technicianId);

   public List<User> getUserMaintenances(Long id);


}
