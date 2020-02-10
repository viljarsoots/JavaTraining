package com.knits.spring.di.demo;

import com.knits.spring.common.maintService.MyService;
import com.knits.spring.di.config.MaintConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class MaintJavaConfiguration {

	public static void main(String[] args) {
		demo02_getUserById();


	}

	private static void demo02_getUserById(){
		ApplicationContext context = new AnnotationConfigApplicationContext(MaintConfig.class);

		context.getBean(MyService.class).findUsersByID(3);
	}
	
	

}
