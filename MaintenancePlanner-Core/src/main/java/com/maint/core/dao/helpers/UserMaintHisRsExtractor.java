package com.maint.core.dao.helpers;

import com.maint.core.model.MaintenanceHistory;
import com.maint.core.model.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class UserMaintHisRsExtractor implements ResultSetExtractor<Map<Long, User>> {
    @Override
    public Map<Long, User> extractData(ResultSet rs) throws SQLException, DataAccessException {

        Map<Long, User> tableAsMap =new HashMap<>();
        while(rs.next()) {

            Long technicianId = rs.getLong("uid");
            User user = tableAsMap.get(technicianId);
            if (user == null){
                user= mapIntoNewUser(rs);
                tableAsMap.put(technicianId, user);
            }
            MaintenanceHistory maintenanceHistory = mapIntoMaintenanceHistory(rs);


        }

        return tableAsMap;

    }

    private User mapIntoNewUser(ResultSet rs)throws SQLException, DataAccessException{
        User user = new User();
        user.setId(rs.getLong("uid"));
        user.setFirstName(rs.getString("firstName"));
        user.setLastName(rs.getString("lastName"));

        return user;
    }
    private MaintenanceHistory mapIntoMaintenanceHistory(ResultSet rs) throws SQLException, DataAccessException{
        MaintenanceHistory maintenanceHistory = new MaintenanceHistory();

        maintenanceHistory.setId(rs.getLong("id"));
        maintenanceHistory.setMachineId(rs.getLong("machineId"));
        maintenanceHistory.setMaintenanceId(rs.getLong("maintenanceId"));
        maintenanceHistory.setLastMaintenanceDate(rs.getString("lastMaintenanceDate"));


        return maintenanceHistory;
    }



}
