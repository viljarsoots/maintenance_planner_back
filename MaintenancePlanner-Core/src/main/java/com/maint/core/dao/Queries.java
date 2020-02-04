package com.maint.core.dao;

public class Queries {

	
	public static final String USER_BY_ID="select * from User where id=?";

	public static final String QUERY_ALL_MAINT="SELECT "+
			"U.id AS uid, " +
			"U.firstName, " +
			"U.lastName, " +
			"maint.id, " +
			"maint.machineId, " +
			"maint.maintenanceId, " +
			"maint.lastMaintenanceDate " +
			"FROM maintenancehistory maint INNER JOIN user U " +
			" ON U.id = maint.technicianId WHERE technicianId = ?";


}
