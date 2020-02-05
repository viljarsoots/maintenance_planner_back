package com.maint.web;

import com.maint.core.config.MaintCoreContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;




@SpringBootApplication
@Import(value = {MaintCoreContext.class})
public class MaintApplication {

	public static void main(String[] args) {
		 SpringApplication.run(MaintApplication.class, args);
	}

}
