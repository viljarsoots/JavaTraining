package com.knits.spring.di.demo;

import com.knits.spring.common.maintService.MyService;
import com.knits.spring.common.service.UserService;
import com.knits.spring.common.utils.Mocks;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Maint {

	public static void main(String[] args) {

		//demo01_saveUser();
		demo02_getUserById();
	}

	private static void demo01_saveUser(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		context.getBean(UserService.class).save(Mocks.mockUser());
	}

	private static void demo02_getUserById(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-maint.xml");

		context.getBean(MyService.class).findUsersByID(3);
	}

}
