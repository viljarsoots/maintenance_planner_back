package com.maint.core.machinedao;

import com.maint.core.machinemodel.Machine;

public interface MachineDao {

    public Machine findById(Long id);

    public Long save (Machine newMachine);

}
