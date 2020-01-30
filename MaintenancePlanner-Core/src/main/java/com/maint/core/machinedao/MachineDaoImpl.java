package com.maint.core.machinedao;

import com.maint.core.machinemodel.Machine;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceContext;


@Repository
//@Transactional(propagation = Propagation.REQUIRED)
public class MachineDaoImpl implements MachineDao {

    @PersistenceContext
    private Session session;


    @Override
    public Machine findById(Long id) {
        return session.get(Machine.class, id);
    }

    @Override
    public Long save(Machine newMachine) {
        return (Long)session.save(newMachine);
    }
}
