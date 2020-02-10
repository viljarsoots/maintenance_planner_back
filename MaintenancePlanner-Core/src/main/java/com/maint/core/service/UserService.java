package com.maint.core.service;


import com.maint.core.dao.UserDao;
import com.maint.core.exceptions.UserException;
import com.maint.core.model.User;
import com.maint.core.beans.UserDto;
import com.maint.core.utils.BeanUtils;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.IOException;
import java.util.List;


@Service
@Slf4j
@Transactional

public class UserService {


    @Autowired
    private UserDao userDao;

    @PersistenceContext
    private EntityManager entityManager;


    public UserDto findById(Long id) {
        if (!(userDao.findById(id).isPresent())){
            throw new UserException("Course was not found!");
        } else {
            User user = userDao.findById(id).get();
            UserDto userDto = BeanUtils.model2Dto(user);
            return userDto;
        }
    }

    public void save(UserDto userDto) throws IOException {
        User userAsModel = BeanUtils.dto2Model(userDto);
        userDao.save(userAsModel);
    }
    @Transactional
    public List<User> findAll() {

        return userDao.findAll();
    }
//    public void saveUser(UserDto userDto){
//        User userAsModel = BeanUtils.dto2Model((userDto));
//
//        Set<UserRoleTable> userRoles = userRoleTableDao.saveAll(userDto.getUserRoleId());
//        userRoles.forEach(userAsModel::addUserRoleTable);
//    }


}
