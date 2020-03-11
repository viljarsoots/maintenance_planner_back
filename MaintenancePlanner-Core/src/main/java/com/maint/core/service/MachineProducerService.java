package com.maint.core.service;


import com.maint.core.beans.MachineProducerDto;
import com.maint.core.dao.MachineProducerDao;
import com.maint.core.exceptions.MachineProducerException;
import com.maint.core.model.MachineProducer;
import com.maint.core.utils.BeanUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
public class MachineProducerService {


    @Autowired
    private MachineProducerDao machineProducerDao;

    @PersistenceContext
    private EntityManager entityManager;


    public Optional<MachineProducer> findById(Long id) {
        if (!(machineProducerDao.findById(id).isPresent())){
            throw new MachineProducerException("Machine Producer was not found!");
        } else {
            return (Optional<MachineProducer>) Optional.of(machineProducerDao.findById(id).get());

        }
    }

    public void save(MachineProducerDto machineProducerDto) throws IOException {
        MachineProducer mahineProducer = null;
        if(machineProducerDto.getId() != null){
            Optional<MachineProducer> optionalMachineProducer = findById(machineProducerDto.getId());
            if(optionalMachineProducer.isPresent()){
                mahineProducer = optionalMachineProducer.get();
                updateMachineProducer(mahineProducer, machineProducerDto);
            }
        }else {
            mahineProducer = BeanUtils.dto2Model(machineProducerDto);
        }
        machineProducerDao.save(mahineProducer);
    }
    public void updateMachineProducer(MachineProducer mahineProducer, MachineProducerDto machineProducerDto){
        mahineProducer.setId(machineProducerDto.getId());
        mahineProducer.setProducerName(machineProducerDto.getProducerName());
        mahineProducer.setProducerAddress(machineProducerDto.getProducerAddress());


        machineProducerDao.save(mahineProducer);
    }

    @Transactional
    public List<MachineProducer> findAll() {
        return machineProducerDao.findAll();
    }

}
