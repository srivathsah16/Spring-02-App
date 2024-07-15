package com.ashokit.userapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("UserAppConfig.xml");
		UserService service = context.getBean(UserService.class);
		service.printName(1);
	}
}
