package com.maint.core.dao;


import com.maint.core.model.MachineProducer;
import com.maint.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MachineProducerDao extends JpaRepository<MachineProducer,Long> {

     User findMachineProducerById(Long id);



}
