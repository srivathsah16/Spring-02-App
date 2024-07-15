package com.ashokit.carapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CarAppConfigAutoWireConstructor.xml");
		Car car1 = context.getBean(Car.class);
		car1.drive();
//		System.out.println(car1.hashCode());
//		Car car2 = context.getBean(Car.class);
//		System.out.println(car2.hashCode());
//		System.out.println(car1.equals(car2));
	}
}
