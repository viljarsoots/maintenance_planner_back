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
import java.util.Optional;


@Service
@Slf4j
@Transactional

public class UserService {


    @Autowired
    private UserDao userDao;

    @PersistenceContext
    private EntityManager entityManager;


    public Optional<User> findById(Long id) {
        if (!(userDao.findById(id).isPresent())){
            throw new UserException("Course was not found!");
        } else {
            return Optional.of(userDao.findById(id).get());

        }
    }

    public void save(UserDto userDto) throws IOException {
        User user = null;
        if(userDto.getId() != null){
           Optional<User> optionalUser = findById(userDto.getId());
            if(optionalUser.isPresent()){
                user = optionalUser.get();
                updateUser(user, userDto);
            }
        }else {
            user = BeanUtils.dto2Model(userDto);
        }
        userDao.save(user);
    }

    public void updateUser(User user, UserDto userDto){
        user.setId(userDto.getId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setStartDate(userDto.getStartDate());
        user.setUserRoleId(userDto.getUserRoleId());

        userDao.save(user);
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
