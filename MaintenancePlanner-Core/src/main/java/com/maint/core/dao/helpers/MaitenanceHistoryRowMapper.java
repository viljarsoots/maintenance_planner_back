package com.maint.core.dao.helpers;

import com.maint.core.dao.UserDao;
import com.maint.core.dao.UserDaoJdbcSupportImpl;
import com.maint.core.maitenancehistory.MaintenanceHistory;
import com.maint.core.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
@Component
public class MaitenanceHistoryRowMapper implements RowMapper<MaintenanceHistory> {

    @Autowired
    private UserDaoJdbcSupportImpl userDaoJdbcSupport;

    @Autowired
    private UserDao userDao;

    @Override
    public MaintenanceHistory mapRow(ResultSet rs, int rowNum) throws SQLException {
        MaintenanceHistory maintenanceHistory = new MaintenanceHistory();
        maintenanceHistory.setId(rs.getLong("id"));
        maintenanceHistory.setMachineId(rs.getLong("machineId"));
        maintenanceHistory.setTechnicianId(rs.getLong("technicianId"));
        maintenanceHistory.setMaintenanceId(rs.getLong("maintenanceId"));
        maintenanceHistory.setLastMaintenanceDate(rs.getString("lastMaintenanceDate"));
        maintenanceHistory.setUser(userDaoJdbcSupport.searchUserById(rs.getLong("technicianId")));


        return maintenanceHistory;
    }
}


