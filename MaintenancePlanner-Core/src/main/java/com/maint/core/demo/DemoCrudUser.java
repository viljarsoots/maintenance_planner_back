package com.maint.core.demo;

import com.maint.core.config.MaintAppConfig;
import com.maint.core.dao.UserDao;
import com.maint.core.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@Slf4j
public class DemoCrudUser {

	public static void main(String[] args) {
		
		
		demoDaoImplByName("userDaoJdbcSupportImpl");
//		demoDaoImplByName("userDaoJdbcTemplate");
//		demoDaoImplByName("userDaoNamedParametersJdbcTemplate");
		
	}
	
	
	private static void demoDaoImplByName(String daoBeanImpl){
		log.info("Running demoDaoImplByName for "+daoBeanImpl);
		ApplicationContext context = new AnnotationConfigApplicationContext(MaintAppConfig.class);
		UserDao userDao= context.getBean(daoBeanImpl,UserDao.class);
		User user= userDao.searchUserById(4L);
		System.out.println("Found "+user.toString());
	}

}
