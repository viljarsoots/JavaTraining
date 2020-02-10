package com.knits.spring.di.demo;

import com.knits.spring.common.maintService.MyService;
import com.knits.spring.common.service.ServiceWithCollections;
import com.knits.spring.common.service.UserService;
import com.knits.spring.common.utils.Mocks;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class DemoXmlConfiguration {

	public static void main(String[] args) {
		
//		demo01_getUserByType();
		demo02_getUserById();		
//		demo03_getUserByName();
//		demo04_getUserFrom_BeanFactory();
//		demo05_getUserFrom_ApplicationCtxImpls();
//		demo06_collectionInjection();
	}
	
	
	private static void demo01_getUserByType(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		UserService userService =  context.getBean(UserService.class);
		userService.save(Mocks.mockUser());
		
	}
	
	private static void demo02_getUserById(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
//		UserService userService = context.getBean("UserServiceBean",UserService.class);
//		userService.save(Mocks.mockUser());

		MyService myservice = context.getBean("myServiceName", MyService.class);
		myservice.findUsersByID(3);
	}

	private static void demo03_getUserByName(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		UserService userService =  context.getBean("UserServiceName",UserService.class);
		userService.save(Mocks.mockUser());
	}
	
//
//	private static void demo04_getUserFrom_BeanFactory(){
//		Resource res = new ClassPathResource("spring-beans.xml");
//        BeanFactory factory = new XmlBeanFactory(res);
//        UserService userService =  factory.getBean(UserService.class);
//        userService.save(Mocks.mockUser());
//	}
//
//
//	private static void demo05_getUserFrom_ApplicationCtxImpls(){
//		ApplicationContext context = new FileSystemXmlApplicationContext("C:/temp/Spring/Spring-100/spring-beans.xml");
//		UserService userService =  context.getBean(UserService.class);
//		userService.save(Mocks.mockUser());
//	}
	
	private static void demo06_collectionInjection(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		ServiceWithCollections service=context.getBean(ServiceWithCollections.class);
		log.info("List: {} ",service.getTechnologySkillsList().toString());
		log.info("Set: {} ",service.getTechnologySkillsSet().toString());
		log.info("Map: {} ",service.getTechnologySkillsMap().toString());
	}
}
