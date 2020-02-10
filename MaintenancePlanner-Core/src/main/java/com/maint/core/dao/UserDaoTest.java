package com.maint.core.dao;

import com.maint.core.beans.UserDto;
import com.maint.core.config.AppConfig;
import com.maint.core.config.MaintAppConfig;
import com.maint.core.model.User;
import com.maint.core.service.UserService;
import com.maint.core.utils.BeanUtils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class UserDaoTest {

    @Test
    public void testViewAll(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService =context.getBean(UserService.class);

        List<User> allUsers = (List<User>) userService.viewAllUser();
        System.out.println(allUsers.toString());
    }
}
