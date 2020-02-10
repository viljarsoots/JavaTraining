package com.knits.spring.di.demo;

import com.knits.spring.common.maintService.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class DemoXmlConfigurationMaint {

	public static void main(String[] args) {
		demo02_getUserById();

	}

	
	private static void demo02_getUserById(){
		ApplicationContext context = new ClassPathXmlApplicationContext("demo-beans.xml");
//		UserService userService = context.getBean("UserServiceBean",UserService.class);
//		userService.save(Mocks.mockUser());

		MyService myservice = context.getBean("myServiceName", MyService.class);
		myservice.findUsersByID(3);
	}

}
