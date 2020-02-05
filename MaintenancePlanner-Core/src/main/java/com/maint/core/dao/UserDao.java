package com.maint.core.dao;


import com.maint.core.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDao extends JpaRepository<User,Long> {

     User findUserById(Long id);






}
