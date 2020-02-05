package com.maint.core.dao;


import com.maint.core.model.UserRoleTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface UserRoleTableDao extends JpaRepository<UserRoleTable, Long> {

     UserRoleTable findUserRoleTableById(Long id);

    @Query("select u.userId from userroletable u where u.userId in: userRoleId")
    Set<Long> findExistingUserRoles(List<Long> userRoleId);

    Set<UserRoleTable> findByUserRoleId(List<Long> userRoleId);

}
