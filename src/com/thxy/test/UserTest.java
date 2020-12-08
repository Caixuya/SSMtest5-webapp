package com.thxy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thxy.service.UserServiceImpl;

public class UserTest {

	@Test
	public void sayHello() {
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserServiceImpl userService=applicationContext.getBean("userService",UserServiceImpl.class);
		userService.SayHello();
	}
	@Test
	public void testPNameSpace() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserServiceImpl userService=applicationContext.getBean("p",UserServiceImpl.class);
		userService.SayHello();		
	}
	@Test
	public void testsayHello() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserServiceImpl userService=applicationContext.getBean("p",UserServiceImpl.class);
		userService.say();		
	}
	
	
}
