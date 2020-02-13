package com.maint.core.service;


import com.maint.core.beans.MachineDto;
import com.maint.core.dao.MachineDao;
import com.maint.core.exceptions.ServiceException;
import com.maint.core.model.Machine;
import com.maint.core.utils.BeanUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@Transactional
public class MachineService {

    @Autowired
    private MachineDao machineDao;

    @PersistenceContext
    private EntityManager entityManager;

    public Optional<Machine> findById(Long id) {
        if (!(machineDao.findById(id).isPresent())){
            throw new ServiceException("Machine was not found!");
        } else {
            return Optional.of(machineDao.findById(id).get());

        }
    }

    public void save(MachineDto machineDto) throws IOException {
        Machine machine = null;
        if(machineDto.getId() != null){
            Optional<Machine> optionalMachine = findById(machineDto.getId());
            if(optionalMachine.isPresent()){
                machine = optionalMachine.get();
                updateMachine(machine, machineDto);
            }
        }else {
            machine = BeanUtils.dto2Model(machineDto);
        }
        machineDao.save(machine);
    }

    public void updateMachine(Machine machine, MachineDto machineDto){
        machine.setId(machineDto.getId());
        machine.setMachineName(machineDto.getMachineName());
        machine.setStartupDate(machineDto.getStartupDate());
        //machine.setCustomerId(machineDto.getCustomerId());
        machine.setMaintenancePlanId(machineDto.getMaintenancePlanId());
        machine.setMachineProducerId(machineDto.getMachineProducerId());

        machineDao.save(machine);
    }

    @Transactional
    public List<Machine> findAll() {
        return machineDao.findAll();
    }




}
