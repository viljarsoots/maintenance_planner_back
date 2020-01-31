package com.maint.core.machinedao;

import com.maint.core.machinemodel.Machine;

import java.util.List;

public interface MachineDao {

    public Machine findById(Long id);

    public Long save (Machine newMachine);

    public List<Machine> findByName(String name);

    public void update (Machine updatedMachine);

    public void delete(Machine deleteMachine);
}
