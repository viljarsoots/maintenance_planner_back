package com.maint.core.dao;

import com.maint.core.dao.helpers.MaitenanceHistoryRowMapper;
import com.maint.core.dao.helpers.UserMaintHisRsExtractor;
import com.maint.core.dao.helpers.UserRowMapper;
import com.maint.core.maitenancehistory.MaintenanceHistory;
import com.maint.core.model.User;
import com.maint.core.userdto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.maint.core.dao.Queries.QUERY_ALL_MAINT;
import static com.maint.core.dao.Queries.USER_BY_ID;


@Repository
public class UserDaoJdbcSupportImpl extends JdbcDaoSupport implements UserDao{

	UserMaintHisRsExtractor userMaintHisRsExtractor = new UserMaintHisRsExtractor();

	@Autowired
	private UserRowMapper userRowMapper;
	
	@Autowired
	private DataSource dataSource;

	@Autowired
	private NamedParameterJdbcTemplate namedJdbcTemplate;

	@Autowired
	private MaitenanceHistoryRowMapper maitenanceHistoryRowMapper;
	
	
	
	@PostConstruct
	public void init(){
		this.setDataSource(dataSource);
	}

	@Override
	public User searchUserById(Long id) {

		return getJdbcTemplate().queryForObject(USER_BY_ID,new Object[] { id }, userRowMapper);

	}

	@Override
	public void saveUser(UserDto userDto) {
		getJdbcTemplate().update("INSERT INTO USER (firstName, lastName, email, startDate, userRoleId) values(?, ?, ?, ?, ?)",
				userDto.getFirstName(), userDto.getLastName(), userDto.getEmail(), userDto.getStartDate(),userDto.getUserRoleId()
		);
	}

	@Override
	public void updateUser(UserDto userDto) {
		getJdbcTemplate().update("UPDATE USER SET firstName = ?, lastName = ?, email = ?, startDate = ?, userRoleId = ? WHERE id = ?",
				userDto.getFirstName(), userDto.getLastName(), userDto.getEmail(), userDto.getStartDate(),userDto.getUserRoleId(), userDto.getId()
		);
	}

	@Override
	public void deleteUser(Long id) {
		getJdbcTemplate().update("delete from user where id = ?", id);
	}

	@Override
	public List<MaintenanceHistory> getUserWork(Long technicianId) {

		return (List<MaintenanceHistory>) getJdbcTemplate().query("SELECT * FROM maintenancehistory WHERE technicianId = ?" ,new Object[] {technicianId}, maitenanceHistoryRowMapper);

	}

	@Override
	public List<User> getUserMaintenances(Long id) {


		Map<Long, User> resultsetAsMap=getJdbcTemplate().query(QUERY_ALL_MAINT, new Long[]{id}, userMaintHisRsExtractor);
		return new ArrayList<User>(resultsetAsMap.values());

	}


}
