package com.maint.core.machinedao;

import com.maint.core.machinemodel.Machine;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
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

    @Override
    public List<Machine> findByName(String machineName) {
        Query<Machine> query =session.createNamedQuery("Machine_ByName", Machine.class);
        query.setParameter("machineName", machineName);
        return query.getResultList();
    }

    @Override
    public void update(Machine updatedMachine) {
        session.update(updatedMachine);
    }

    @Override
    public void delete(Machine deleteMachine) {
        session.delete(deleteMachine);
    }
}
