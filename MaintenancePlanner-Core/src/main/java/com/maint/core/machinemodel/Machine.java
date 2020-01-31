package com.maint.core.machinemodel;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@NamedQueries({
        @NamedQuery(
                name = "Machine_ByName",
                query = "from Machine where machineName = :machineName"
        )
})

public class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String machineName;
    private String startupDate;
    private Long locationId;
    private Long maintenancePlanId;
    private Long machineProducerId;
}
