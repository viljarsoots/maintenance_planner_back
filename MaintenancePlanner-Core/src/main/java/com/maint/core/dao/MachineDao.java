package com.maint.core.dao;


import com.maint.core.model.Machine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineDao extends JpaRepository<Machine,Long> {


}
