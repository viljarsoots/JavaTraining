package com.knits.spring.di.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.knits.spring.common.maintDao", "com.knits.spring.common.maintService" })
public class MaintConfig {



	/*
	@Bean
	public MaintUserDao maintUserDao(){
		UserDaoImpl userDao = new UserDaoImpl();
		userDao.setDbUsername("SomeUsername");
		userDao.setDbPassword("SomeSafePw");
		return userDao;

	}*/

	@Bean
	public BasicDataSource datasource() {

		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/maintenanceplanner");
		ds.setUsername("root");
		ds.setPassword("tere");
		ds.setMinIdle(5);
		ds.setMaxIdle(10);
		ds.setMaxOpenPreparedStatements(100);
		return ds;
	}
}
